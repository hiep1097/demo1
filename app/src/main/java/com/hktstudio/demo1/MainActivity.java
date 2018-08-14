package com.hktstudio.demo1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    ActionBar actionBar;
    Toolbar toolbar;
    Spinner spinner;
    String ten[] = {"Hà Nội","Hải Phòng","HCM"};
    TextView tv_luaChon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setTitle("test");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.icon);

        actionBar.setDisplayHomeAsUpEnabled(true);


        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ten);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        tv_luaChon = findViewById(R.id.tv_luaChon);
    }

    public void nhay(View view) {
        Intent intent = new Intent(MainActivity.this,Activity1.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tv_luaChon.setText(ten[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
