package com.mxf.employeeinfromation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mxf.employeeinfromation.api.RetrofitEmployee;
import com.mxf.employeeinfromation.response.*;
import okhttp3.RequestBody;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String AUTH = "Basic " + Base64.encodeToString(("rfizazi:fiz2011#").getBytes(), Base64.NO_WRAP);
    private ServiceRequest1 serviceRequest1;

    private TextView textViewEmployeeName;
    private TextView textViewEmployeeCompany;
    private EditText editTextEmployeeNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewEmployeeName = findViewById(R.id.tv_asset_description);
        textViewEmployeeCompany = findViewById(R.id.tv_location);
        editTextEmployeeNo = findViewById(R.id.et_assetNo);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> jsonParams = new ArrayMap<>();
                jsonParams.put("EmployeeNo", editTextEmployeeNo.getText().toString());
                RequestBody requestBody =RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), new JSONObject(jsonParams).toString());

                Call<ResponseEmployee> call = RetrofitEmployee.getInstance().getEmployeeDataApi().getEmployeeData(AUTH, requestBody);

                call.enqueue(new Callback<ResponseEmployee>() {
                    @Override
                    public void onResponse(Call<ResponseEmployee> call, Response<ResponseEmployee> response) {
                        if (response.code() == 200) {

                            response.body();
                            String employeeName = response.body().getServiceRequest1().getFsP0801W0801A().getData().getGridData().getRowset().get(0).getZALPH15();
                            String employeeCompany = response.body().getServiceRequest1().getFsP0801W0801A().getData().getGridData().getRowset().get(0).getZDL01642();

                            textViewEmployeeName.setText(employeeName);
                            textViewEmployeeCompany.setText(employeeCompany);

                            Toast.makeText(MainActivity.this, "saved", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "The Service is down. Please try again later", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseEmployee> call, Throwable t) {
                        Log.d("error:", t.getMessage());
                    }
                });
            }
        });

    }
}