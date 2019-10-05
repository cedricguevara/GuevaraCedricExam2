package com.guevara.guevaracedricexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText commentBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button) findViewById(R.id.nextButton);
    }

    public void saveData(View v){
        Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show();
    }


    public void openConfirmation(View a){
        CheckBox check1 = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox check2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox check3 = (CheckBox)findViewById(R.id.checkBox3);
        CheckBox check4 = (CheckBox)findViewById(R.id.checkBox4);
        CheckBox check5 = (CheckBox)findViewById(R.id.checkBox5);
        CheckBox check6 = (CheckBox)findViewById(R.id.checkBox6);
        CheckBox check7 = (CheckBox)findViewById(R.id.checkBox7);
        CheckBox check8 = (CheckBox)findViewById(R.id.checkBox8);
        commentBox =findViewById(R.id.editText);
        Intent intent= new Intent(this, Confirmation.class);
            intent.putExtra("check1", check1.isChecked());
            intent.putExtra("check2", check2.isChecked());
            intent.putExtra("check3", check3.isChecked());
            intent.putExtra("check4", check4.isChecked());
            intent.putExtra("check5", check5.isChecked());
            intent.putExtra("check6", check6.isChecked());
            intent.putExtra("check7", check7.isChecked());
            intent.putExtra("check8", check8.isChecked());
            intent.putExtra("Comment Box",commentBox.getText().toString());
        startActivity(intent);
    }
}
