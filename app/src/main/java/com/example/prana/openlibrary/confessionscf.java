package com.example.prana.openlibrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class confessionscf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confessionscf);
    }
    public void buy4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Confessions-Shopaholic-Novel-Sophie-Kinsella/dp/0385335482?tag=googinhydr18418-21"));
        startActivity(browserIntent);
    }

    public void pdf4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.balajisebookworld.com/Ebooks/Confessionsofashopaholic.pdf"));
        startActivity(browserIntent);
    }


}
