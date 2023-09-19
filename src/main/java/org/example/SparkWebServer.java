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
        get("sin",(req,res) -> {

            int param = Integer.parseInt(req.params("num"));
            return "sin of " + req.params("num") + Math.sin(param);
        });

        get("cos",(req,res) -> {

            int param = Integer.parseInt(req.params("num"));
            return "cos of " + req.params("num") + Math.cos(param);
        });



        get("palindromo",(req,res) -> {

            String word = (req.params("word"));
            int i = 0;
            int j = word.length()-1;
            boolean valid = true;

            while (i != j) {
                char characterInit = word.charAt(i);
                char characterLast = word.charAt(j);
                if(characterInit != characterLast){
                    valid = false;
                    break;
                }
                i += 1;
                j -= 1;

            }
            if(valid){
                return "IS PALINDROME";
            }
            return "IS NOT PALINDROME";
        });


        get("magnitud",(req,res) -> {

            float num1 = Float.parseFloat(req.params("num1"));
            float num2 = Float.parseFloat(req.params("num2"));

            return "magnitud = " + Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2));

        });


    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}