package co.com.pets.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import co.com.pets.Mascota;
import co.com.pets.adapter.MascotaAdaptador;
import co.com.pets.R;


public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_recyclerview,container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);



        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaContactos();
        inicializarAdaptador();



        return v;
    }

    public MascotaAdaptador adaptador;

    public void  inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarListaContactos(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perro,"Perro",0));
        mascotas.add(new Mascota(R.drawable.cerdo,"Cerdo",0));
        mascotas.add(new Mascota(R.drawable.elefante,"Elefante",0));
        mascotas.add(new Mascota(R.drawable.gato,"Gato",0));
        mascotas.add(new Mascota(R.drawable.leon,"Leon",0));
        mascotas.add(new Mascota(R.drawable.panda_bear,"Oso Panda",0));
        mascotas.add(new Mascota(R.drawable.vaca,"Vaca",0));
    }

}
