package mx.edu.itl.c85360673.u3menusapp;

/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*          Activity que Despliega un menu con una linea de texto que despliega un menu
:*
:*  Archivo     : MenuPopupActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla un menu donde hay una linea de texto el cual al
                  ser pulsado por un tiempo despliegan un menu con nombres
:*------------------------------------------------------------------------------------------*/

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;


public class MenuPopupActivity extends AppCompatActivity implements View.OnLongClickListener,
                                                                    PopupMenu.OnMenuItemClickListener {

    EditText edtApodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_popup);

        edtApodo = (EditText) findViewById ( R.id.edtApodo );
        edtApodo.setOnLongClickListener( this );
    }

    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        if ( id == R.id.edtApodo ) {
            configurar_popmenu_apodo ( v );
            return true;
        }
        return false;
    }

    private void configurar_popmenu_apodo ( View v ) {
        PopupMenu popupMenu = new PopupMenu ( this, v );
        popupMenu.getMenuInflater().inflate ( R.menu.menu_popup_apodo, popupMenu.getMenu() );
        popupMenu.setOnMenuItemClickListener ( this );
        popupMenu.show();
    }


    @Override
    public boolean onMenuItemClick ( MenuItem item ) {
        int id = item.getItemId();

        if ( id == R.id.mniApodoAmlo ) {
            edtApodo.setText ( "El Peje" );
        } else if ( id == R.id.mniApodoBorolas ) {
            edtApodo.setText ( "McLovin" );
        } else if ( id == R.id.mniApodoPenita ) {
            edtApodo.setText ( "SubZero" );
        } else {
            return false;
        }

        return true;
    }


}
