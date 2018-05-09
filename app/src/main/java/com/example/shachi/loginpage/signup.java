package com.example.shachi.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {


    EditText mtextName,mtextSurname,mtextEmail,mtextPassword;
    Button mSignup ;

    public String getName,getSurname,getMail,getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        mtextName = (EditText) findViewById(R.id.editText2);
        mtextSurname = (EditText) findViewById(R.id.editText3);
        mtextEmail = (EditText) findViewById(R.id.editText4);
        mtextPassword = (EditText) findViewById(R.id.editText5);

        mSignup = (Button)findViewById(R.id.button);



        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getName = mtextName.getText().toString();
                getSurname = mtextSurname.getText().toString();
                getMail = mtextEmail.getText().toString();
                getPassword = mtextPassword.getText().toString();

                if(getName.isEmpty() != true && getSurname.isEmpty() != true && getMail.isEmpty() != true && getPassword.isEmpty() != true)
                {
                    Toast.makeText(signup.this, "Verification Link sent to "+ getMail, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(signup.this, "Please enter all the details ", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
