package com.example.csc415_uibasics

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private var mShowCount: TextView? = null
    private var zeroButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        zeroButton = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)

        toast.show()
    }

    fun countUp(view: View) {
        val green = ResourcesCompat.getColor(resources, R.color.green, null)
        val blue = ResourcesCompat.getColor(resources, R.color.blue, null)
        val primaryColor = ResourcesCompat.getColor(resources, R.color.colorPrimary, null)

        ++mCount
        mShowCount?.setText(mCount.toString())

        zeroButton?.setBackgroundColor(primaryColor)

        if (mCount % 2 == 0) {
            view.setBackgroundColor(blue)
        }
        else {
            view.setBackgroundColor(green)
        }
    }

    fun zeroOutCount(view: View) {
        val grey = ResourcesCompat.getColor(resources, R.color.grey, null)

        mShowCount?.setText("0")
        mCount = 0

        view.setBackgroundColor(grey)
    }
}