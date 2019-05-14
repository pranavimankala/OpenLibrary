package com.example.prana.openlibrary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Abmeinkampf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abmeinkampf);
    }
    public void buy2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Mein-Kampf-Adolf-Hitler/dp/817224164X/ref=sr_1_1?s=books&ie=UTF8&qid=1507045937&sr=1-1&keywords=mein+kempf+book+in+english"));
        startActivity(browserIntent);
    }

    public void pdf2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.angelfire.com/folk/bigbaldbob88/MeinKampf.pdf"));
        startActivity(browserIntent);
    }

}
