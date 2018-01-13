package uas.ayobelajar;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

             pindah = (ImageButton) findViewById(R.id.b_play);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(IntenPindah);
            }
        });


        pindah = (ImageButton) findViewById(R.id.about);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntenPindah = new Intent(MainActivity.this, About.class);
                startActivity(IntenPindah);
            }
        });
    }
}
