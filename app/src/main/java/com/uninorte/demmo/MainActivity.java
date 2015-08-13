package com.uninorte.demmo;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1,b2,b3,b4;
    private elClick c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);

        //b1.setOnClickListener(this);

        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i = 1; i <= 4; ++i) number.add(i);
        Collections.shuffle(number);

        b1.setText("" + number.get(0));
        b2.setText("" + number.get(1) );
        b3.setText("" + number.get(2) );
        b4.setText("" + number.get(3) );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1){

        }

    }

    public void elClickBoton(View view) {
        final Button b;
        b = (Button) view;
        if (view.getId() == R.id.button1){
            b.setText("1");

            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    b.setText("");
                }
            },2000);

        }
    }
}
