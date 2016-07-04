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

    /**
     * Check if the questions are right
     *
     * @return 1 if correct 0 if not
     */
    private int check_question1 () {
        // Question 1 - Edit Text
        String q1_answer = getString(R.string.answer1);
        EditText q1_input = (EditText) findViewById(R.id.answer1);
        if (q1_input.getText().toString().toUpperCase().equals(q1_answer.toUpperCase())) {
            return 1;
        } else {
            return 0;
        }
    }

    private int check_question2 () {
        // Question 2 - RadioButton
        RadioButton q2_input = (RadioButton) findViewById(R.id.q2_radio_b);
        if (q2_input.isChecked()) {
            return 1;
        } else {
            return 0;
        }
    }

    private int check_question3 () {
        // Questions 3 - CheckBoxes
        CheckBox q3_input_a = (CheckBox) findViewById(R.id.q3_checkbox_a);
        CheckBox q3_input_b = (CheckBox) findViewById(R.id.q3_checkbox_b);
        CheckBox q3_input_c = (CheckBox) findViewById(R.id.q3_checkbox_c);

        if (q3_input_a.isChecked() && q3_input_b.isChecked() && q3_input_c.isChecked()) {
            return 1;
        } else {
            return 0;
        }
    }

    private int check_question4 () {
        // Question 4 - Edit Text
        String q4_answer = getString(R.string.answer4);
        EditText q4_input = (EditText) findViewById(R.id.answer4);
        if (q4_input.getText().toString().toUpperCase().equals(q4_answer.toUpperCase())) {
            return 1;
        } else {
            return 0;
        }
    }

    private int check_question5 () {
        // Question 5
        CheckBox q5_input_a = (CheckBox) findViewById(R.id.q5_checkbox_a);
        CheckBox q5_input_b = (CheckBox) findViewById(R.id.q5_checkbox_b);
        CheckBox q5_input_c = (CheckBox) findViewById(R.id.q5_checkbox_c);

        if (!q5_input_a.isChecked() && q5_input_b.isChecked() && q5_input_c.isChecked()) {
            return 1;
        } else {
            return 0;
        }
    }

    private int check_question6 () {
        // Question 6
        String q6_answer = getString(R.string.answer6);
        EditText q6_input = (EditText) findViewById(R.id.answer6);
        if (q6_input.getText().toString().toUpperCase().equals(q6_answer.toUpperCase())) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Get results and display them as a TOAST.
     */
    public void checkAnswers(View view) {
        int correct_answers = 0;

        // check answer for each question
        correct_answers += check_question1();
        correct_answers += check_question2();
        correct_answers += check_question3();
        correct_answers += check_question4();
        correct_answers += check_question5();
        correct_answers += check_question6();

        // Output the results
        Toast.makeText(this, "You scored " + correct_answers + "/6", Toast.LENGTH_LONG).show();
    }

}
