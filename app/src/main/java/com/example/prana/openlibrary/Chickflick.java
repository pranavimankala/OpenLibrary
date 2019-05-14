package com.example.prana.openlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Chickflick extends AppCompatActivity {

    private View view;
    ListView glst;
    int[] images = new int[]{R.drawable.confessionschickflick
            , R.drawable.bridgetjonescf
            , R.drawable.devilwpradacf};
    String[] names = new String[]{"Confessions of a Shopaholic", "Bridget Jones' Diary", "The devil Wears Prada "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chickflick);
        glst = (ListView) findViewById(R.id.listviewcf);
        CustomAdaptor C = new CustomAdaptor();
        glst.setAdapter(C);
        glst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent mIntent = new Intent(Chickflick.this, confessionscf.class);
                    startActivity(mIntent);
                }
                if (position == 1) {
                    Intent mIntent = new Intent(Chickflick.this, Bridgetcf.class);
                    startActivity(mIntent);
                }

                if (position == 2) {
                    Intent mIntent = new Intent(Chickflick.this, Devilwcf.class);
                    startActivity(mIntent);
                }

            }
        });

    }

    class CustomAdaptor extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imgv = view.findViewById(R.id.imageView1);
            TextView txtv = view.findViewById(R.id.textview);
            imgv.setImageResource(images[i]);
            txtv.setText(names[i]);
            return view;

        }
    }
}