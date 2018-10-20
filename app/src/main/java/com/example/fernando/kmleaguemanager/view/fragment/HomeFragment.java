package com.example.fernando.kmleaguemanager.view.fragment;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.example.fernando.kmleaguemanager.R;
import com.example.fernando.kmleaguemanager.presenter.HomePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment implements HomePresenter.View {

    @BindView(R.id.buttonPlayers)
    Button btn_players;

    @BindView(R.id.buttonFinances)
    Button btn_finances;

    @BindView(R.id.buttonTransfers)
    Button btn_transfers;

    private HomePresenter homePresenter;

    public HomeFragment(){ setHasOptionsMenu(true);}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.homePresenter = new HomePresenter();
        homePresenter.setView(this);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        btn_players.setOnClickListener(v -> this.onPlayersButtonClick());
        btn_finances.setOnClickListener(v -> this.onFinancesButtonClick());
        btn_transfers.setOnClickListener(v -> this.onTransfersButtonClick());

    }

    @Override
    public Context context() {
        return getContext();
    }

    @Override
    public void onPlayersButtonClick(){
        Log.i("USER", "Players");
    }

    @Override
    public void onFinancesButtonClick(){
        Log.i("USER", "Finances");
    }

    @Override
    public void onTransfersButtonClick(){
        Log.i("USER", "Transfers");
    }
}

