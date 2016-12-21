package com.example.dell.mulitpleflagwithoneactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFrag extends Fragment {
    EditText et1, et2;
    Button b;



    public LoginFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_login, container, false);
        et1 = (EditText) view.findViewById(R.id.edit1);
        et2 = (EditText) view.findViewById(R.id.edit2);
        b = (Button) view.findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                String d = et1.getText().toString();
                String c = et2.getText().toString();
                m.loginButton(d,c);
            }
        });
        return view;
    }

}
