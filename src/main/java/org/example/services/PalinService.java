package org.example.services;

import org.json.JSONObject;

import static spark.Spark.get;

public class PalinService {


    public PalinService(){
        get("palindromo",(req,res) -> {
            res.type("application/json");

            String word = (req.queryParams("word"));
            word = word.replaceAll("\\s+", "").toLowerCase();
            boolean valid = true;

            int longitud = word.length();
            for (int i = 0; i < longitud / 2; i++) {
                if (word.charAt(i) != word.charAt(longitud - i - 1)) {
                    valid = false;
                }
            }
            JSONObject jsonResponse = new JSONObject();
            if(valid) {
                jsonResponse.put("resultado", "IS PALINDROME");
            }
            else{
                jsonResponse.put("resultado", "IS NOT PALINDROME");
            }


            return jsonResponse.toString();

        });



    }
}
