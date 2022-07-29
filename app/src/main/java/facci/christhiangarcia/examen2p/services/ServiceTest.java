package facci.christhiangarcia.examen2p.services;

import java.util.List;

import facci.christhiangarcia.examen2p.constants.Api;
import facci.christhiangarcia.examen2p.models.ModelTest;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceTest {


    //LIST
    @GET(Api.URL_GET)
    Call<List<ModelTest>> getData();
}
