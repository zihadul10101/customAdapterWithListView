package com.example.listview_with_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listViewId;
    String[] crickerterName;
    int img[]= {
            R.drawable.shakib_wife,
            R.drawable.liton_wife,
            R.drawable.mas_wife,
            R.drawable.mahu_wife,
            R.drawable.shakib_wife,
            R.drawable.tamim_wife,
            R.drawable.rubel_wife,
            R.drawable.mahu_wife,
            R.drawable.mustafiz_wife,
            R.drawable.soumay_wife,
            R.drawable.ash_wife,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewId=findViewById(R.id.listViewId);
        crickerterName=getResources().getStringArray(R.array.cricketer_name);
        CustomAdapter adapter=new CustomAdapter(this,crickerterName,img);
        listViewId.setAdapter(adapter);

    }
}