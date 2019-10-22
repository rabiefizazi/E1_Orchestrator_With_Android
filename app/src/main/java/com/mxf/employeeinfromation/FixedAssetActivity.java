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
import com.mxf.employeeinfromation.api.RetrofitFixedAsset;
import com.mxf.employeeinfromation.response.FAResponseEmployee;
import com.mxf.employeeinfromation.response.ServiceRequest1;
import okhttp3.RequestBody;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.Map;

public class FixedAssetActivity extends AppCompatActivity {


    private static final String AUTH = "Basic " + Base64.encodeToString(("rfizazi:fiz2011#").getBytes(), Base64.NO_WRAP);
    private ServiceRequest1 serviceRequest1;

    private TextView textViewAssetDescription;
    private TextView textViewAssetLocation;
    private TextView textViewAssetLocationDescription;
    private EditText editTextEmployeeNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixed_asset);

        textViewAssetDescription = findViewById(R.id.tv_asset_description);
        textViewAssetLocation = findViewById(R.id.tv_location);
        textViewAssetLocationDescription = findViewById(R.id.tv_location_description);
        editTextEmployeeNo = findViewById(R.id.et_assetNo);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> jsonParams = new ArrayMap<>();
                jsonParams.put("AssetNumber", editTextEmployeeNo.getText().toString());
                RequestBody requestBody =RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), new JSONObject(jsonParams).toString());

                Call<FAResponseEmployee> call = RetrofitFixedAsset.getInstance().getFixedAssetDataApi().getFixedAssetData(AUTH, requestBody);

                call.enqueue(new Callback<FAResponseEmployee>() {
                    @Override
                    public void onResponse(Call<FAResponseEmployee> call, Response<FAResponseEmployee> response) {
                        if (response.code() == 200) {

                            response.body();
                            String assetDescription = response.body().getFAServiceRequest1().getFAFsP1204W1204C().getFAData().getFAGridData().getFARowset().get(0).getZDL0129();
                            String location = response.body().getFAServiceRequest1().getFAFsP1204W1204C().getFAData().getFAGridData().getFARowset().get(0).getZLOC30();
                            String locationDescription = response.body().getFAServiceRequest1().getFAFsP1204W1204C().getFAData().getFAGridData().getFARowset().get(0).getZDL0141();


                            textViewAssetDescription.setText(assetDescription);
                            textViewAssetLocation.setText(location);
                            textViewAssetLocationDescription.setText(locationDescription);

                            Toast.makeText(FixedAssetActivity.this, "saved", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(FixedAssetActivity.this, "The Service is down. Please try again later", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<FAResponseEmployee> call, Throwable t) {
                        Log.d("error:", t.getMessage());
                    }
                });
            }
        });

    }
}