package com.example.rose.sharedpreference.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.rose.sharedpreference.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private OnLoginFragmentListener listener;


    public LoginFragment() {
        // Required empty public constructor
    }

    public void setListener(OnLoginFragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        final EditText usernameText = view.findViewById(R.id.text_username);
        final EditText passwordText = view.findViewById(R.id.text_password);
        Button loginButton = view.findViewById(R.id.button_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameText.getText().toString();
                String password = passwordText.getText().toString();
                listener.onLoginClicked(view, username, password);
            }
        });

        return view;

    }

    public interface OnLoginFragmentListener {
        void onLoginClicked(View view, String username, String password);
    }





}
