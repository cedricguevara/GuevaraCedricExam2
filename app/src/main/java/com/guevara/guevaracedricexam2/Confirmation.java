package com.guevara.guevaracedricexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Confirmation extends AppCompatActivity {

    TextView showResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        showResult = (TextView) findViewById(R.id.textView6);
        Intent intentResult = this.getIntent();
        String check1 = intentResult.getStringExtra("check1");
        String check2 = intentResult.getStringExtra("check2");
        String check3 = intentResult.getStringExtra("check3");
        String check4 = intentResult.getStringExtra("check4");
        String check5 = intentResult.getStringExtra("check5");
        String check6 = intentResult.getStringExtra("check6");
        String check7 = intentResult.getStringExtra("check7");
        String check8 = intentResult.getStringExtra("check8");

        showResult.setText(check1+" , "+check2+" , "+check3+" , "+check4 +" , "+check5+",  "+check6+" , "+check7+
                " ,"+check8);
    }

    public void send(View v){
        Toast.makeText(this, "Registration sent", Toast.LENGTH_LONG).show();
    }
    public void openPrevious(View b){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}