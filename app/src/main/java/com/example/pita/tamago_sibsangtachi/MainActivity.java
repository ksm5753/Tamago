package com.example.pita.tamago_sibsangtachi;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img = (ImageView) findViewById(R.id.tamago);
        final TextView txt = (TextView)findViewById(R.id.num);
        txt.setText(""+num);
        final Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(1000);

                num--;
                    txt.setText("" + num);
                if(num >= 30 && num < 50){
                    img.setBackgroundResource(R.drawable.egg2);
                    }
                else if(num == 0) {
                    img.setBackgroundResource(R.drawable.egg3);
                }
                else if(num < 0){
                    img.setBackgroundResource(R.drawable.egg);
                    Toast.makeText(MainActivity.this,"다시해~!", Toast.LENGTH_SHORT).show();
                    num = 100;
                    txt.setText(""+ num);
                }
            }
        });
    }
}