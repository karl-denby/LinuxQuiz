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

        // Question 1
        String q1_answer = getString(R.string.answer1);
        EditText q1_input = (EditText) findViewById(R.id.answer1);
        if (q1_input.getText().toString() == q1_answer) {
            correct_answers += 1;
        }

        // Question 2
        RadioButton q2_input = (RadioButton) findViewById(R.id.q2_radio_b);
        if (q2_input.isChecked()) {
            correct_answers += 1;
        }


        // Output the results
        Toast.makeText(this, "You scored " + correct_answers + "/10", Toast.LENGTH_LONG).show();
    }

}
