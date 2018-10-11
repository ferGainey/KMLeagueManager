package com.example.fernando.kmleaguemanager.view.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fernando.kmleaguemanager.R;
import com.example.fernando.kmleaguemanager.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginFragment extends Fragment implements LoginPresenter.View {

    @BindView(R.id.buttonLogin)
    Button btn_login;

    @BindView(R.id.editTextUserName)
    EditText user_name;

    @BindView(R.id.editTextPassword)
    EditText password;


    public LoginFragment(){ setHasOptionsMenu(true);}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        btn_login.setOnClickListener(v -> this.verifyUserPassword());

    }

    @Override
    public Context context() {
        return getContext();
    }

    @Override
    public void verifyUserPassword(){
        Log.i("USER", this.user_name.getText().toString());
    }
}
