package com.ivan.androidultimateexample.ui.util

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.text.InputType
import android.widget.EditText
import org.threeten.bp.LocalDateTime

fun EditText.setUpAsDateTimePicker(
    updateDate: (LocalDateTime) -> Unit,
    dt: LocalDateTime?
) {
    this.isClickable = true
    this.inputType = InputType.TYPE_NULL

    dt?.let {
        this.setText("${dt.year}/${dt.monthValue}/${dt.dayOfMonth} ${dt.hour}:${dt.minute}")
    }

    val dateTime = dt ?: LocalDateTime.now()
    this.setOnClickListener {
        DatePickerDialog(context, DatePickerDialog.OnDateSetListener { _, year, m, day ->
            TimePickerDialog(context, TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                val month = m + 1
                updateDate(LocalDateTime.of(year, month + 1, day, hour, minute))
                this.setText("$year/$month/$day $hour:$minute")
            }, dateTime.hour, dateTime.minute, false).show()
        }, dateTime.year, dateTime.monthValue, dateTime.dayOfMonth).show()
    }
}
