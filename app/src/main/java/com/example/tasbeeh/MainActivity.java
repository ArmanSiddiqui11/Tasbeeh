package com.example.tasbeeh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    Button button;
    Button button2;
    Button button3;

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView2=findViewById(R.id.textView2);
        button3=findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        textView.setText("please start the your tasbeeh ");
           button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText(" "+counter());


                    if (count > 0) {
                        button.setText("tap");
                    }
                    if (count > 0 && count < 34) {
                        textView.setText("Read SUBHANALLAH 33 times");
                    } else if (count > 33 && count < 67) {
                        textView.setText("Read ALHAMDULILLAH 33 times");
                    } else if (count > 66 && count <= 100) {
                        textView.setText("Read ALLAHUAKBAR 33 times");
                    }
                    else if(count==101){
                        textView.setText("Read La ilaha illallah one time ");
                    }
                        else {
                        textView.setText("Now you have to reset it ");
                    }

                }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText(" "+reset1());
                textView.setText("Restart your tasbeeh ");
            }
        });


    }
    public int counter(){
        return ++count;
    }
    public int reset1(){
        return count = 0;


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId==R.id.action_home){
            Toast.makeText(this,"you selected Home",Toast.LENGTH_SHORT).show();
        }
        else if(itemId==R.id.action_search){
            Toast.makeText(this, "You selected Search", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }



}