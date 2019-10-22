package com.mxf.employeeinfromation.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFixedAsset {


    private static final String BASE_URL = "http://vjdewebpy.elrancho01.local:9093/jderest/orchestrator/";
    private static RetrofitFixedAsset mInstance;
    private Retrofit retrofit;

    private RetrofitFixedAsset() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build();
    }

    public static synchronized RetrofitFixedAsset getInstance() {


        if (mInstance == null) {
            mInstance = new RetrofitFixedAsset();
        }

        return mInstance;
    }

    public FixedAssetApi getFixedAssetDataApi() {
        return retrofit.create(FixedAssetApi.class);
    }

}
