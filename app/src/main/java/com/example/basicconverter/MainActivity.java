package com.example.basicconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import org.apache.commons.lang3.StringUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.angmarch.views.NiceSpinner;
import org.angmarch.views.OnSpinnerItemSelectedListener;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String str_input="";
    String item="Kilograms";
    Double output_value;
    String item1="Kilograms";
    Button button2, button4, button5, button6, button7, button9, button8, button10, button11, button12, button15, button13, button14, button16;
    TextView textView4, textView5;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView=findViewById(R.id.cardView);
        button2=findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button15 = findViewById(R.id.button15);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button16 = findViewById(R.id.button16);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView5.setVisibility(View.GONE);
        button16.setVisibility(View.GONE);
        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);
        List<String> dataset = new LinkedList<>(Arrays.asList("Kilograms", "Grams", "Pounds", "Ounces"));
        niceSpinner.attachDataSource(dataset);
        niceSpinner.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                item = parent.getItemAtPosition(position).toString();
            }
        });

        NiceSpinner niceSpinner1 = (NiceSpinner) findViewById(R.id.nice_spinner1);
        List<String> dataset1 = new LinkedList<>(Arrays.asList("Kilograms", "Grams", "Pounds", "Ounces"));
        niceSpinner1.attachDataSource(dataset);
        niceSpinner1.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                item1 = parent.getItemAtPosition(position).toString();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="1";
                textView4.setText("Weight - "+str_input);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="2";
                textView4.setText("Weight - "+str_input);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="3";
                textView4.setText("Weight - "+str_input);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="4";
                textView4.setText("Weight - "+str_input);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="5";
                textView4.setText("Weight - "+str_input);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="6";
                textView4.setText("Weight - "+str_input);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="7";
                textView4.setText("Weight - "+str_input);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="8";
                textView4.setText("Weight - "+str_input);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="9";
                textView4.setText("Weight - "+str_input);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input="";
                textView4.setText("Weight - 0");
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input+="0";
                textView4.setText("Weight - "+str_input);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input=StringUtils.chop(str_input);
                textView4.setText("Weight - "+str_input);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                button2.setVisibility(View.GONE);
                cardView.setVisibility(View.GONE);
                button16.setVisibility(View.VISIBLE);
                if(str_input.equals("")){
                    str_input="0";
                    textView4.setText("Weight - 0");
                }
                output_value = Double.parseDouble(str_input);
                textView5.setVisibility(View.VISIBLE);
                if(item.equals(item1)){
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Kilograms") && item1.equals("Grams")){
                    output_value*=1000;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Kilograms") && item1.equals("Pounds")){
                    output_value*=2.205;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Kilograms") && item1.equals("Ounces")){
                    output_value*=35.274;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Grams") && item1.equals("Kilograms")){
                    output_value/=1000;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Grams") && item1.equals("Pounds")){
                    output_value/=454;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Grams") && item1.equals("Ounces")){
                    output_value/=28.35;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Pounds") && item1.equals("Kilograms")){
                    output_value/=2.205;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Pounds") && item1.equals("Grams")){
                    output_value*=454;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Pounds") && item1.equals("Ounces")){
                    output_value*=16;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Ounces") && item1.equals("Kilograms")){
                    output_value/=35.274;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Ounces") && item1.equals("Grams")){
                    output_value*=28.35;
                    textView5.setText(Double.toString(output_value));
                }

                if(item.equals("Ounces") && item1.equals("Pounds")){
                    output_value/=16;
                    textView5.setText(Double.toString(output_value));
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_input="";
                textView4.setText("Weight - 0");
                button2.setVisibility(View.VISIBLE);
                button16.setVisibility(View.GONE);
                textView5.setVisibility(View.GONE);
                cardView.setVisibility(View.VISIBLE);
            }
        });
    }
}