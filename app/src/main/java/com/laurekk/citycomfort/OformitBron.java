package com.laurekk.citycomfort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;

public class OformitBron extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oformit_bron);
        EditText nomer = findViewById(R.id.phone);
        EditText name = findViewById(R.id.name);
        EditText email = findViewById(R.id.mail);
        ImageView bttn = findViewById(R.id.bttn);
        WebView wb = findViewById(R.id.wb);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nomer.getText().toString().length() > 1) {
                    if (name.getText().toString().length() > 1) {
                        if (email.getText().toString().length() > 1) ;
                        {
                            wb.loadUrl("https://api.telegram.org/bot6654441339:AAFQadZlh-LZJ7jI-Vjx85G2krJB_1YJHPg/sendMessage?chat_id=-1002092837105&text=Номер: " + nomer.getText().toString() + "                                                                                                                                                                                " + "Имя: " + name.getText().toString() + "                                                                                                                                                                                " + "email: " + email.getText().toString());
                        }
                    }
                }

            }
        });
    }
}