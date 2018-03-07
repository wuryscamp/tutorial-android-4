package com.wuriyanto.tutorial4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button btnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.et_name);
        btnClickMe = (Button) findViewById(R.id.btn1);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validate();
            }
        });
    }

    private void validate(){
        if(editTextName.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Name cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), editTextName.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
