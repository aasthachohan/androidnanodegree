package com.example.android.sciencequiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***********************************************ques 1*******************************************************/
    public void optionQues1(View v) {
        switch (v.getId()) {
            case R.id.onOption1A:
                displayRightResultForQues1();
                break;
            case R.id.onOption1B:
            case R.id.onOption1C:
            case R.id.onOption1D:
                displayWrongResultForQues1();
                break;
        }
    }

    public void displayRightResultForQues1() {
        TextView rightText = (TextView) findViewById(R.id.result_ques1);
        rightText.setText("A. Grafite is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score += 4;
    }

    public void displayWrongResultForQues1() {
        TextView wrongText1 = (TextView) findViewById(R.id.result_ques1);
        wrongText1.setText("WRONG ANSWER");
        wrongText1.setTextColor(Color.parseColor("#E53935"));
        score--;
    }

    /***********************************************ques 2*******************************************************/
    public void optionQues2(View v) {
        switch (v.getId()) {
            case R.id.onOption2A:
                displayRightResultForQues2();
                break;
            case R.id.onOption2B:
            case R.id.onOption2C:
            case R.id.onOption2D:
                displayWrongResultForQues2();
                break;
        }
    }

    public void displayRightResultForQues2() {
        TextView rightText = (TextView) findViewById(R.id.result_ques2);
        rightText.setText("A. Teflon is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score += 4;
    }

    public void displayWrongResultForQues2() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques2);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }

    /***********************************************ques 3*******************************************************/
    public void optionQues3(View v) {
        switch (v.getId()) {
            case R.id.onOption3B:
                displayRightResultForQues3();
                break;
            case R.id.onOption3A:
            case R.id.onOption3C:
            case R.id.onOption3D:
                displayWrongResultForQues3();
                break;
        }
    }

    public void displayRightResultForQues3() {
        TextView rightText = (TextView) findViewById(R.id.result_ques3);
        rightText.setText("B. Nitrogen is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score += 4;
    }

    public void displayWrongResultForQues3() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques3);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }

    /***********************************************ques 4*******************************************************/
    public void optionQues4(View v) {
        switch (v.getId()) {
            case R.id.onOption4C:
                displayRightResultForQues4();
                break;
            case R.id.onOption4B:
            case R.id.onOption4A:
            case R.id.onOption4D:
                displayWrongResultForQues4();
                break;
        }
    }

    public void displayRightResultForQues4() {
        TextView rightText = (TextView) findViewById(R.id.result_ques4);
        rightText.setText("C. Diamond is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score += 4;
    }

    public void displayWrongResultForQues4() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques4);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }

    /***********************************************ques 5*******************************************************/
    public void optionQues5(View v) {
        switch (v.getId()) {
            case R.id.onOption5D:
                displayRightResultForQues5();
                break;
            case R.id.onOption5B:
            case R.id.onOption5C:
            case R.id.onOption5A:
                displayWrongResultForQues5();
                break;
        }
    }

    public void displayRightResultForQues5() {
        TextView rightText = (TextView) findViewById(R.id.result_ques5);
        rightText.setText("D. Hydrogen is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score += 4;
    }

    public void displayWrongResultForQues5() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques5);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }
/**********************************************************ques 6************************************************************/

    public void displayRightResultForQues6() {
        TextView rightText = (TextView) findViewById(R.id.result_ques6);
        rightText.setText("2 is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score +=4;
    }

    public void displayWrongResultForQues6() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques6);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }
    /**********************************************************ques 6************************************************************/

    public void displayRightResultForQues7() {
        TextView rightText = (TextView) findViewById(R.id.result_ques7);
        rightText.setText("8 is correct answer");
        rightText.setTextColor(Color.parseColor("#388E3C"));
        score +=4;
    }

    public void displayWrongResultForQues7() {
        TextView wrongText = (TextView) findViewById(R.id.result_ques7);
        wrongText.setText("WRONG ANSWER");
        wrongText.setTextColor(Color.parseColor("#E53935"));
        score--;
    }


    /************************************************display result*****************************************************/

    public void declareResult(View v) {
        CheckBox feet = (CheckBox) findViewById(R.id.feet_checked);
        CheckBox ears = (CheckBox) findViewById(R.id.ears_checked);
        CheckBox eyes = (CheckBox) findViewById(R.id.eyes_checked);
        CheckBox nose = (CheckBox) findViewById(R.id.nose_checked);

        boolean feet_option = feet.isChecked();
        boolean ears_option = ears.isChecked();
        boolean eyes_option = eyes.isChecked();
        boolean nose_option = nose.isChecked();
        if ((!feet_option) && (ears_option) && (eyes_option) && (nose_option))
            score += 4;
        else
            score--;
        String ans6="2";
        TextView rightAns6 = (TextView) findViewById(R.id.result_ques6);
        rightAns6.setText(ans6);

        EditText editText6 = (EditText) findViewById(R.id.ansFor6Ques);
        String answer6 = editText6.getText().toString();
        if (answer6.equals(ans6))
            displayRightResultForQues6();
        else
            displayWrongResultForQues6();

        String ans7="8";
        TextView rightAns7 = (TextView) findViewById(R.id.result_ques7);
        rightAns7.setText(ans7);

        EditText editText7 = (EditText) findViewById(R.id.ansFor7Ques);
        String answer7 = editText7.getText().toString();
        if (answer7.equals(ans7))
            displayRightResultForQues7();
        else
            displayWrongResultForQues7();

        Toast.makeText(this, "Your score: " + score, Toast.LENGTH_SHORT).show();
        score=0;
    }
}