package com.example.basicconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import org.angmarch.views.NiceSpinner
import org.angmarch.views.OnSpinnerItemSelectedListener
import org.apache.commons.lang3.StringUtils
import java.util.*

class MainActivity : AppCompatActivity() {
    private var strinput = ""
    private var item = "Kilograms"
    private var item1 = "Kilograms"
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardView = findViewById<CardView>(R.id.cardView)
        val button2 = findViewById<Button>(R.id.button2)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button9 = findViewById<Button>(R.id.button9)
        val button8 = findViewById<Button>(R.id.button8)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button15 = findViewById<Button>(R.id.button15)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)
        val button16 = findViewById<Button>(R.id.button16)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.visibility = View.GONE
        button16.visibility = View.GONE
        val niceSpinner = findViewById<NiceSpinner>(R.id.nice_spinner)
        val dataset: List<String> = LinkedList(listOf("Kilograms", "Grams", "Pounds", "Ounces"))
        niceSpinner.attachDataSource(dataset)
        niceSpinner.onSpinnerItemSelectedListener = OnSpinnerItemSelectedListener { parent: NiceSpinner, _: View?, position: Int, _: Long -> item = parent.getItemAtPosition(position).toString() }
        val niceSpinner1 = findViewById<NiceSpinner>(R.id.nice_spinner1)
        val dataset1: List<String> = LinkedList(listOf("Kilograms", "Grams", "Pounds", "Ounces"))
        niceSpinner1.attachDataSource(dataset1)
        niceSpinner1.onSpinnerItemSelectedListener = OnSpinnerItemSelectedListener { parent: NiceSpinner, _: View?, position: Int, _: Long -> item1 = parent.getItemAtPosition(position).toString() }
        button4.setOnClickListener {
            strinput += "1"
            textView4.text = "Weight - $strinput"
        }
        button5.setOnClickListener {
            strinput += "2"
            textView4.text = "Weight - $strinput"
        }
        button6.setOnClickListener {
            strinput += "3"
            textView4.text = "Weight - $strinput"
        }
        button7.setOnClickListener {
            strinput += "4"
            textView4.text = "Weight - $strinput"
        }
        button9.setOnClickListener {
            strinput += "5"
            textView4.text = "Weight - $strinput"
        }
        button8.setOnClickListener {
            strinput += "6"
            textView4.text = "Weight - $strinput"
        }
        button10.setOnClickListener {
            strinput += "7"
            textView4.text = "Weight - $strinput"
        }
        button11.setOnClickListener {
            strinput += "8"
            textView4.text = "Weight - $strinput"
        }
        button12.setOnClickListener {
            strinput += "9"
            textView4.text = "Weight - $strinput"
        }
        button15.setOnClickListener {
            strinput = ""
            textView4.text = "Weight - 0"
        }
        button13.setOnClickListener {
            strinput += "0"
            textView4.text = "Weight - $strinput"
        }
        button14.setOnClickListener {
            strinput = StringUtils.chop(strinput)
            textView4.text = "Weight - $strinput"
        }
        button2.setOnClickListener {
            button2.visibility = View.GONE
            cardView.visibility = View.GONE
            button16.visibility = View.VISIBLE
            if (strinput == "") {
                strinput = "0"
                textView4.text = "Weight - 0"
            }
            var outputvalue = strinput.toDouble()
            textView5.visibility = View.VISIBLE
            if (item == item1) {
                textView5.text = outputvalue.toString()
            }
            if (item == "Kilograms" && item1 == "Grams") {
                outputvalue *= 1000.0
                textView5.text = (outputvalue).toString()
            }
            if (item == "Kilograms" && item1 == "Pounds") {
                outputvalue *= 2.205
                textView5.text = (outputvalue).toString()
            }
            if (item == "Kilograms" && item1 == "Ounces") {
                outputvalue *= 35.274
                textView5.text = (outputvalue).toString()
            }
            if (item == "Grams" && item1 == "Kilograms") {
                outputvalue /= 1000.0
                textView5.text = (outputvalue).toString()
            }
            if (item == "Grams" && item1 == "Pounds") {
                outputvalue /= 454.0
                textView5.text = (outputvalue).toString()
            }
            if (item == "Grams" && item1 == "Ounces") {
                outputvalue /= 28.35
                textView5.text = (outputvalue).toString()
            }
            if (item == "Pounds" && item1 == "Kilograms") {
                outputvalue /= 2.205
                textView5.text = (outputvalue).toString()
            }
            if (item == "Pounds" && item1 == "Grams") {
                outputvalue *= 454.0
                textView5.text = (outputvalue).toString()
            }
            if (item == "Pounds" && item1 == "Ounces") {
                outputvalue *= 16.0
                textView5.text = (outputvalue).toString()
            }
            if (item == "Ounces" && item1 == "Kilograms") {
                outputvalue /= 35.274
                textView5.text = outputvalue.toString()
            }
            if (item == "Ounces" && item1 == "Grams") {
                outputvalue *= 28.35
                textView5.text = outputvalue.toString()
            }
            if (item == "Ounces" && item1 == "Pounds") {
                outputvalue /= 16.0
                textView5.text = outputvalue.toString()
            }
        }
        button16.setOnClickListener {
            strinput = ""
            textView4.text = "Weight - 0"
            button2.visibility = View.VISIBLE
            button16.visibility = View.GONE
            textView5.visibility = View.GONE
            cardView.visibility = View.VISIBLE
        }
    }
}