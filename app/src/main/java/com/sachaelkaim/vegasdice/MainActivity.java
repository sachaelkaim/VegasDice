package com.sachaelkaim.vegasdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        rollButton = ( Button) findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.image_leftDie);
        final ImageView rightDice = findViewById(R.id.image_rightDie);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("VegasDice", "the button has been pressed!");

                Random rdmNumber = new Random ();

                int number = rdmNumber.nextInt(6);

                Log.d( "VegasDice", "the number is " + number);

                leftDice.setImageResource(diceArray[number]);

                number = rdmNumber.nextInt(6);

                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
