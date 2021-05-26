package com.example.license;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity2 extends AppCompatActivity {

    private TextView FullName;
    private TextView AddressOutput;
    private TextView NationalityOutput;
    private TextView DateOfDirthOutput;
    private TextView SexOutput;
    private TextView HeigthOutput;
    private TextView WeightOutput;
    private TextView BloodOutput;
    private TextView EyeOutput;


    Button button1;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.Back);
        builder = new AlertDialog.Builder(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Edit your License ID application?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(getApplicationContext(), "Edit", Toast.LENGTH_SHORT).show();
                    }
                }); builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                    }});
                AlertDialog alert = builder.create();
                alert.setTitle("Confirmation");
                alert.show();
            }
        });

        FullName = findViewById(R.id.Fullname2);
        AddressOutput = findViewById(R.id.Address2);
        NationalityOutput = findViewById(R.id.Nationality2);
        DateOfDirthOutput = findViewById(R.id.DateOfBirth2);
        SexOutput = findViewById(R.id.Sex2);
        HeigthOutput = findViewById(R.id.Height2);
        WeightOutput= findViewById(R.id.Weight2);
        BloodOutput=findViewById(R.id.Bloodtype2);
        EyeOutput=findViewById(R.id.EYE2);

        String n1 = getIntent().getStringExtra("LASTNAME");
        String n2 = getIntent().getStringExtra("FIRSTNAME");
        String n3= getIntent().getStringExtra("MIDDLENAME");
        String n4 = getIntent().getStringExtra("ADDRESS");
        String n5 = getIntent().getStringExtra("NAT");
        String n6 = getIntent().getStringExtra("YEAR");
        String n7= getIntent().getStringExtra("MONTH");
        String n8 = getIntent().getStringExtra("DAY");
        String n9 = getIntent().getStringExtra("SEX");
        String n10 = getIntent().getStringExtra("HEI");
        String n11 = getIntent().getStringExtra("WEI");
        String n12 = getIntent().getStringExtra("BLOODTYPE");
        String n13 = getIntent().getStringExtra("EYECOLOR");


        FullName.setText(n1+","+n2+" "+n3+".");
        AddressOutput.setText(n4);
        NationalityOutput.setText(n5);
        DateOfDirthOutput.setText(n6+"/"+n7+"/"+n8);
        SexOutput.setText(n9);
        HeigthOutput.setText(n10);
        WeightOutput.setText(n11);
        BloodOutput.setText(n12);
        EyeOutput.setText(n13);


    }
    public void Exit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}