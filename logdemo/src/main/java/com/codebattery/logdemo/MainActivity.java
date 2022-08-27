package com.codebattery.logdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Logger.d("debug");
//        Logger.e("error");
//        Logger.w("warning");
//        Logger.v("verbose");
//        Logger.i("information");
//        Logger.wtf("wtf!!!!");

//        Logger.d("hello %s", "world");
        Logger.t("TAG").d("hello world ssss");

//        try {
//            JSONObject person = new JSONObject();
//            person.put("phone", "12315");
//            JSONObject address = new JSONObject();
//            address.put("country", "china");
//            address.put("province", "fujian");
//            address.put("city", "xiamen");
//            person.put("address", address);
//            person.put("married", true);
//
//            String jsonStr = person.toString();
//            Logger.json(jsonStr);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><phone>12315</phone><married>true</married></root>";
//        Logger.xml(xml);


//        String[] arr = {"Jerry", "Emily", "小五", "hongyang", "abv"};
//        Logger.d(arr);
//
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        Logger.d(list);
//
//        HashMap map = new HashMap();
//        map.put("key1","value1");
//        map.put("key2","value2");
//        Logger.d(map);

    }
}