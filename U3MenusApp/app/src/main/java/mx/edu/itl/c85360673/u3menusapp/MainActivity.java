package mx.edu.itl.c85360673.u3menusapp;

/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*             Activity que Despliega el menu principal de Activitys con diferentes menus
:*
:*  Archivo     : MainActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla el menu inicial donde se hace seleccion de
                  varios activitys los cuales tienen diferentes menus.
:*------------------------------------------------------------------------------------------*/

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import mx.edu.itl.c85360673.util.OcultarTecladoAdaptador;


public class MainActivity extends AppCompatActivity {

    LinearLayout layout;
    EditText     edtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definir el manejador del onClick sobre el layout principal, cuando se de click sobre el
        // layout la clase ClickLayoutAdapter  manejará el evento
        layout = (LinearLayout) findViewById ( R.id.id_layout );
        layout.setOnClickListener ( new OcultarTecladoAdaptador( this ) );

        edtNombre = (EditText) findViewById ( R.id.edtNombre );
    }

    // Creamos el menu de la Actividad que aparecerá en la barra de acciones (ActionBar)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate ( R.menu.menu_main_activity, menu );
        //menu.add ( Menu.NONE, 44191944, Menu.NONE, "Opcion agregada" );
        return super.onCreateOptionsMenu(menu);
    }

    // Manejamos las selecciones en el menu de la Actividad
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if ( id == R.id.mniCambiarColorLetra ) {
            edtNombre.setTextColor ( Color.RED );
        } else if ( id == R.id.mniTamano8 ) {
            edtNombre.setTextSize ( 8 );
            item.setChecked ( !item.isChecked() );
        } else if ( id == R.id.mniTamano12 ) {
            edtNombre.setTextSize ( 12 );
            item.setChecked ( !item.isChecked() );
        } else if ( id == R.id.mniTamano20 ) {
            edtNombre.setTextSize ( 20 );
            item.setChecked ( !item.isChecked() );
        } else if ( id == R.id.mniAcercaDe ) {
            Intent intent  = new Intent ( this, AcercaDe.class );
            startActivity ( intent );
        } else if ( id == R.id.mniSalir ) {
            finish();
            return super.onOptionsItemSelected(item);
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    // Otra forma de manejar las seleccion de una opcion de menu es mediante el atributo onClick de ese MenuItem
    public void mniColorFondoPrincipalClick ( MenuItem item ) {
        layout.setBackgroundColor ( Color.WHITE );
    }

    @Override
    public void onBackPressed () {
        // Hacer nada cuando se pulse el boton ATRAS del dispositivo
        Toast.makeText ( this, "Use la opcion Salir del menu", Toast.LENGTH_SHORT ).show ();
    }

    //----------------------------------------------------------------------------------------------
    //      METODOS PARA INVOCAR LOS OTROS EJEMPLOS DE MENUS

    public void btnActivitysMenuComunClick ( View v ) {
        Intent i = new Intent ( this, EjemploMenuEnComunActivity.class );
        startActivity ( i );
    }

    public void btnMenuContextualFlotante ( View v ) {
        Intent i = new Intent ( this, MenuContextualFlotanteActivity.class );
        startActivity ( i );
    }

    public void btnMenuModoContextualClick ( View v ) {
        Intent i = new Intent ( this, MenuModoAccionContextualActivity.class );
        startActivity ( i );
    }

    public void btnMenuPopupClick ( View v ) {
        Intent i = new Intent ( this, MenuPopupActivity.class );
        startActivity ( i );
    }

    public void btnAcercadeClick ( View v ) {
        Intent intent  = new Intent ( this, AcercaDe.class );
        startActivity ( intent );
    }

    //----------------------------------------------------------------------------------------------

}
