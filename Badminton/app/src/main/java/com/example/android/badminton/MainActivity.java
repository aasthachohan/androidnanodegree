package com.example.android.badminton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePersonA = 0;
    int scorePersonB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     *
     ********************************************** display for person A**************************************************************
     *
     *
     */
    public void displayForPersonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_A_score);
        scoreView.setText(String.valueOf(score));
    }
    public void pointForPersonA(View v)
    {
        if (scorePersonA <= 20) {
            scorePersonA = scorePersonA + 1;
            displayForPersonA(scorePersonA);
        }
        }

    public void foulForPersonA(View v)
    {
        if (scorePersonA <= 20) {
        scorePersonB=scorePersonB+1;
        displayForPersonB(scorePersonB);}
    }
    public void letA(View v)
    {
        displayForPersonA(scorePersonA);
    }
    /**
     *
     *
     ********************************************** display for person B**************************************************************
     *
     *
     */
    public void displayForPersonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_B_score);
        scoreView.setText(String.valueOf(score));
    }

    public void pointForPersonB(View v)
    {
        if (scorePersonB <= 20) {
        scorePersonB = scorePersonB + 1;
        displayForPersonB(scorePersonB);}
    }

    public void foulForPersonB(View v)
    {
        if (scorePersonB <= 20) {
        scorePersonA=scorePersonA+1;
        displayForPersonA(scorePersonA);}
    }
    public void letB(View v)
    {
        displayForPersonB(scorePersonB);
    }

    /**
     *
     *
     **************************************************** RESET *******************************************************************
     *
     *
     */

    public void reset(View v)
    {
        scorePersonA=0;
        scorePersonB=0;
        displayForPersonB(scorePersonB);
        displayForPersonA(scorePersonA);
        results(" ");
    }

    public void results(String score) {
        TextView scoreView = (TextView) findViewById(R.id.result);
        scoreView.setText(String.valueOf(score));
    }
    public void displayResults(View v) {
        if(scorePersonA > scorePersonB)
            results("PERSON A WONS by "  +(scorePersonA-scorePersonB) + " points");
        else if (scorePersonB > scorePersonA)
            results("PERSON B WONS by " +(scorePersonB-scorePersonA) + " points");
        else
            results("TIE");
    }

}