package com.example.prana.openlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class Devilwcf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devilwcf);
    }

    public void buy6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Devil-Wears-Prada-Lauren-Weisberger/dp/0007156103/ref=sr_1_1?ie=UTF8&qid=1507123063&sr=8-1&keywords=the+devil+wears+prada"));
        startActivity(browserIntent);
    }

    public void pdf6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://english4success.ru/Upload/books/665.pdf"));
        startActivity(browserIntent);
    }
}