package com.androidtutorialpoint.googlemapsnearbyplaces;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    PlacesModel placesModel;
    int i=0;
    int j=0;
    List<Double> latList=new ArrayList<>();
    List<Double> longList=new ArrayList<>();
    List<PlacesModel.ResultsBean> list=new ArrayList<>();
    List<DirectionModel> directionModelList=new ArrayList<>();
    float sum=0;
    float time=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placesModel=(PlacesModel) getIntent().getSerializableExtra("data");
        list.addAll(placesModel.getResults());

        for( i=0;i<list.size();i++)
        {
            latList.add(list.get(i).getGeometry().getLocation().getLat());
            longList.add(list.get(i).getGeometry().getLocation().getLng());
        }
        setUpPolyLine();



    }

    protected void setUpPolyLine() {

        for( i=0;i<latList.size()-1;i++)
        {
            LatLng source = new LatLng(latList.get(i),longList.get(i));
            LatLng destination = new LatLng(latList.get(i+1),longList.get(i+1));
            if (source != null && destination != null) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://maps.googleapis.com/maps/api/directions/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                getPolyline polyline = retrofit.create(getPolyline.class);

                polyline.getPolylineData(source.latitude + "," + source.longitude, destination.latitude + "," + destination.longitude,"AIzaSyAujbL9JIBBpJrdgspwoVyVb9HieYpj1Sw")
                        .enqueue(new Callback<JsonObject>() {
                            @Override
                            public void onResponse(@NonNull Call<JsonObject> call, @NonNull Response<JsonObject> response) {

                                JsonObject gson = new JsonParser().parse(response.body().toString()).getAsJsonObject();
                                DirectionModel directionModel=new Gson().fromJson(gson,DirectionModel.class);
                                directionModelList.add(directionModel);

                                j++;
                                if(j==latList.size()-2)
                                {
                                    for( i=0;i<directionModelList.size();i++)
                                    {
                                        sum=sum+directionModelList.get(i).getRoutes().get(0).getLegs().get(0).getDistance().getValue();
                                        time=time+directionModelList.get(i).getRoutes().get(0).getLegs().get(0).getDuration().getValue();
                                    }

                                    sum=sum/1000;
                                    time=time/60;


                                }


                            }

                            @Override
                            public void onFailure(@NonNull Call<JsonObject> call, Throwable t) {

                            }
                        });
            } else
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
        }
        }

}
