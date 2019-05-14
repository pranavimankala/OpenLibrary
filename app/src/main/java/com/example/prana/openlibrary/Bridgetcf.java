package com.example.prana.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class Bridgetcf extends AppCompatActivity {


            @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bridgetcf);
        }

        public void buy5(View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Bridget-Joness-Diary-Helen-Fielding/dp/0330375253/ref=sr_1_1?ie=UTF8&qid=1507122853&sr=8-1&keywords=bridget+jones+diary"));
            startActivity(browserIntent);
        }
        public void pdf5(View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kkoworld.com/kitablar/Helen%20Fielding%20-%20Bridget%20Jones%27s%20Diary.pdf"));
            startActivity(browserIntent);
        }

    }


