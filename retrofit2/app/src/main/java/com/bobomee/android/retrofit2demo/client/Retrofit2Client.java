package com.bobomee.android.retrofit2demo.client;

import com.bobomee.android.htttp.retrofit2.converfactory.StringConverterFactory;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bobomee on 2016/5/19.
 */
public enum Retrofit2Client {

    INSTANCE;

    private final Retrofit.Builder retrofitBuilder;

    Retrofit2Client() {
        retrofitBuilder = new Retrofit.Builder()
                //设置OKHttpClient
                .client(okHttp.INSTANCE.getOkHttpClient())

                //Rx
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())

                //String转换器
                .addConverterFactory(StringConverterFactory.create())

                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
        ;


    }

    public Retrofit.Builder getRetrofitBuilder() {
        return retrofitBuilder;
    }


}
