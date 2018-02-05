package com.example.android.javaquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int score = 0;


                EditText nameField = (EditText) findViewById(R.id.name_field);
                String name = nameField.getText().toString();

    /*First*/
                CheckBox checkBoxOne = findViewById(R.id.checkbox_one);
                boolean fistFirstAnswer = checkBoxOne.isChecked();
                CheckBox checkBoxTwo = findViewById(R.id.checkbox_two);
                boolean fistSecondAnswer = checkBoxTwo.isChecked();
                CheckBox checkBoxThree = findViewById(R.id.checkbox_three);
                boolean fistThirdAnswer = checkBoxThree.isChecked();
                CheckBox checkBoxFour = findViewById(R.id.checkbox_four);
                boolean fistFourthAnswer = checkBoxFour.isChecked();

    /*Second*/
                RadioButton radioFour = findViewById(R.id.radio_four);
                boolean secondAnswer = radioFour.isChecked();

    /*Third*/
                EditText editTextOne = (EditText) findViewById(R.id.edit_text_one);
                String first = editTextOne.getText().toString();
                EditText editTextTwo = (EditText) findViewById(R.id.edit_text_two);
                String second = editTextTwo.getText().toString();

    /*Fourth*/
                EditText editTextThree = (EditText) findViewById(R.id.edit_text_three);
                String third = editTextThree.getText().toString();

    /*Fifth*/
                RadioButton radioSix = findViewById(R.id.radio_six);
                boolean fifthAnswer = radioSix.isChecked();

                if (fistThirdAnswer || fistFourthAnswer){
score = 0;
                } else if (fistFirstAnswer && fistSecondAnswer) {
                    score = score + 1;
                }

                if (secondAnswer) {
                    score = score + 1;
                }

                if (first.equals("-128") && second.equals("127")) {
                    score = score + 1;
                }

                if (third.equals("boolean")) {
                    score = score + 1;
                }

                if (fifthAnswer) {
                    score = score + 1;
                }

                displayScore(score, name);


            }
        });
    }

    public void displayScore(int score, String name) {
        if (score == 0) {
            Toast.makeText(this, "(╯°□°）╯︵ ┻━┻ " + name + " Maybe next time. You scored 0 points!", Toast.LENGTH_LONG).show();
        } else if (score < 5){
            Toast.makeText(this, "(✌ ﾟ ∀ ﾟ)☞ " + name + " Nice! Your score is: " + score, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "ᕙ(⇀‸↼‶)ᕗ " + name + " You rock! Your score is: " + score, Toast.LENGTH_LONG).show();
        }
    }


}



