package com.example.gp2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    ImageButton imageButton4;
    ImageButton imageButton3;
    ImageButton imageButton6;
    ImageButton imageButton7;
    ImageButton imageButton2;
    ImageButton imageButton1;
    ImageButton imageButton10;
    ImageButton imageButton5;
    ImageButton imageButton12;
    ImageButton imageButton13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );


        imageButton4 = (ImageButton) findViewById ( R.id.imageButton4 );
        imageButton3 = (ImageButton) findViewById ( R.id.imageButton3 );
        imageButton6 = (ImageButton) findViewById ( R.id.imageButton6 );
        imageButton7 = (ImageButton) findViewById ( R.id.imageButton7 );
        imageButton2 = (ImageButton) findViewById ( R.id.imageButton2 );
        imageButton1 = (ImageButton) findViewById ( R.id.imageButton1 );
        imageButton10 = (ImageButton) findViewById ( R.id.imageButton10 );
        imageButton5 = (ImageButton) findViewById ( R.id.imageButton5 );
        imageButton12 = (ImageButton) findViewById ( R.id.imageButton12 );
        imageButton13 = (ImageButton) findViewById ( R.id.imageButton13 );

        imageButton2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        } );
        imageButton3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                opennewActivity ();
            }
        }
        );
        imageButton6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                opennEwActivity();
            }
        } );
        imageButton7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { openneWActivity();
            }
        } );
        imageButton4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewaCtivity();
            }
        } );
        imageButton1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewacTivity();
            }
        } );
        imageButton10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewactIvity();
            }
        } );
        imageButton5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewactiVity();
            }
        } );
        imageButton12.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewactivIty();
            }
        } );
        imageButton13.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) { opennewactiviTy();
            }
        } );
    }
    public void openNewActivity(){
        Intent intent = new Intent (this, SecondActivity.class);
        startActivity ( intent );
    }
    public void opennewActivity(){
        Intent intent = new Intent (this, ThirdActivity.class);
        startActivity ( intent );
    }
    public void opennEwActivity(){
        Intent intent = new Intent (this, FourthActivity.class);
        startActivity ( intent );
    }
    public void openneWActivity(){
        Intent intent = new Intent (this, FifthActivity.class);
        startActivity ( intent );
    }
    public void opennewaCtivity(){
        Intent intent = new Intent (this, SixthActivity.class);
        startActivity ( intent );
    }
    public void opennewacTivity(){
        Intent intent = new Intent (this, SeventhActivity.class);
        startActivity ( intent );
    }
    public void opennewactIvity(){
        Intent intent = new Intent (this, EightActivity.class);
        startActivity ( intent );
    }
    public void opennewactiVity(){
        Intent intent = new Intent (this, TwelvethActivity.class);
        startActivity ( intent );
    }
    public void opennewactivIty(){
        Intent intent = new Intent (this,TenthActivity.class);
        startActivity ( intent );
    }
    public void opennewactiviTy(){
        Intent intent = new Intent (this,EleventhActivity.class);
        startActivity ( intent );
    }
}
