package com.example.listview_with_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
  TextView profileText;
  TextView profileDec;
  ImageView imageViewId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        profileText=findViewById(R.id.profileText);
        profileDec=findViewById(R.id.profileDec);
        imageViewId=findViewById(R.id.imageViewId);


        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){

            String value= bundle.getString("name");
            String dec= bundle.getString("dec");
            int resId = bundle.getInt("resId");
            imageViewId.setImageResource(resId);
            profileText.setText(value);
            profileDec.setText(dec);


        }
  }
}