package br.com.heiderlopes.carango.api;

import java.util.List;

import br.com.heiderlopes.carango.model.Carro;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CarroAPI {
    @GET("/carros/tipo/{tipo}")
    Call<List<Carro>> findBy(@Path("tipo") String tags);
}
