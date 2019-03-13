package com.example.tgl10.foodji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClockListerner(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            validate(Username.getText().toString(), Password.getText().toString());

        }
        }};

    }

    private void validate(String userName, String userPassword) {
        if((userName.equals("admin")) && (userPassword.equals("1234"))) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }else{
                counter--;

                if (counter == 0) {
                    Login.setEnabled(false);
                }
            }
        }

}