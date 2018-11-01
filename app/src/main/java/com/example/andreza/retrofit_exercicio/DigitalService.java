package com.example.andreza.retrofit_exercicio;

import java.util.List;

import com.example.andreza.retrofit_exercicio.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DigitalService {

    public static final String BASE_URL = "https://digitalhouse.herokuapp.com/";

    @GET("/posts")

    Call<List<Post>> listaDePosts();
}
