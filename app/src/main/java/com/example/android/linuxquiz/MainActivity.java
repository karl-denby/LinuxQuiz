package com.example.android.linuxquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int correct_answers = 0;

        // Question 1 - Edit Text
        String q1_answer = getString(R.string.answer1);
        EditText q1_input = (EditText) findViewById(R.id.answer1);
        if (q1_input.getText().toString().equals(q1_answer)) {
            correct_answers += 1;
        }

        // Question 2 - RadioButton
        RadioButton q2_input = (RadioButton) findViewById(R.id.q2_radio_b);
        if (q2_input.isChecked()) {
            correct_answers += 1;
        }

        // Questions 3 - CheckBoxes
        CheckBox q3_input_a = (CheckBox) findViewById(R.id.q3_checkbox_a);
        CheckBox q3_input_b = (CheckBox) findViewById(R.id.q3_checkbox_b);
        CheckBox q3_input_c = (CheckBox) findViewById(R.id.q3_checkbox_c);

        if (q3_input_a.isChecked() && q3_input_b.isChecked() && q3_input_c.isChecked()) {
            correct_answers += 1;
        }

        // Question 4 - Edit Text
        String q4_answer = getString(R.string.answer4);
        EditText q4_input = (EditText) findViewById(R.id.answer4);
        if (q4_input.getText().toString().equals(q4_answer)) {
            correct_answers += 1;
        }

        // Question 5
        CheckBox q5_input_a = (CheckBox) findViewById(R.id.q5_checkbox_a);
        CheckBox q5_input_b = (CheckBox) findViewById(R.id.q5_checkbox_b);
        CheckBox q5_input_c = (CheckBox) findViewById(R.id.q5_checkbox_c);

        if (!q5_input_a.isChecked() && q5_input_b.isChecked() && q5_input_c.isChecked()) {
            correct_answers += 1;
        }

        // Question 6
        String q6_answer = getString(R.string.answer6);
        EditText q6_input = (EditText) findViewById(R.id.answer6);
        if (q6_input.getText().toString().equals(q6_answer)) {
            correct_answers += 1;
        }

        // Question 7
        //correct_answers += 1;

        // Question 8
        //correct_answers += 1;

        // Question 9
        //correct_answers += 1;

        // Question 10
        //correct_answers += 1;

        // Output the results
        Toast.makeText(this, "You scored " + correct_answers + "/6", Toast.LENGTH_LONG).show();
    }

}
