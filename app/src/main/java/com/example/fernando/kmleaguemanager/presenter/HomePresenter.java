package com.example.fernando.kmleaguemanager.presenter;


public class HomePresenter extends Presenter<HomePresenter.View> {



    public interface View extends Presenter.View{

        void onPlayersButtonClick();

        void onFinancesButtonClick();

        void onTransfersButtonClick();

    }
}
