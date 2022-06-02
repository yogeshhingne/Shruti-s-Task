package com.retro.service.retrofitMicro.service;

import com.retro.service.retrofitMicro.dto.User;
import com.retro.service.retrofitMicro.newretro.RepositoryInterface;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
@Service
public class UserServiceImpl {
    private RepositoryInterface service;

    public UserServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(RepositoryInterface.class);

    }
    public List<User> getAll() throws IOException {
        Call<List<User>> retrofitCall = service.getAll();
        Response<List<User>> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }
    public User getUser(int id) throws IOException {
        Call<User> retrofitCall = service.getUser(id);
        Response<User> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }

    public User insertUser(User user) throws IOException {
        Call<User> retrofitCall = service.insertUser(user);
        Response<User> response = retrofitCall.execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }
}

