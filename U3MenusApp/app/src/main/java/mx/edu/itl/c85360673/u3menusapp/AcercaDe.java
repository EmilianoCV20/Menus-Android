package mx.edu.itl.c85360673.u3menusapp;

/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*                 Activity que Despliega los creditos de la app de Menus
:*
:*  Archivo     : AcercaDe.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla de los creditos de la app con widgets.
:*------------------------------------------------------------------------------------------*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca_de);
    }
    public void btnAtrasClick ( View v ) {
        Intent intent = new Intent( AcercaDe.this, MainActivity.class );
        startActivity( intent );
        finish();
    }

}