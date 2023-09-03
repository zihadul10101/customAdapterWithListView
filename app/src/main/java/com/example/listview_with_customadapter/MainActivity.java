package com.example.listview_with_customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView listViewId;
    String[] crickerterName;
    String[] cricketerDetail;
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
        cricketerDetail=getResources().getStringArray(R.array.crickerterDtails);
        CustomAdapter adapter=new CustomAdapter(this,crickerterName,cricketerDetail,img);
        listViewId.setAdapter(adapter);
        listViewId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                intent.putExtra("resId",img[i]);
                intent.putExtra("name", crickerterName[i]);
                intent.putExtra("dec", cricketerDetail[i]);

                startActivity(intent);


            }
        });

    }
}
