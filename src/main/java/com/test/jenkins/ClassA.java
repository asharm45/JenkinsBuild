package com.test.jenkins;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ClassA {

    public static void main(String[] args) {

        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Creating a json array
        JSONArray array = new JSONArray();
        array.add("e-mail: krishna_kasyap@gmail.com");
        array.add("phone: 9848022338");
        array.add("city: Hyderabad");
        array.add("Area: Madapur");
        array.add("State: Telangana");
        jsonObject.put("contact",array);
        //Creating a json array
        JSONArray array1 = new JSONArray();
        array1.add("e-mail: krishna_kasyap11@gmail.com");
        array1.add("phone: 9848022338");
        array1.add("city: Hyderabad");
        array1.add("Area: Madapur");
        array1.add("State: Telangana");
        //Adding array to the json object
        jsonObject.put("contact",array1);
        /*try {
            FileWriter file = new FileWriter("./json_array_output.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println("JSON file created: "+jsonObject);
    }

}
