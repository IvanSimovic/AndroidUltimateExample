package com.ivan.androidultimateexample.ui.util

import android.widget.TextView
import androidx.databinding.BindingAdapter
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

@BindingAdapter("android:text")
fun setText(view: TextView, date: LocalDateTime?) {
    val formatter: DateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME
    date?.let {
        view.text = date.format(formatter)
    }
}
