package facci.christhiangarcia.examen2p.models;

import com.google.gson.annotations.SerializedName;

public class ModelTest {

    @SerializedName("quote")
    String id;
    @SerializedName("author")
    String url;
    @SerializedName("series")
    String img;

    public ModelTest(){}

    public ModelTest(String id, String url, String img) {
        this.id = id;
        this.url = url;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
