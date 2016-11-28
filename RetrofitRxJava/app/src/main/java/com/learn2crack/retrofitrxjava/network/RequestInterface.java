package com.learn2crack.retrofitrxjava.network;

import com.learn2crack.retrofitrxjava.model.Android;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("android/jsonarray/")
    Observable<List<Android>> register();
}
