package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscore.R;

public class MainActivity extends AppCompatActivity {

    int broncos = 0;
    int guests = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * This button adds six to the score for team A.
     */
    public void touchdownA(View view){
        broncos = broncos + 6;
        displayForTeamA(broncos);
    }


    /**
     *
     * This button adds three to the score for team A.
     */
    public void fieldGoalA(View view){
        broncos = broncos + 3;
        displayForTeamA(broncos);
    }


    /**
     *
     * This button adds two to the score for team A.
     */
    public void safetyA(View view){
        broncos = broncos + 2;
        displayForTeamA(broncos);
    }

    /**
     *
     * This button adds one to the score for team A.
     */
    public void extraPointA(View view){
        broncos = broncos + 1;
        displayForTeamA(broncos);
    }

    /**
     * Displays the given score for team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.broncos_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     *
     * This button adds three to the score for team B.
     */
    public void touchdownB(View view){
        guests = guests + 6;
        displayForTeamB(guests);
    }


    /**
     *
     * This button adds two to the score for team B.
     */
    public void fieldGoalB(View view){
        guests = guests + 3;
        displayForTeamB(guests);
    }


    /**
     *
     * This button adds one to the score for team B.
     */
    public void safetyB(View view){
        guests = guests + 2;
        displayForTeamB(guests);
    }

    /**
     *
     * This button adds one to the score for team B.
     */
    public void extraPointB(View view){
        guests = guests + 1;
        displayForTeamB(guests);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guests_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * This button resets the scores to 0.
     */
    public void resetScore(View view){
        broncos = 0;
        guests = 0;
        displayForTeamA(broncos);
        displayForTeamB(guests);
    }


}
