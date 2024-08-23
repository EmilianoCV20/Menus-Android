package mx.edu.itl.c85360673.u3menusapp;

/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*       Clase donde se almacena el menu en comun de Seleccion de Activitys con un Menu en Comun
:*
:*  Archivo     : MenuComunActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta es la superclase donde se almacena el menu que se va a compartir a
                  los menus.
:*------------------------------------------------------------------------------------------*/

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



// Esta clase es la superclase de los Activity's que van a compartir un menu en comun
// En este caso el menu tendrá 2 opciones en comun: Acerca de y Cambiar el color de fondo de la pantalla.

public class MenuComunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate ( R.menu.menu_comun, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.mniAcercaDe ) {
            Intent intent  = new Intent ( this, AcercaDe.class );
            startActivity ( intent );
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
