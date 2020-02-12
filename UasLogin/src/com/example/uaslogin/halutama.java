package com.example.uaslogin;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class halutama extends Activity {
TextView tampilnama;
 
 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.halutama);
  
  tampilnama = (TextView)findViewById(R.id.txtTampil);
  
  Intent ambilNama = getIntent();
  tampilnama.setText(ambilNama.getStringExtra("User"));
 }


}
