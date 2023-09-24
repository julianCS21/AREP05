package org.example.server;

import org.example.services.CosServices;
import org.example.services.MagService;
import org.example.services.PalinService;
import org.example.services.SinService;
import org.example.view.page;
import org.json.JSONObject;

import static spark.Spark.port;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */


public class SparkWebServer {

    public static void main(String... args) {
        port(getPort());
        runServices();
        page pageForm = new page();

        get("hello", (req,res) -> "Hello Docker!");
        get("bonoForms",(req,res) -> pageForm.getPage());

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static void runServices(){
        SinService sc = new SinService();
        CosServices cs = new CosServices();
        PalinService ps = new PalinService();
        MagService ms = new MagService();

    }

}