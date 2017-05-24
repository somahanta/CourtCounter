package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1;
    int score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score1=0;
        score2=0;
        displayForTeamA(score1);
        displayForTeamB(score2);
    }

    public void display3a(View view){
        score1+=3;
        displayForTeamA(score1);
    }
    public void display2a(View view){
        score1+=2;
        displayForTeamA(score1);
    }
    public void displayFreeA(View view){
        score1+=1;
        displayForTeamA(score1);
    }
    public void display3b(View view){
        score2+=3;
        displayForTeamB(score2);
    }
    public void display2b(View view){
        score2+=2;
        displayForTeamB(score2);
    }
    public void displayFreeB(View view){
        score2+=1;
        displayForTeamB(score2);
    }
    public void displayReset(View view){
        score1=0;
        score2=0;
        displayForTeamA(score1);
        displayForTeamB(score2);
    }
    public void displayForTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
