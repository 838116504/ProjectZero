package hubert.catcat.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        View btn_popularMovies = findViewById(R.id.btn_pm);
        btn_popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my popular movies app!", Toast.LENGTH_SHORT).show();
            }
        });
        View btn_stockHawk = findViewById(R.id.btn_sh);
        btn_stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my stock hawk app!", Toast.LENGTH_SHORT).show();
            }
        });
        View btn_buildItBigger = findViewById(R.id.btn_bib);
        btn_buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
            }
        });
        View btn_makeYourAppMaterial = findViewById(R.id.btn_myam);
        btn_makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my make your app material app!", Toast.LENGTH_SHORT).show();
            }
        });
        View btn_goUbiquitous = findViewById(R.id.btn_gu);
        btn_goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app!", Toast.LENGTH_SHORT).show();
            }
        });
        View btn_capstone = findViewById(R.id.btn_c);
        btn_capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
