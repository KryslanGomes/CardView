package com.aperam.kryslan.praticaspadrao.View.Fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aperam.kryslan.praticaspadrao.R;
import com.aperam.kryslan.praticaspadrao.View.Adapters.ListaTelaInicialAdapter;
import com.aperam.kryslan.praticaspadrao.Model.Domain.TelaInicialCards;
import com.aperam.kryslan.praticaspadrao.View.Telas.PraticasActivity;
import com.arlib.floatingsearchview.FloatingSearchView;
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout;

import java.util.List;

import static com.aperam.kryslan.praticaspadrao.Model.BancoProvisorioFalso.BdExpandableList.GetDataDeVigenciaMainActivity;

public class DataDeVigenciaFrag extends AreasRelacionadasFrag{
    List<TelaInicialCards> mList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle saverdInstanceState){
        View view = inflater.inflate(R.layout.blanck_activity, container, false);  //pegando o fragment.

        /*final RecyclerView mRecyclerView = view.findViewById(R.id.rv_list);  //Pegando o recyclerView.
        mRecyclerView.setHasFixedSize(true);  //Vai garantir que o recyclerView não mude de tamanho.

        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener(){
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        lm.setOrientation(LinearLayoutManager.VERTICAL);  //Define que o layout da lista será na vertical.
        mRecyclerView.setLayoutManager(lm);

        mList = GetDataDeVigenciaMainActivity();
        ListaTelaInicialAdapter adapter = new ListaTelaInicialAdapter(container.getContext(), mList);
        adapter.setRecyclerViewOnClickListenerHack(this);  //Pega o parâmetro passado em PraticasAdapter para o clique na lista.
        mRecyclerView.setAdapter(adapter);

        //FLOATING SEARCHVIEW
        FloatingSearchView mSearchView = view.findViewById(R.id.floating_search_view);
        mSearchView.setVisibility(View.GONE);  //São poucas datas, portanto não precisa de barra de pesquisa.

        //FAZ O FAB DESAPARECER NESTA LISTA.
        RapidFloatingActionLayout rfaLayout = view.findViewById(R.id.fabContainerDataNivelAreaAreas);
        rfaLayout.setVisibility(View.GONE);
*/
        return view;
    }
    @SuppressLint("RestrictedApi")
    @Override
    public void onClickListener(View view, int position) {  //Aqui define o que acontece ao clicar em cada card.
        /*Intent intent = new Intent(getActivity(), PraticasActivity.class);
        TelaInicialCards telaInicialCards = mList.get(position);
        intent.putExtra("praticascards", telaInicialCards);

        // TRANSITIONS, CRIANDO ANIMAÇÃO.
        View textoAutor = view.findViewById(R.id.tituloListaTelaInicial);

        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
                Pair.create(textoAutor, "element2"));

        getActivity().startActivityForResult(intent, 1,options.toBundle());*/
    }
}
