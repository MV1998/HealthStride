package com.mohit.varma.healthstride.healthtopics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.mohit.varma.healthstride.R;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class FoodSafety extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_safety);
//        MyOkhttp myOkhttp = new MyOkhttp();
//        myOkhttp.execute("https://square.github.io/okhttp/");
    }

}

class MyOkhttp extends AsyncTask<String,Void,String>{

    OkHttpClient okHttpClient = new OkHttpClient();
    Response response;
    @Override
    protected String doInBackground(String... strings) {
        Request request = new Request.Builder()
                .url("https://priaid-symptom-checker-v1.p.rapidapi.com/body/locations?language=en-gb")
                .get()
                .addHeader("x-rapidapi-host", "priaid-symptom-checker-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "d3bbfd2d44mshc315095e53452aap1027d5jsn01fd5ccccb30")
                .build();
        try {
             response = okHttpClient.newCall(request).execute();
        }catch (Exception r){
            r.printStackTrace();
        }
        return response.toString();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.d("TAG",s);
    }
}