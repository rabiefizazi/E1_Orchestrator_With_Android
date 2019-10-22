package com.mxf.employeeinfromation.api;

import android.util.Base64;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class RetrofitEmployee {


    private static final String BASE_URL = "http://vjdewebpy.elrancho01.local:9093/jderest/orchestrator/";
    private static RetrofitEmployee mInstance;
    private Retrofit retrofit;

    private RetrofitEmployee() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
    }

    public static synchronized RetrofitEmployee getInstance() {


        if (mInstance == null) {
            mInstance = new RetrofitEmployee();
        }

        return mInstance;
    }

    public EmployeeApi getEmployeeDataApi() {
        return retrofit.create(EmployeeApi.class);
    }

}
