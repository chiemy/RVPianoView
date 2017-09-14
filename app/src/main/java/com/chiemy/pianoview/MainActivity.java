package com.chiemy.pianoview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.chiemy.piano.PianoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PianoView pianoView = (PianoView) findViewById(R.id.pianoView);
        pianoView.setItemSpacing(20);
        pianoView.setAdapter(new PianoView.PianoAdapter() {
            @Override
            public View onCreateItemView(PianoView parent) {
                return LayoutInflater.from(parent.getContext()).inflate(R.layout.item_piano,
                        parent, false);
            }

            @Override
            public void onBindItemView(View itemView, int position) {

            }

            @Override
            public int getItemCount() {
                return 20;
            }
        });
    }
}