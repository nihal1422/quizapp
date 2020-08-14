package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double marks=0;

    Button submitbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitbutton = (Button) findViewById(R.id.Submit);

        final CheckBox ch = (CheckBox) findViewById(R.id.rajasthan);
        final CheckBox ch1 = (CheckBox) findViewById(R.id.bihar);
        final CheckBox p1 = (CheckBox)findViewById(R.id.delhi);
        final CheckBox p2 = (CheckBox)findViewById(R.id.manila);
        ch.setChecked(false);
        ch1.setChecked(false);

        ch.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch.isChecked() == true) {
                    marks = marks + 0.5;
                }
            }
        });
        ch1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch1.isChecked() == true) {
                    marks = marks + 0.5;
                }
            }
        });

        final CheckBox ch2 = (CheckBox) findViewById(R.id.vienna);
        final CheckBox ch3 = (CheckBox) findViewById(R.id.geneva);
        final CheckBox ch4 = (CheckBox) findViewById(R.id.nairobi);
        final CheckBox ch5 = (CheckBox) findViewById(R.id.newyork);
        ch2.setChecked(false);
        ch3.setChecked(false);
        ch4.setChecked(false);
        ch5.setChecked(false);

        ch2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch2.isChecked() == true) {
                    marks = marks + 0.25;
                }
            }
        });
        ch3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch3.isChecked() == true) {
                    marks = marks + 0.25;
                }
            }
        });
        ch4.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch4.isChecked() == true) {
                    marks = marks + 0.25;
                }
            }
        });
        ch5.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (ch5.isChecked() == true) {
                    marks = marks + 0.25;
                }
            }
        });


        final EditText editText = (EditText) findViewById(R.id.ans);
        final EditText editText1 = (EditText) findViewById(R.id.name);




        final RadioGroup rg = (RadioGroup) findViewById(R.id.google);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.sundar:
                        marks=marks+1;
                        break;
                }
            }
        });
        final RadioGroup rj = (RadioGroup) findViewById(R.id.china);

        rj.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.wuhan:
                        marks=marks+1;
                        break;
                }
            }
        });

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(editText.getText().toString().equals("Asia")) {
                            marks = marks + 1;
                }
                if (rg.getCheckedRadioButtonId() == -1|| rj.getCheckedRadioButtonId()== -1) {
                    Toast.makeText(getApplicationContext(), "Please select all the choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getApplicationContext(), "Marks = " + marks, Toast.LENGTH_LONG).show();
                

                rg.clearCheck();
                rj.clearCheck();
                ch.setChecked(false);
                ch1.setChecked(false);
                ch2.setChecked(false);
                ch3.setChecked(false);
                ch4.setChecked(false);
                ch5.setChecked(false);
                p1.setChecked(false);
                p2.setChecked(false);
                editText.setText("");
                editText1.setText("");

                marks = 0;
            }
        });
}

}