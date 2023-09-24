package org.example.services;

import org.json.JSONObject;

import static spark.Spark.get;

public class SinService {


    public SinService(){

        get("sin",(req,res) -> {
            res.type("application/json");

            int param = Integer.parseInt(req.queryParams("num"));
            JSONObject jsonResponse = new JSONObject();
            jsonResponse.put("resultado", "sin of " + req.queryParams("num") +  " " + Math.sin(param));

            return jsonResponse.toString();
        });
    }
}
