package mx.edu.itl.c85360673.u3menusapp;
/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*          Activity que Despliega un menu con un boton el cual despliega un menu
:*
:*  Archivo     : SegundoActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla con texto y un menu el cual cambia de color el
                  fondo y tiene una opcion extra (salir del activity).
:*------------------------------------------------------------------------------------------*/

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;



public class SegundoActivity extends MenuComunActivity {

    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        layout = (ConstraintLayout) findViewById ( R.id.layoutPrincipal );
    }

    // Se sobreescribe el metodo onCreateOptionsMenu para agregar la nueva opcion
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Se llama a super para que recree el menu con las opciones en comun
        super.onCreateOptionsMenu( menu );

        // Agregamos la nueva opcion
        MenuItem mni = menu.add ( Menu.NONE, 44191944, Menu.NONE, "SALIR (Opc Extra)"  );

        return true;
    }

    // Se sobre escribe el metodo onOptionsItemSelected para manejar la nueva opcion agregada
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.mniCambiarColorFondo ) {
            layout.setBackgroundColor(Color.BLACK);
            return true;
        } else if ( id == 44191944 ) {
            Toast.makeText ( this, "ADIOS!", Toast.LENGTH_SHORT ).show();
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);  //
    }

    public void onBackPressed () {
        Toast.makeText ( this, "Use la opcion extra: SALIR", Toast.LENGTH_SHORT ).show ();
    }
}
