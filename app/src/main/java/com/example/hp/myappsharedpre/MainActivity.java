package com.example.hp.myappsharedpre;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button bt1;
    public static final String MyPREFERENCE ="myPreference";
    public static final String Name="namekey";
    public static final String Phone="phonekey";
    public static final String Email="emailkey";
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.pass);
        ed3=(EditText)findViewById(R.id.email);
        bt1=(Button)findViewById(R.id.btn);
        sharedpreferences = getSharedPreferences(MyPREFERENCE, Context.MODE_PRIVATE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed1.getText().toString();
                String phone=ed2.getText().toString();
                String email=ed3.getText().toString();
                SharedPreferences.Editor editor= sharedpreferences.edit();
                editor.putString(Name,name);
                editor.putString(Phone,phone);
                editor.putString(Email,email);
                Log.d("name:",name);
                editor.commit();
                Toast.makeText(MainActivity.this,"thanks",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
