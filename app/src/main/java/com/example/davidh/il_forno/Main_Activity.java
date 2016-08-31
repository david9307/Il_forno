package com.example.davidh.il_forno;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity {

    TextView nombre,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);

        nombre=(TextView)findViewById(R.id.name);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();

        switch(id){

            case R.id.miperfil:
                Intent intent=new Intent(this,Mi_perfil.class);
                intent.putExtra("Nombre",nombre.getText().toString());
                startActivity(intent);
                break;

            case R.id.publicidad:
                break;

        }
        return true;
    }
}
