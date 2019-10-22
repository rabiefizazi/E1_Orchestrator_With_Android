package com.mxf.employeeinfromation.api;

import com.mxf.employeeinfromation.response.ResponseEmployee;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface EmployeeApi {

    @POST("SearchEmployeeByAN8")
    Call<ResponseEmployee> getEmployeeData(@Header("Authorization") String auth, @Body RequestBody employeeData);
}
