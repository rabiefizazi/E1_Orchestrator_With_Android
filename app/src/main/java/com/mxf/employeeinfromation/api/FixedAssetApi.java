package com.mxf.employeeinfromation.api;

import com.mxf.employeeinfromation.response.FAResponseEmployee;
import com.mxf.employeeinfromation.response.ResponseEmployee;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface FixedAssetApi {

    @POST("FixedAssetSearch")
    Call<FAResponseEmployee> getFixedAssetData(@Header("Authorization") String auth, @Body RequestBody fixedAssetData);
}
