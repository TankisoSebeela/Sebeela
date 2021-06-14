package com.sebeelaapp.n;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView pic;

    Button btn1;
    Button btn2;
    Button btn3;
    Drawable harry;
    Drawable li;
    Drawable mahl;
    int number_of_clicks = 1;
    TextView tx;
    int score =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] pictures = {R.drawable.harry, R.drawable.mahlanya,R.drawable.jetli};

        li = getDrawable(pictures[2]);
        mahl = getDrawable(pictures[1]);
        harry = getDrawable(pictures[0]);
        pic = findViewById(R.id.image);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        tx= (TextView) findViewById(R.id.score);

    }

    public void btn1(View view) {

        if(number_of_clicks==1){
        pic.setImageResource(R.drawable.mahlanya);
        btn1.setText("Mahlanya");
        btn2.setText("Chakela");
        btn3.setText("Kommanda Opps");
        Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score +"Scored");
            number_of_clicks+=1;

        }else if(number_of_clicks==2){
            pic.setImageResource(R.drawable.jetli);
            btn1.setText("Charlie Chaplin");
            btn2.setText("Jet Li");
            btn3.setText("Jackie Chan");

            Toast.makeText(this, "GOOD...!", Toast.LENGTH_SHORT).show();
            tx.setText(++score +"Scored");
            number_of_clicks+=1;

        }else if(number_of_clicks==3){
            Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score + " Scored");
        }

    }

    public void ntn2(View view) {

        if(number_of_clicks==1){
            pic.setImageResource(R.drawable.mahlanya);
            btn1.setText("Mahlanya");
            btn2.setText("Chakela");
            btn3.setText("Kommanda Opps");
            Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score +" Scored");
            number_of_clicks+=1;
        }
        else if(number_of_clicks==2){
            pic.setImageResource(R.drawable.jetli);
            btn1.setText("Charlie Chaplin");
            btn2.setText("Jet Li");
            btn3.setText("Jackie Chan");
            Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score +" Scored");
            number_of_clicks+=1;
        }else if(number_of_clicks==3){
            Toast.makeText(this, "GOOD...!", Toast.LENGTH_SHORT).show();
            tx.setText(++score +" Scored");
        }
    }

    public void btn3(View view) {

        if(number_of_clicks==1){
            pic.setImageResource(R.drawable.mahlanya);
            btn1.setText("Mahlanya");
            btn2.setText("Chakela");
            btn3.setText("Kommanda Opps");
            Toast.makeText(this, "GOOD...!", Toast.LENGTH_SHORT).show();
            tx.setText(++score +" Scored");
            number_of_clicks+=1;
        }
        else if(number_of_clicks==2){
            pic.setImageResource(R.drawable.jetli);
            btn1.setText("Charlie Chaplin");
            btn2.setText("Jet Li");
            btn3.setText("Jackie Chan");
            Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score +"  Scored");
            number_of_clicks+=1;
        }else if(number_of_clicks==3){
            Toast.makeText(this, "WRONG...!", Toast.LENGTH_SHORT).show();
            tx.setText(score +" Scored");

        }
    }
}