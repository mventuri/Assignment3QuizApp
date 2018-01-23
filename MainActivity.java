package com.example.marcoventuri.quizappusa;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton q1_answer3;
    // Question 2
    EditText q2_answer;
    // Question 3
    CheckBox q3_answer1;
    CheckBox q3_answer2;
    // Question 4
    EditText q4_answer;
    // Question 5
    RadioButton q5_answer3;
    // Question 6
    CheckBox q6_answer1;
    CheckBox q6_answer2;
    CheckBox q6_answer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.q6_answer3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int final_score;


        /* Question 1 - Answer: Washington */

        Boolean answer1;

        q1_answer3 = (RadioButton) this.findViewById(R.id.q1_answer3);
        answer1 = q1_answer3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        /* Question 2 - Answer: 1776 */

        String answer2;
        q2_answer = (EditText) this.findViewById(R.id.q2_answer);
        answer2 = q2_answer.getText().toString();
        if (answer2.equals("1776")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        /* Question 3 - Answers: Los Angeles && San Francisco */

        Boolean answer3_choice1;
        Boolean answer3_choice2;
        q3_answer1 = (CheckBox) this.findViewById(R.id.q3_answer1);
        q3_answer2 = (CheckBox) this.findViewById(R.id.q3_answer2);
        answer3_choice1 = q3_answer1.isChecked();
        answer3_choice2 = q3_answer2.isChecked();
        if (answer3_choice1 && answer3_choice2) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        /* Question 4 - Answer: Trump */

        String answer4;
        q4_answer = (EditText) this.findViewById(R.id.q4_answer);
        answer4 = q4_answer.getText().toString().toLowerCase();
        if (answer4.equals("trump")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        /* Question 5 - Answer: Albuquerque */

        Boolean answer5;
        q5_answer3 = (RadioButton) this.findViewById(R.id.q5_answer3);
        answer5 = q5_answer3.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        /* Question 1 - Answers: All  */

        Boolean answer6_choice1;
        Boolean answer6_choice2;
        Boolean answer6_choice3;
        q6_answer1 = (CheckBox) this.findViewById(R.id.q6_answer1);
        q6_answer2 = (CheckBox) this.findViewById(R.id.q6_answer2);
        q6_answer3 = (CheckBox) this.findViewById(R.id.q6_answer3);
        answer6_choice1 = q6_answer1.isChecked();
        answer6_choice2 = q6_answer2.isChecked();
        answer6_choice3 = q6_answer3.isChecked();

        if (answer6_choice1 && answer6_choice2 && answer6_choice3) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }


        /* Score */
       
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score;

        if (final_score == 6) {
            resultsDisplay = "Uncle Sam is proud of You! 6 out of 6!";
        } else {
            resultsDisplay = "You should study more. " + final_score + " out of 6 " + "is not enough!";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
