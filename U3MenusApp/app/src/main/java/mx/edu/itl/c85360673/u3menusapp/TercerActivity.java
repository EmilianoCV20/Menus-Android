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
:*  Archivo     : TercerActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla con texto y un menu el cual cambia de color el
                  fondo.
:*------------------------------------------------------------------------------------------*/

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;



public class TercerActivity extends MenuComunActivity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tercer );

        layout = (LinearLayout) findViewById ( R.id.layoutPrincipal );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if ( id == R.id.mniCambiarColorFondo ) {
            layout.setBackgroundColor ( Color.DKGRAY );
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
