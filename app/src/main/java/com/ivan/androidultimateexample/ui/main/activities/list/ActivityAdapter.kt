package com.ivan.androidultimateexample.ui.main.activities.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ivan.androidultimateexample.databinding.ActivityItemBinding
import com.ivan.todoengine.logic.task.Activity

class ActivityAdapter : RecyclerView.Adapter<ActivityViewHolder>(),
    ActivityModel.RowClickListener {

    private val rowModels = ArrayList<ActivityModel>()
    private var rowClickListener: ActivityModel.RowClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        return ActivityViewHolder(
            ActivityItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        holder.setModel(rowModels[position])
    }

    override fun getItemCount(): Int {
        return rowModels.size
    }

    fun refreshData(data: List<Activity>) {
        this.rowModels.clear()
        this.rowModels.addAll(data.toRowModels(this))
        this.notifyDataSetChanged()
    }

    fun setRowClickListener(rowClickListener: ActivityModel.RowClickListener) {
        this.rowClickListener = rowClickListener
    }

    override fun onRowClicked(activity: Activity) {
        if (rowClickListener != null) {
            rowClickListener!!.onRowClicked(activity)
        }
    }
}

class ActivityViewHolder(private val binding: ActivityItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun setModel(rowModel: ActivityModel) {
        binding.rowModel = rowModel
    }
}
