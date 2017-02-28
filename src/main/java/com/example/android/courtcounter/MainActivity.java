package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }
    public void addThreeA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void addTwoA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void addOneA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void addThreeB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void addTwoB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void addOneB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void resetScore(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
