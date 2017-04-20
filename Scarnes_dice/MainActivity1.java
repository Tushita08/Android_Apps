package com.example.tushita.scarnes_dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity1 extends AppCompatActivity {

    int userscore = 0;
    int computerscore = 0;
    int userturnscore = 0;
    int computerturnscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

    }

    public void RollDice(View view)
    {
        Random x = new Random();
        int i = x.nextInt(6) + 1;

        ImageView image = (ImageView) findViewById(R.id.imageView);

        if(i == 1)
        {
            image.setImageResource(R.drawable.dice1);
        }
        if(i == 2)
        {
            image.setImageResource(R.drawable.dice2);
        }
        if(i == 3)
        {
            image.setImageResource(R.drawable.dice3);
        }
        if(i == 4)
        {
            image.setImageResource(R.drawable.dice4);
        }
        if(i == 5)
        {
            image.setImageResource(R.drawable.dice5);
        }
        if(i == 6)
        {
            image.setImageResource(R.drawable.dice6);
        }

        UpdateScoreuser(i);
    }

    public void ResetScore(View view)
    {
        userscore = 0;
        computerscore = 0;
        userturnscore = 0;
        computerturnscore = 0;
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("Your Score :0  Computer Score :0");
    }

    public void HoldGame(View view)
    {
        TextView text = (TextView) findViewById(R.id.textView2);
        UpdateScoreComp();
        text.setText("Your Score :"+ userscore + "  Computer Score :" + computerscore +"  Your turnScore :0  Computer turnScore :0" );
    }

    public void UpdateScoreuser(int s)
    {
        TextView text = (TextView) findViewById(R.id.textView2);
        if(s!=1) {
            userscore = userscore + s;
            userturnscore = s;
            text.setText("Your Score :" + userscore + " Computer Score :"+computerscore+" Your turnScore :" + userturnscore);
        }
        else if(s==1)
        {
            userturnscore = 0;
            text.setText("Your Score :"+userscore+"  Computer Score :0  Your turnScore :0");
        }
    }

    public void UpdateScoreComp()
    {
        TextView text = (TextView) findViewById(R.id.textView2);
        Random x = new Random();
        int n = x.nextInt(6)+1;
        int sum = 0;
        if(n!=1 && sum<20)
        {
            computerscore = computerscore + n;
            computerturnscore = n;
            text.setText("Your Score :" + userscore + " Computer Score :"+ computerscore + "  Your turnScore :0"+ "Computer Turn Score:"+ computerturnscore);
        }
        else if(n==1)
        {
            computerturnscore =0;
            text.setText("Your Score :" + userscore + " Computer Score :"+ computerscore + "  Your turnScore :0  Computer Turn Score:0");

        }
    }

}
