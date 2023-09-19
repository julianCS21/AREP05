package org.example;

import static spark.Spark.port;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */


public class SparkWebServer {

    public static void main(String... args){
        port(getPort());
        page pageForm = new page();

        get("hello", (req,res) -> "Hello Docker!");
        get("bonoForms",(req,res) -> pageForm.getPage());
        get("sin/:num",(req,res) -> {

            int param = Integer.parseInt(req.params(":num"));
            return "sin of " + req.params(":num") + Math.sin(param);
        });

        get("cos/:num",(req,res) -> {

            int param = Integer.parseInt(req.params(":num"));
            return "cos of " + req.params(":num") + Math.sin(param);
        });



        get("palindromo/:num",(req,res) -> {

            int param = Integer.parseInt(req.params(":num"));
            return "Sin of " + req.params(":num") + Math.sin(param);
        });


        get("magnitud/:num1/:num2",(req,res) -> {

            int param = Integer.parseInt(req.params(":num"));
            return "Sin of " + req.params(":num") + Math.sin(param);
        });


    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}