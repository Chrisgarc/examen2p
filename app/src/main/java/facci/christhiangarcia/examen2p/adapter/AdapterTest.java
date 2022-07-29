package facci.christhiangarcia.examen2p.adapter;

import java.util.List;

import facci.christhiangarcia.examen2p.constants.Api;
import facci.christhiangarcia.examen2p.models.ModelTest;
import facci.christhiangarcia.examen2p.services.ServiceTest;
import retrofit2.Call;

public class AdapterTest extends BaseAdapter implements ServiceTest {

    private ServiceTest serviceTest;

    public AdapterTest(){
        super(Api.BASE_URL);
        serviceTest = createService(ServiceTest.class);
    }

    @Override
    public Call<List<ModelTest>> getData() {
        return serviceTest.getData();
    }
}
