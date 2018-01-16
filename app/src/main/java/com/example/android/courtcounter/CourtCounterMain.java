package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounterMain extends AppCompatActivity {
    int teamA_Points = 0;
    int teamB_Points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter_main);
    }

    public void displayScoreA(int Score){
        TextView scoreView = findViewById(R.id.score_view_A);
        scoreView.setText(""+Score);
    }

    public void displayScoreB(int Score){
        TextView scoreView = findViewById(R.id.score_view_B);
        scoreView.setText(""+Score);
    }

    public void increment_threeA(View view){
        teamA_Points+=3;
        displayScoreA(teamA_Points);
    }

    public void increment_twoA(View view){
        teamA_Points+=2;
        displayScoreA(teamA_Points);
    }

    public void increment_oneA(View view){
        teamA_Points+=1;
        displayScoreA(teamA_Points);
    }

    public void increment_threeB(View view){
        teamB_Points+=3;
        displayScoreB(teamB_Points);
    }

    public void increment_twoB(View view){
        teamB_Points+=2;
        displayScoreB(teamB_Points);
    }

    public void increment_oneB(View view){
        teamB_Points+=1;
        displayScoreB(teamB_Points);
    }

    public void reset(View view){
        teamA_Points = 0;
        teamB_Points = 0;
        displayScoreA(teamA_Points);
        displayScoreB(teamB_Points);
    }

}
