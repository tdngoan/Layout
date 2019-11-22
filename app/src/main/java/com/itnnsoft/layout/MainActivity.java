package com.itnnsoft.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_frame,btn_linear1,btn_linear2,btn_table,btn_grid,btn_relative,btn_absolute, btn_constraint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_frame = findViewById(R.id.btn_frame);
        btn_linear1 = findViewById(R.id.btn_linear1);
        btn_linear2=findViewById(R.id.btn_linear2);
        btn_table=findViewById(R.id.btn_table);
        btn_grid=findViewById(R.id.btn_grid);
        btn_relative=findViewById(R.id.btn_relative);
        btn_absolute=findViewById(R.id.btn_absolute);
        btn_constraint=findViewById(R.id.btn_constraint);

        btn_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FrameLayout.class);
                startActivity(intent);
            }
        });

        btn_linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearLayout_Vertical.class);
                startActivity(intent);
            }
        });

        btn_linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,LinearLayout_Horizontal.class);
                startActivity(intent);
            }
        });

        btn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TableLayout.class);
                startActivity(intent);
            }
        });

        btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GridLayout.class);
                startActivity(intent);
            }
        });

        btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RelativeLayout.class);
                startActivity(intent);
            }
        });

        btn_absolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AbsoluteLayout.class);
                startActivity(intent);
            }
        });

        btn_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ConstraintLayout.class);
                startActivity(intent);
            }
        });
    }


}
