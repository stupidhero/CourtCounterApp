package com.example.android.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int yellowA=0,  yellowB =  0, redA = 0 , redB = 0 , goalA=0 , goalB = 0 , penaltyA = 0 , penaltyB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            int[] temp = savedInstanceState.getIntArray("myValues");
            yellowA = temp[0];
            yellowB = temp[1];
            redA = temp[2];
            redB = temp[3];
            goalA = temp[4];
            goalB = temp[5];
            penaltyA = temp[6];
            penaltyB = temp[7];
            displayYellowB(yellowB);
            displayScoreB(goalB + penaltyB);
            displayRedB(redB);
            displayRedA(redA);
            displayPenaltyB(penaltyB);
            displayGoalB(goalB);
            displayScoreA(goalA + penaltyA);
            displayGoalA(goalA);
            displayYellowA(yellowA);
            displayPenaltyA(penaltyA);
        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        int[] temp = { yellowA, yellowB, redA, redB, goalA, goalB, penaltyA, penaltyB};
        outState.putIntArray ("myValues", temp);
    }

    private void displayScoreA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_team_A);
        quantityTextView.setText("" + number);
    }

    private void displayGoalA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.goals_team_A);
        quantityTextView.setText("" + number);
    }

    private void displayPenaltyA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.penalty_team_A);
        quantityTextView.setText("" + number);
    }

    private void displayYellowA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.yellow_team_A);
        quantityTextView.setText("" + number);
    }

    private void displayRedA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.red_team_A);
        quantityTextView.setText("" + number);
    }

    private void displayScoreB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.score_team_B);
        quantityTextView.setText("" + number);
    }

    private void displayGoalB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.goals_team_B);
        quantityTextView.setText("" + number);
    }

    private void displayPenaltyB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.penalty_team_B);
        quantityTextView.setText("" + number);
    }

    private void displayYellowB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.yellow_team_B);
        quantityTextView.setText("" + number);
    }

    private void displayRedB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.red_team_B);
        quantityTextView.setText("" + number);
    }

    public void goals_team_A(View v) {
        goalA += 1;
        displayGoalA(goalA);
        displayScoreA(goalA + penaltyA);
    }

    public void penalty_team_A(View v) {
        penaltyA += 1;
        displayPenaltyA(penaltyA);
        displayScoreA(goalA + penaltyA);
    }

    public void yellow_A(View v) {
        yellowA += 1;
        displayYellowA(yellowA);
    }

    public void red_A(View v) {
        redA += 1;
        displayRedA(redA);
    }

    public void goals_team_B(View v) {
        goalB += 1;
        displayGoalB(goalB);
        displayScoreB(goalB + penaltyB);
    }

    public void penalty_team_B(View v) {
        penaltyB += 1;
        displayPenaltyB(penaltyB);
        displayScoreB(goalB + penaltyB);
    }

    public void yellow_B(View v) {
        yellowB += 1;
        displayYellowB(yellowB);
    }

    public void red_B(View v) {
        redB += 1;
        displayRedB(redB);
    }

    public void resetScore(View v) {
        redA= redB= yellowA= yellowB= penaltyA= penaltyB= goalA= goalB = 0;
        displayPenaltyA(0);
        displayYellowA(0);
        displayGoalA(0);
        displayScoreA(0);
        displayGoalB(0);
        displayPenaltyB(0);
        displayRedA(0);
        displayRedB(0);
        displayScoreB(0);
        displayYellowB(0);
    }

}
