package com.example.damsem09_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lista;
    List<String> estudiantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TITULO
        setTitle("Lista de estudiantes");

        //LISTAR ESTUDIANTES

        //1. Conectamos nuestro listView a lista a través del ID
        lista = findViewById(R.id.listView);

        //2. Instanciamos la lista y agregamos elementos
        estudiantes = new ArrayList<>();
        estudiantes.add("Sahuma");
        estudiantes.add("Inca");
        estudiantes.add("Asunción");
        estudiantes.add("Navarro");
        estudiantes.add("Lopez");
        estudiantes.add("...");

        //3. Definir el adaptador
        ArrayAdapter adaptadorEstudiantes = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1,
                estudiantes);

        //4. Vinculamos el adaptador con el listView
        lista.setAdapter(adaptadorEstudiantes);

        //5. Enlazamos el evento click con mi lista
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nombreEstudiante = estudiantes.get(position);
        Log.i("DAM","Estudiante seleccionado: "+nombreEstudiante);
    }
}

