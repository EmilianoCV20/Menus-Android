package mx.edu.itl.c85360673.u3menusapp;

/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                                CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                             DESARROLLO EN ANDROID "A"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 08-09 HRS
:*
:*             Activity que Despliega un menu de Seleccion de Activitys con un Menu en Comun
:*
:*  Archivo     : EjemploMenuEnComunActivity.java
:*  Autor       : Emiliano Cepeda Villarreal 20130792
:*  Fecha       : 06/NOV/2023
:*  Compilador  : Android Studio Flamingo 2022.2.1
:*  Descripción : Esta app despliega en pantalla un menu donde se hace seleccion de 2 activitys
                  los cuales tienen un menu en comun.
:*------------------------------------------------------------------------------------------*/

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EjemploMenuEnComunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_menu_en_comun);
    }

    public void btnActivity2Click ( View v ) {
        Intent i = new Intent ( this, SegundoActivity.class );
        startActivity ( i );
    }

    public void btnActivity3Click ( View v ) {
        Intent i = new Intent ( this, TercerActivity.class );
        startActivity ( i );

    }
}
