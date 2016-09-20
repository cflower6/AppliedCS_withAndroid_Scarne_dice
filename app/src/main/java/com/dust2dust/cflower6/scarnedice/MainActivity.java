package com.dust2dust.cflower6.scarnedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int myOverallScore;
    int myTurnScore;
    int opponentScore;
    int opponentOverallScore;
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;


    public void rollButton(View view) {
        Random rn = new Random();
        int rand = rn.nextInt(6) + 1;

        switch (rand) {
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                break;
            default:
                System.out.println("No way this happens!");
                break;
        }

        myTurnScore += rand;

        if (rand != 1) {
            //textView1.setText("Your Score " + myOverallScore);
            textView2.setText("Opponent's Score: " + opponentOverallScore);
            textView3.setText("Current Score: " + myTurnScore);
        } else {
            myTurnScore = 0;
            //textView1.setText("Your Score " + myOverallScore);
            textView2.setText("Opponent's Score: " + opponentOverallScore);
            textView3.setText("Current Score: " + myTurnScore);
        }

    }
        public void holdButton(View view) {
            myOverallScore += myTurnScore;
            myTurnScore = 0;
            textView1.setText("Your Score " + myOverallScore);
            textView2.setText("Opponent's Score: " + opponentOverallScore);
            textView3.setText("Current Score: " + myTurnScore);
        }
    public void restButton(View view) {
        myOverallScore = 0;
        myTurnScore = 0;
        opponentScore = 0;
        opponentOverallScore = 0;

        textView1.setText("Your Score " + myOverallScore);
        textView2.setText("Opponent's Score: " + opponentOverallScore);
        textView3.setText("Current Score: " + myTurnScore);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ;
        imageView = (ImageView) findViewById(R.id.imageView);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);

    }
}