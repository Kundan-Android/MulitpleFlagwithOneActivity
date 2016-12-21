package com.example.dell.mulitpleflagwithoneactivity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginFrag loginFrag = new LoginFrag();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1,loginFrag);
        fragmentTransaction.commit();
    }
    public void loginButton(String d, String c){
        Bundle b = new Bundle();
        b.putString("value",d);
        b.putString("value2",c);

        Welcome welcome=new Welcome();
        welcome.setArguments(b);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container1,welcome);
        fragmentTransaction.commit();

    }
}
