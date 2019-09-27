package id.ac.poliban.mi.latihan03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*
    Using event handler & listener with
    anonymous class
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAndi = findViewById(R.id.btAndi);
        Button btJunai = findViewById(R.id.btJunai);
        Button btYusie = findViewById(R.id.btYusie);
        Button btVita = findViewById(R.id.btVita);

        btAndi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Yusie", Toast.LENGTH_SHORT).show();
            }
        });

        btJunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Junai", Toast.LENGTH_SHORT).show();
            }
        });

        btYusie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Yusie", Toast.LENGTH_SHORT).show();
            }
        });

        btVita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Vita", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
