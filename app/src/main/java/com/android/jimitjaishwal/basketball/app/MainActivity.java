package com.android.jimitjaishwal.basketball.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void addTreePointForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamAScore(scoreTeamA);
    }

    public void addTwoPointForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamAScore(scoreTeamA);
    }

    public void addOnePointForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamAScore(scoreTeamA);
    }

    public void displayForTeamAScore(int score){
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(score));
    }

    public void displayForTeamBScore(int score){
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(score));
    }

    public void addTreePointForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamBScore(scoreTeamB);
    }

    public void addTwoPointForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamBScore(scoreTeamB);
    }

    public void addOnePointForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamBScore(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamAScore(scoreTeamA);
        displayForTeamBScore(scoreTeamB);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
