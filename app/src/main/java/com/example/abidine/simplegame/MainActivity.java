package com.example.abidine.simplegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartGame(View view)
    {
        int value1=0;
        int value2=0;
        int som=0;
        TextView t1=(TextView)findViewById((R.id.textView)) ;
        value1=RANDOM.nextInt(6) + 1;
        value2=RANDOM.nextInt(6) + 1;
        som=value1+value2;

        int res1 = getResources().getIdentifier("a" + value1, "drawable", "com.example.abidine.simplegame");
        int res2 = getResources().getIdentifier("a" + value2, "drawable", "com.example.abidine.simplegame");
        ImageView v1,v2;
        v1=(ImageView) findViewById(R.id.imageView);
        v2=(ImageView) findViewById(R.id.imageView2);
        v1.setImageResource(res1);
        v2.setImageResource(res2);
        t1.setText(som +"/12");

    }



}
