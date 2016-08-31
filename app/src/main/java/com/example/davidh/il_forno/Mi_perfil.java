package com.example.davidh.il_forno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Mi_perfil extends AppCompatActivity {


    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_perfil);

        nombre=(TextView)findViewById(R.id.nombre);
        Bundle extra=getIntent().getExtras();

        nombre.setText(extra.getString("Nombre"));
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            return true;
        }

}
