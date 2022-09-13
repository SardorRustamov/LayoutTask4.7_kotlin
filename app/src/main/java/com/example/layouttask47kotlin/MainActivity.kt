package com.example.layouttask47kotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.Spannable
import android.text.SpannableString
import android.text.TextWatcher
import android.text.style.ForegroundColorSpan
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        func_1()
        func_2()
        addTextChangedListener_T()
        setOnKeyL()
    }

    private fun setOnKeyL() {
        val setOnKeyListener_id = findViewById<EditText>(R.id.setOnKeyListener_id)
        val addTextChangedListener_textview =
            findViewById<TextView>(R.id.addTextChangedListener_textview)

        setOnKeyListener_id.setOnKeyListener { view, i, keyEvent ->
            val s = setOnKeyListener_id.text.toString()
            addTextChangedListener_textview.text = s
            false
        }

    }

    private fun addTextChangedListener_T() {

        val addTextChangedListener_id = findViewById<EditText>(R.id.addTextChangedListener_id)
        val addTextChangedListener_textview =
            findViewById<TextView>(R.id.addTextChangedListener_textview)

        addTextChangedListener_id.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                val s = addTextChangedListener_id.text.toString()
                addTextChangedListener_textview.text = s
            }

            override fun afterTextChanged(editable: Editable) {}
        })

    }

    private fun func_2() {
        var count_1: Int
        var count_2: Int
        val textView_1 = findViewById<TextView>(R.id.text_view)
        val text1 = " I would #like to do #something similar to the #Twitter app "

        val spannable: Spannable = SpannableString(text1)

        count_1 = text1.indexOf('#')
        count_2 = text1.indexOf(" ", count_1)
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            count_1,
            count_2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        count_1 = text1.indexOf('#', count_2)
        count_2 = text1.indexOf(" ", count_1)
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            count_1,
            count_2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        count_1 = text1.indexOf('#', count_2)
        count_2 = text1.indexOf(" ", count_1)
        spannable.setSpan(
            ForegroundColorSpan(Color.GREEN),
            count_1,
            count_2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView_1.text = spannable

    }

    private fun func_1() {
        var count_1: Int
        var count_2: Int
        val textView_2 = findViewById<TextView>(R.id.text_view_2)
        val text1 = " I would like to do something similar to the https://twitter.com app "


        count_1 = text1.indexOf("http")
        count_2 = text1.indexOf(" ", count_1)


        val spannable: Spannable = SpannableString(text1)
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            count_1,
            count_2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textView_2.text = spannable

    }
}