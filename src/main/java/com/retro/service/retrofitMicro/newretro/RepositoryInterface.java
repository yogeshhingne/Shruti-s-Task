package com.retro.service.retrofitMicro.newretro;

import com.retro.service.retrofitMicro.dto.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface RepositoryInterface {
    @POST("insertUser")
    public  Call<User> insertUser(@Body User user);
    @GET("user/{id}")
    public Call<User> getUser(@Path("id") long id);
    @GET("allUser")
    public Call<List<User>> getAll();

}