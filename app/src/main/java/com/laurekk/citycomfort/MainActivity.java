package com.laurekk.citycomfort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView face = findViewById(R.id.face);
        ImageView inst = findViewById(R.id.insta);
        ImageView google = findViewById(R.id.google);
ImageView oformitbron = findViewById(R.id.oformitbron);
        TextView otziv = findViewById(R.id.otzivbttn);
        TextView contact = findViewById(R.id.contacts);

        otziv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://comfortcity.otziv.com/"));
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://comfortcity.contact.com/"));
                startActivity(intent);
            }
        });

ImageView nbttn1 = findViewById(R.id.nbttn1);
        ImageView nbttn2 = findViewById(R.id.nbttn2);
        ImageView nbttn3 = findViewById(R.id.nbttn3);
        oformitbron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OformitBron.class));
            }
        });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/"));
                startActivity(intent);


            }
        });
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
                startActivity(intent);


            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.kz/"));
                startActivity(intent);

            }
        });
        nbttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(MainActivity.this,nomer1full.class));
            }
        });
        nbttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nomer2full.class));
            }
        });
        nbttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,nomer3full.class));

            }
        });

    }
}