package com.example.shachi.loginpage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {


//    private static final String[] DUMMY_CREDENTIALS = new String[]{
//            "foo@example.com:hello", "bar@example.com:world"
//    };
//
//

    // UI references.
    TextView mtvlogin,mtvforgotPassword,mtvSignup;
    AutoCompleteTextView mtvEmail;
    EditText metpassword;
    Button mblogin;

    String getEmail,getPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.

        getSupportActionBar().hide();

        mtvlogin = (TextView)findViewById(R.id.textViewLoginDetails);
        mtvforgotPassword = (TextView)findViewById(R.id.textViewForgotPassword);
        mtvSignup = (TextView)findViewById(R.id.textViewSignUp);

        mtvEmail = (AutoCompleteTextView)findViewById(R.id.autoCompTextEmailId);

        metpassword = (EditText)findViewById(R.id.editTextPassword);

        mblogin = (Button)findViewById(R.id.buttonLogin);


        mblogin.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {

                if(mtvEmail.getText().toString().isEmpty() != true && metpassword.getText().toString().isEmpty() != true)
                {
                    Intent ilogin = new Intent(LoginActivity.this,loginSuccess.class);
                    startActivity(ilogin);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Please enter login details.", Toast.LENGTH_SHORT).show();
                }

            }


        });


        mtvforgotPassword.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin = new Intent(LoginActivity.this,forgotPassword.class);
                startActivity(ilogin);
            }
        });


        mtvSignup.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin = new Intent(LoginActivity.this,signup.class);
                startActivity(ilogin);
            }
        });


    }



    /**
     * Callback received when a permissions request has been completed.
     */


    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */





    /**
     * Represents an asynchronous login/registration task used to authenticate
     * the user.
     */

}

