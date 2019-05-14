package com.example.prana.openlibrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Abwingsof extends AppCompatActivity {

            @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_abwingsof);
        }
        public void buy1(View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Wings-Fire-Autobiography-Abdul-Kalam/dp/8173711461/ref=sr_1_1?ie=UTF8&qid=1507045875&sr=8-1&keywords=wings+of+fire+apj+abdul+kalam"));
            startActivity(browserIntent);
        }
        public void pdf1(View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.museumsforlaget.no/index.php/bok-museumsforlage/boker-museumsforlaget?task=convert.getpdf&id=4&filename=wings-of-fire-by-abdul-kalam.pdf"));
            startActivity(browserIntent);
        }

    }


