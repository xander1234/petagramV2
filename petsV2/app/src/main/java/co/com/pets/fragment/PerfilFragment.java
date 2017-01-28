package co.com.pets.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import co.com.pets.Mascota;
import co.com.pets.R;
import co.com.pets.adapter.MascotaAdaptador;
import co.com.pets.adapter.MascotaPortadaAdaptador;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> perritos;
    private RecyclerView listaPerritos;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        // esto ya existe en el fragment
        listaPerritos = (RecyclerView) v.findViewById(R.id.rvMascotasDetalle);

        /*
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaPerritos.setLayoutManager(llm);
        */

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        listaPerritos.setLayoutManager(glm);

        inicializarListaMascotas1();
        inicializarAdaptador();

        return v;
    
    }

    public MascotaPortadaAdaptador adaptador1;
    private void inicializarAdaptador(){
        adaptador1 = new MascotaPortadaAdaptador(perritos, getActivity());
        listaPerritos.setAdapter(adaptador1);
    }

    // Llena los datos
    public void inicializarListaMascotas1(){
        perritos = new ArrayList<Mascota>();

        perritos.add(new Mascota(R.drawable.astronauta6,"astronauta6",3));
        perritos.add(new Mascota(R.drawable.buldog2, "buldog2", 4));
        perritos.add(new Mascota(R.drawable.buldog3, "buldog3", 5));
        perritos.add(new Mascota(R.drawable.perro1,"perro1",3));
        perritos.add(new Mascota(R.drawable.perro4, "perro4", 5));
        perritos.add(new Mascota(R.drawable.perro5, "perro5", 3));
        perritos.add(new Mascota(R.drawable.perro6, "perro6", 3));
        perritos.add(new Mascota(R.drawable.perro7, "perro7", 4));
        perritos.add(new Mascota(R.drawable.perro8, "perro8", 1));
    }
    
    
    

}
