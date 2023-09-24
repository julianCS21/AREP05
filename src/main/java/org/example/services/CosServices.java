package org.example.services;

import org.json.JSONObject;

import static spark.Spark.get;

public class CosServices {


    public CosServices(){
        get("cos",(req,res) -> {
            res.type("application/json");

            int param = Integer.parseInt(req.queryParams("num"));
            JSONObject jsonResponse = new JSONObject();
            jsonResponse.put("resultado", "cos of " + req.queryParams("num") +  " " + Math.cos(param));

            return jsonResponse.toString();
        });




    }
}
