package mx.edu.itl.c85360673.u3menusapp;
/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*         Activity que Despliega un menu con un boton el cual despliega un menu
:*
:*  Archivo     : MenuModoAccionContextualActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla un menu donde hay un boton con imagen el cual al
                  ser pulsados por un tiempo despliegan un menu, el cual cambia su imagen
:*------------------------------------------------------------------------------------------*/

import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class MenuModoAccionContextualActivity extends AppCompatActivity
                                              implements View.OnLongClickListener {

    ImageView imgvImagen;
    ActionMode mImagenActionMode = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_modo_accion_contextual);

        // El ImageView va a responder al click largo ( onLongClick )
        imgvImagen = ( ImageView ) findViewById ( R.id.imgvImagen);
        imgvImagen.setOnLongClickListener ( this );
    }

    @Override
    public boolean onLongClick ( View v ) {
        if ( v.getId() == R.id.imgvImagen ){

            if ( mImagenActionMode != null ){
                return false;
            }

            mImagenActionMode = startActionMode ( mImagenActionModeListener );
            v.setSelected ( true );
            return true;

        }
        return false;
    }

    // Se define una variable que implementa la interface ActionMode.Callback
    // Esta variable fungirá como listener de la accion que se seleccione del menu contextual
    private ActionMode.Callback  mImagenActionModeListener = new ActionMode.Callback() {

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate ( R.menu.menu_modo_accion_contextual, menu );
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int id = item.getItemId();
            if ( id == R.id.mniModoAccionContextCopiar ) {
                imgvImagen.setImageResource ( R.drawable.creeper );
            } else if ( id == R.id.mniModoAccionContextCortar ) {
                imgvImagen.setImageResource ( R.drawable.enderman );
            } else if ( id == R.id.mniModoAccionContextPegar ) {
                imgvImagen.setImageResource ( R.drawable.zombie );
            } else {
                return false;
            }
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mImagenActionMode = null;
        }
    } ;
}
