package com.example.vrashabkotian.a15puzzle;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button reset;
    Button shuffle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        reset=(Button)findViewById(R.id.reset);
        shuffle=(Button)findViewById(R.id.shuffle);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b16.getVisibility()==View.INVISIBLE)
                {
                    b16.setText(b15.getText());
                    b15.setVisibility(View.INVISIBLE);
                    b16.setVisibility(View.VISIBLE);
                }
                 if(b14.getVisibility()==View.INVISIBLE)
                {
                    b14.setText(b15.getText());
                    b15.setVisibility(View.INVISIBLE);
                    b14.setVisibility(View.VISIBLE);
                }
                if(b9.getVisibility()==View.INVISIBLE)
                {
                    b9.setText(b15.getText());
                    b15.setVisibility(View.INVISIBLE);
                    b9.setVisibility(View.VISIBLE);
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getVisibility()==View.INVISIBLE)
                {
                    b3.setText(b13.getText());
                    b13.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.VISIBLE);
                }
                if(b14.getVisibility()==View.INVISIBLE)
                {
                    b14.setText(b13.getText());
                    b13.setVisibility(View.INVISIBLE);
                    b14.setVisibility(View.VISIBLE);
                }

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getVisibility()==View.INVISIBLE)
                {
                    b6.setText(b14.getText());
                    b14.setVisibility(View.INVISIBLE);
                    b6.setVisibility(View.VISIBLE);
                }
                if(b15.getVisibility()==View.INVISIBLE)
                {
                    b15.setText(b14.getText());
                    b14.setVisibility(View.INVISIBLE);
                    b15.setVisibility(View.VISIBLE);
                }
                if(b13.getVisibility()==View.INVISIBLE)
                {
                    b13.setText(b14.getText());
                    b14.setVisibility(View.INVISIBLE);
                    b13.setVisibility(View.VISIBLE);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getVisibility()==View.INVISIBLE)
                {
                    b2.setText(b3.getText());
                    b3.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.VISIBLE);
                }
                if(b13.getVisibility()==View.INVISIBLE)
                {
                    b13.setText(b3.getText());
                    b3.setVisibility(View.INVISIBLE);
                    b13.setVisibility(View.VISIBLE);
                }
                if(b6.getVisibility()==View.INVISIBLE)
                {
                    b6.setText(b3.getText());
                    b3.setVisibility(View.INVISIBLE);
                    b6.setVisibility(View.VISIBLE);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getVisibility()==View.INVISIBLE)
                {
                    b3.setText(b2.getText());
                    b2.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.VISIBLE);
                }
                if(b1.getVisibility()==View.INVISIBLE)
                {
                    b1.setText(b2.getText());
                    b2.setVisibility(View.INVISIBLE);
                    b1.setVisibility(View.VISIBLE);
                }
                if(b5.getVisibility()==View.INVISIBLE)
                {
                    b5.setText(b2.getText());
                    b2.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.VISIBLE);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getVisibility()==View.INVISIBLE)
                {
                    b2.setText(b1.getText());
                    b1.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.VISIBLE);
                }
                if(b4.getVisibility()==View.INVISIBLE)
                {
                    b4.setText(b1.getText());
                    b1.setVisibility(View.INVISIBLE);
                    b4.setVisibility(View.VISIBLE);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getVisibility()==View.INVISIBLE)
                {
                    b1.setText(b4.getText());
                    b4.setVisibility(View.INVISIBLE);
                    b1.setVisibility(View.VISIBLE);
                }
                if(b7.getVisibility()==View.INVISIBLE)
                {
                    b7.setText(b4.getText());
                    b4.setVisibility(View.INVISIBLE);
                    b7.setVisibility(View.VISIBLE);
                }
                if(b5.getVisibility()==View.INVISIBLE)
                {
                    b5.setText(b4.getText());
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.VISIBLE);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getVisibility()==View.INVISIBLE)
                {
                    b4.setText(b7.getText());
                    b7.setVisibility(View.INVISIBLE);
                    b4.setVisibility(View.VISIBLE);
                }
                if(b10.getVisibility()==View.INVISIBLE)
                {
                    b10.setText(b7.getText());
                    b7.setVisibility(View.INVISIBLE);
                    b10.setVisibility(View.VISIBLE);
                }
                if(b8.getVisibility()==View.INVISIBLE)
                {
                    b8.setText(b7.getText());
                    b7.setVisibility(View.INVISIBLE);
                    b8.setVisibility(View.VISIBLE);
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getVisibility()==View.INVISIBLE)
                {
                    b7.setText(b10.getText());
                    b10.setVisibility(View.INVISIBLE);
                    b7.setVisibility(View.VISIBLE);
                }
                if(b11.getVisibility()==View.INVISIBLE)
                {
                    b11.setText(b10.getText());
                    b10.setVisibility(View.INVISIBLE);
                    b11.setVisibility(View.VISIBLE);
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b10.getVisibility()==View.INVISIBLE)
                {
                    b10.setText(b11.getText());
                    b11.setVisibility(View.INVISIBLE);
                    b10.setVisibility(View.VISIBLE);
                }
                if(b12.getVisibility()==View.INVISIBLE)
                {
                    b12.setText(b11.getText());
                    b11.setVisibility(View.INVISIBLE);
                    b12.setVisibility(View.VISIBLE);
                }
                if(b8.getVisibility()==View.INVISIBLE)
                {
                    b8.setText(b11.getText());
                    b11.setVisibility(View.INVISIBLE);
                    b8.setVisibility(View.VISIBLE);
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b11.getVisibility()==View.INVISIBLE)
                {
                    b11.setText(b12.getText());
                    b12.setVisibility(View.INVISIBLE);
                    b11.setVisibility(View.VISIBLE);
                }
                if(b16.getVisibility()==View.INVISIBLE)
                {
                    b16.setText(b12.getText());
                    b12.setVisibility(View.INVISIBLE);
                    b16.setVisibility(View.VISIBLE);
                }
                if(b9.getVisibility()==View.INVISIBLE)
                {
                    b9.setText(b12.getText());
                    b12.setVisibility(View.INVISIBLE);
                    b9.setVisibility(View.VISIBLE);
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b12.getVisibility()==View.INVISIBLE)
                {
                    b12.setText(b16.getText());
                    b16.setVisibility(View.INVISIBLE);
                    b12.setVisibility(View.VISIBLE);
                }
                if(b15.getVisibility()==View.INVISIBLE)
                {
                    b15.setText(b16.getText());
                    b16.setVisibility(View.INVISIBLE);
                    b15.setVisibility(View.VISIBLE);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getVisibility()==View.INVISIBLE)
                {
                    b2.setText(b5.getText());
                    b5.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.VISIBLE);
                }
                if(b4.getVisibility()==View.INVISIBLE)
                {
                    b4.setText(b5.getText());
                    b5.setVisibility(View.INVISIBLE);
                    b4.setVisibility(View.VISIBLE);
                }
                if(b6.getVisibility()==View.INVISIBLE)
                {
                    b6.setText(b5.getText());
                    b5.setVisibility(View.INVISIBLE);
                    b6.setVisibility(View.VISIBLE);
                }
                if(b8.getVisibility()==View.INVISIBLE)
                {
                    b8.setText(b5.getText());
                    b5.setVisibility(View.INVISIBLE);
                    b8.setVisibility(View.VISIBLE);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getVisibility()==View.INVISIBLE)
                {
                    b3.setText(b6.getText());
                    b6.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.VISIBLE);
                }
                if(b5.getVisibility()==View.INVISIBLE)
                {
                    b5.setText(b6.getText());
                    b6.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.VISIBLE);
                }
                if(b9.getVisibility()==View.INVISIBLE)
                {
                    b9.setText(b6.getText());
                    b6.setVisibility(View.INVISIBLE);
                    b9.setVisibility(View.VISIBLE);
                }
                if(b14.getVisibility()==View.INVISIBLE)
                {
                    b14.setText(b6.getText());
                    b6.setVisibility(View.INVISIBLE);
                    b14.setVisibility(View.VISIBLE);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getVisibility()==View.INVISIBLE)
                {
                    b5.setText(b8.getText());
                    b8.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.VISIBLE);
                }
                if(b7.getVisibility()==View.INVISIBLE)
                {
                    b7.setText(b8.getText());
                    b8.setVisibility(View.INVISIBLE);
                    b7.setVisibility(View.VISIBLE);
                }
                if(b9.getVisibility()==View.INVISIBLE)
                {
                    b9.setText(b8.getText());
                    b8.setVisibility(View.INVISIBLE);
                    b9.setVisibility(View.VISIBLE);
                }
                if(b11.getVisibility()==View.INVISIBLE)
                {
                    b11.setText(b8.getText());
                    b8.setVisibility(View.INVISIBLE);
                    b11.setVisibility(View.VISIBLE);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getVisibility()==View.INVISIBLE)
                {
                    b6.setText(b9.getText());
                    b9.setVisibility(View.INVISIBLE);
                    b6.setVisibility(View.VISIBLE);
                }
                if(b8.getVisibility()==View.INVISIBLE)
                {
                    b8.setText(b9.getText());
                    b9.setVisibility(View.INVISIBLE);
                    b8.setVisibility(View.VISIBLE);
                }
                if(b15.getVisibility()==View.INVISIBLE)
                {
                    b15.setText(b9.getText());
                    b9.setVisibility(View.INVISIBLE);
                    b15.setVisibility(View.VISIBLE);
                }
                if(b12.getVisibility()==View.INVISIBLE)
                {
                    b12.setText(b9.getText());
                    b9.setVisibility(View.INVISIBLE);
                    b12.setVisibility(View.VISIBLE);
                }
            }
        });
        shuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("9");
                b2.setText("12");
                b3.setText("1");
                b4.setText("8");
                b5.setText("13");
                b6.setText("3");
                b7.setText("10");
                b8.setText("7");
                b9.setVisibility(View.INVISIBLE);
                b10.setText("11");
                b11.setText("2");
                b12.setText("6");
                b13.setText("4");
                b14.setText("15");
                b15.setText("14");
                b16.setText("5");
                b16.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                b12.setVisibility(View.VISIBLE);
                b13.setVisibility(View.VISIBLE);
                b14.setVisibility(View.VISIBLE);
                b15.setVisibility(View.VISIBLE);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("1");
                b2.setText("2");
                b3.setText("3");
                b4.setText("5");
                b5.setText("6");
                b6.setText("7");
                b7.setText("9");
                b8.setText("10");
                b9.setText("11");
                b10.setText("13");
                b11.setText("14");
                b12.setText("15");
                b13.setText("4");
                b14.setText("8");
                b15.setText("12");
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                b12.setVisibility(View.VISIBLE);
                b13.setVisibility(View.VISIBLE);
                b14.setVisibility(View.VISIBLE);
                b15.setVisibility(View.VISIBLE);
                b16.setVisibility(View.INVISIBLE);
            }
        });
    }
}

