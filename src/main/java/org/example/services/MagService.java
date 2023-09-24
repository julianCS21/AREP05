package org.example.services;

import org.json.JSONObject;

import static spark.Spark.get;

public class MagService {

    public MagService(){
        get("magnitud",(req,res) -> {

            res.type("application/json");
            float num1 = Float.parseFloat(req.queryParams("num1"));
            float num2 = Float.parseFloat(req.queryParams("num2"));
            JSONObject jsonResponse = new JSONObject();
            jsonResponse.put("resultado", Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2)));

            return jsonResponse.toString();

        });
    }
}
