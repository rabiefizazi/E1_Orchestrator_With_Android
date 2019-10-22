package com.mxf.employeeinfromation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btn_fixedAsset_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fixedAssetIntent = new Intent(HomeActivity.this, FixedAssetActivity.class);
                startActivity(fixedAssetIntent);
            }
        });

        findViewById(R.id.btn_employee_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent employeeDataIntent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(employeeDataIntent);
            }
        });
    }
}
