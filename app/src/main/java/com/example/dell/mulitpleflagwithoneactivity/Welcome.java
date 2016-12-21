package com.example.dell.mulitpleflagwithoneactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Welcome extends Fragment {


    TextView textView,textview2;

    public Welcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_welcome, container, false);
        textView = (TextView) v.findViewById(R.id.textview1);
        textview2 = (TextView) v.findViewById(R.id.textview2);
        Bundle b=getArguments();
          String name=b.getString("value");
        String pas = b.getString("value2");

         textView.setText(name);
        textview2.setText(pas);

        return v;
    }

}
