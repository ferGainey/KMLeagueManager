package com.example.fernando.kmleaguemanager.presenter;


public class LoginPresenter extends Presenter<LoginPresenter.View> {


    /*public void onLoginButtonClick(){
        getView().verifyUserPassword("abc", "dfg");
    }*/

    public interface View extends Presenter.View{

        void verifyUserPassword();

    }
}
