package com.example.sandeep.letstreat_v100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.example.sandeep.letstreat_v100.Adapters.CardAdapter;

public class HomeScreen extends AppCompatActivity {

    EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        RecyclerView rv_Doctors = (RecyclerView) findViewById(R.id.rv_recycler_view_Doctors);
        rv_Doctors.setHasFixedSize(true);
        CardAdapter adapter_Doctor = new CardAdapter(new String[]{"abc","kkk","njh","mhgkj"});
        rv_Doctors.setAdapter(adapter_Doctor);

        LinearLayoutManager llm_Doctors = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        llm_Doctors.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_Doctors.setLayoutManager(llm_Doctors);



        RecyclerView rv_Hospitals = (RecyclerView) findViewById(R.id.rv_recycler_view_Hospitals);
        rv_Hospitals.setHasFixedSize(true);
        CardAdapter adapter_Hospital = new CardAdapter(new String[]{"abc","kkk","njh","mhgkj"});
        rv_Hospitals.setAdapter(adapter_Hospital);

        LinearLayoutManager llm_Hospital = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rv_Hospitals.setLayoutManager(llm_Hospital);

        mEditText = (EditText)findViewById(R.id.editText1);
        mEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(HomeScreen.this,SearchList_Activity.class);
//                startActivity(intent);
//                overridePendingTransition(R.anim.fade_in,R.anim.fade_in);


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }


}
