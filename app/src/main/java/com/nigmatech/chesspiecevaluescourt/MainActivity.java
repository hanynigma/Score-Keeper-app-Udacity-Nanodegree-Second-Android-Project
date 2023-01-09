package com.nigmatech.chesspiecevaluescourt;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreWhite = 0;

    // Tracks the score for Team B
    int scoreBlack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for White by 1 point.
     */
    public void addOneForWhite(View v) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 3 points.
     */
    public void addThreeForWhite(View v) {
        scoreWhite = scoreWhite + 3;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 5 points.
     */
    public void addFiveForWhite(View v) {
        scoreWhite = scoreWhite + 5;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 9 points.
     */
    public void addNineForWhite(View view) {
        scoreWhite = scoreWhite + 9;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for Black by 1 point.
     */
    public void addOneForBlack(View v) {
        scoreBlack = scoreBlack + 1;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for Black by 3 points.
     */
    public void addThreeForBlack(View v) {
        scoreBlack = scoreBlack + 3;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for Black by 5 points.
     */
    public void addFiveForBlack(View v) {
        scoreBlack = scoreBlack + 5;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for Black by 9 points.
     */
    public void addNineForBlack(View view) {
        scoreBlack = scoreBlack + 9;
        displayForBlack(scoreBlack);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreWhite = 0;
        scoreBlack = 0;
        displayForWhite(scoreWhite);
        displayForBlack(scoreBlack);
    }

    /**
     * Displays the given score for White.
     */
    public void displayForWhite(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Black.
     */
    public void displayForBlack(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}