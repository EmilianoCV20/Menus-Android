/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*         Activity que Despliega un menu con lineas de texto que despliegan menus
:*
:*  Archivo     : MenuContextualFlotanteActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla un menu donde hay lineas de texto las cuales al
                  ser pulsadas por un tiempo despliegan un menu
:*------------------------------------------------------------------------------------------*/
package mx.edu.itl.c85360673.u3menusapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MenuContextualFlotanteActivity extends AppCompatActivity {

    EditText edtNombre;
    EditText edtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_contextual_flotante);

        edtNombre = (EditText) findViewById ( R.id.edtNombre );
        // Registramos el EditText del Nombre para tener un menu contextual flotante
        registerForContextMenu ( edtNombre );

        edtApellido = (EditText) findViewById ( R.id.edtApellido );
        // Registramos el EditText del Apellido para tener un menu contextual flotante
        registerForContextMenu ( edtApellido );
    }

    // onCreateContextMenu se invoca al registrar un View con registerForContextMenu ()
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if ( v.getId() == R.id.edtNombre ) {
            getMenuInflater().inflate ( R.menu.menu_contextual_nombre, menu );
        } else if ( v.getId() == R.id.edtApellido ) {
            getMenuInflater().inflate ( R.menu.menu_contextual_apellido, menu );
        }
    }

    // Metodo para manejar la opcion de menu contextual seleccionada por el usuario
    @Override
    public boolean onContextItemSelected ( MenuItem item ) {
        int id = item.getItemId ();

        if ( id == R.id.mniFuenteTamano8 ) {
            edtNombre.setTextSize(24);
        } else if ( id == R.id.mniFuenteColorNegro ) {
            edtNombre.setTextColor(Color.YELLOW);
        } else if ( id == R.id.mniFuenteColorRojo ) {
            edtNombre.setTextColor(Color.RED);
        } else if ( id == R.id.mniFondoAmarillo ) {
            edtApellido.setBackgroundColor ( Color.WHITE );
            edtApellido.setTextColor(Color.BLACK);
        } else {
            return super.onOptionsItemSelected(item);
        }

        return true;
    }

}


