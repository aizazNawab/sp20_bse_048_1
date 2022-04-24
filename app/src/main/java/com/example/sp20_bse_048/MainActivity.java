package com.example.sp20_bse_048;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button add,search,searchemail;
    TextView textView,e,ad,numberss;
    String z[][]=new String[10][];
  EditText email,name,address,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchemail=findViewById(R.id.searchemail);
        add=findViewById(R.id.add);
        search=findViewById(R.id.search);
        email=findViewById(R.id.email);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        address=findViewById(R.id.address);
        textView=findViewById(R.id.textView);
    add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
actionfragment a=new actionfragment();
            FragmentTransaction t=getSupportFragmentManager().beginTransaction();
            t.replace(R.id.l2,a).commit();
        textView.setText("");
        }
    });

    search.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            messagefragment aa=new messagefragment();
            FragmentTransaction tt=getSupportFragmentManager().beginTransaction();
            tt.replace(R.id.l2,aa).commit();
            textView.setText("");
        }
    });
    }
    }