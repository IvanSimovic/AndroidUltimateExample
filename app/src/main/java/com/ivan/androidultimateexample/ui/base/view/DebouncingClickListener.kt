package com.ivan.androidultimateexample.ui.base.view

import android.view.View

fun View.setDebouncingOnClickListener(onClick: () -> Unit) {
    this.setOnClickListener(object : DebouncingOnClickListener() {
        override fun doClick(v: View?) {
            onClick()
        }
    })
}

abstract class DebouncingOnClickListener : View.OnClickListener {

    override fun onClick(v: View) {
        if (enabled) {
            enabled = false
            v.post(ENABLE_AGAIN)
            doClick(v)
        }
    }

    abstract fun doClick(v: View?)

    companion object {
        internal var enabled = true

        private val ENABLE_AGAIN = Runnable { enabled = true }
    }
}
