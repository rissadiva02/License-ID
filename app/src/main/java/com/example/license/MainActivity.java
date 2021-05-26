package com.example.license;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    EditText lname;
    EditText fname;
    EditText mname;
    EditText add;
    EditText nat;
    EditText height;
    EditText weight;
    EditText sex;
    EditText year;
    EditText month;
    EditText date;
    EditText blood;
    EditText eye;
    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lname = findViewById(R.id.Last_Name);
        fname = findViewById(R.id.First_Name);
        mname = findViewById(R.id.Middle_Name);
        add = findViewById(R.id.Address);
        blood = findViewById(R.id.Blood_type);
        eye =findViewById(R.id.Eye_Color);
        nat = findViewById(R.id.Nationality);
        height = findViewById(R.id.Height);
        weight = findViewById(R.id.Weight);
        sex = findViewById(R.id.Sex);
        year = findViewById(R.id.Year);
        month = findViewById(R.id.Month);
        date = findViewById(R.id.Day);
        Submit = findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("Confirmation");
                builder.setMessage("Submit your License ID?");
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String lnameExtra = lname.getText().toString();
                        String fnameExtra = fname.getText().toString();
                        String mnameExtra = mname.getText().toString();
                        String addExtra = add.getText().toString();
                        String natExtra = nat.getText().toString();
                        String heightExtra = height.getText().toString();
                        String weightExtra = weight.getText().toString();
                        String sexExtra = sex.getText().toString();
                        String yearExtra = year.getText().toString();
                        String monthExtra = month.getText().toString();
                        String dateExtra = date.getText().toString();
                        String bloodExtra = blood.getText().toString();
                        String eyeExtra = eye.getText().toString();

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        intent.putExtra("LASTNAME", lnameExtra);
                        intent.putExtra("FIRSTNAME", fnameExtra);
                        intent.putExtra("MIDDLENAME", mnameExtra);
                        intent.putExtra("ADDRESS", addExtra);
                        intent.putExtra("NAT", natExtra);
                        intent.putExtra("HEI", heightExtra);
                        intent.putExtra("WEI", weightExtra);
                        intent.putExtra("SEX", sexExtra);
                        intent.putExtra("YEAR", yearExtra);
                        intent.putExtra("MONTH", monthExtra);
                        intent.putExtra("DAY", dateExtra);
                        intent.putExtra("BLOODTYPE", bloodExtra);
                        intent.putExtra("EYECOLOR", eyeExtra);
                        startActivity(intent);
                    }
                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();

            }
        });}}