package com.example.sp20_bse_048;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button a,s,ss;
    TextView n,g,e,ad,ag;
    String z[][]=new String[10][];
    int i=0;
    EditText searchemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=findViewById(R.id.namee);
        g=findViewById(R.id.textView);
        e=findViewById(R.id.emaill);
        ad=findViewById(R.id.addressssz);
        ag=findViewById(R.id.agess);
        a=findViewById(R.id.add);
        s=findViewById(R.id.search);
        ss=findViewById(R.id.searchs);

        searchemail=findViewById(R.id.seaarchemail);
        ss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int ii=0;ii<10;ii++) {
                    if (searchemail.getText().toString() == z[ii][0]) {
                        e.setText(z[ii][0]);
                        n.setText(z[ii][1]);
                        ad.setText(z[ii][2]);
                        ag.setText(z[ii][3]);
                        return;
                    }
                }

            }
        });
    a.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
actionfragment a=new actionfragment();
            FragmentTransaction t=getSupportFragmentManager().beginTransaction();
            t.replace(R.id.l2,a).commit();
        g.setText("");
        }
    });
    s.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            messagefragment aa=new messagefragment();
            FragmentTransaction tt=getSupportFragmentManager().beginTransaction();
            tt.replace(R.id.l2,aa).commit();
            g.setText("");
        }
    });
    }
    }