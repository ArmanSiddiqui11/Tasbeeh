package com.example.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
ListView listview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listview=findViewById(R.id.listview);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i=new Intent(MainActivity2.this,playSurat.class);
                startActivity(i);
            }
        });

        String[] surat={"surah fatiha","surah naas","surah falak","surah ahad","surah lahab"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,surat);
        listview.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {

    }
    public void playSounds(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}