package org.example;

public class page {

    public String getPage(){
        String html =
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <title>Formulario con Fetch GET</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Formulario con Fetch GET</h1>\n" +
                "    <form id=\"miFormulario\">\n" +
                "        <label for=\"campo1\">Campo 1:</label>\n" +
                "        <input type=\"text\" id=\"campo1\" name=\"campo1\"><br>\n" +
                "\n" +
                "        <label for=\"campo2\">Campo 2:</label>\n" +
                "        <input type=\"text\" id=\"campo2\" name=\"campo2\"><br>\n" +
                "\n" +
                "        <label for=\"campo3\">Campo 3:</label>\n" +
                "        <input type=\"text\" id=\"campo3\" name=\"campo3\"><br>\n" +
                "\n" +
                "        <label for=\"campo4\">Campo 4:</label>\n" +
                "        <input type=\"text\" id=\"campo4\" name=\"campo4\"><br>\n" +
                "\n" +
                "        <input type=\"submit\" value=\"Enviar\">\n" +
                "    </form>\n" +
                "\n" +
                "    <div id=\"resultado\"></div>\n" +
                "\n" +
                "    <script>\n" +
                "        document.getElementById(\"miFormulario\").addEventListener(\"submit\", function (event) {\n" +
                "            event.preventDefault();\n" +
                "            var campo1 = document.getElementById(\"campo1\").value;\n" +
                "            var campo2 = document.getElementById(\"campo2\").value;\n" +
                "            var campo3 = document.getElementById(\"campo3\").value;\n" +
                "            var campo4 = document.getElementById(\"campo4\").value;\n" +
                "var URL =" + "http://localhost:36000/" + "\n"+
                "                    fetch(URL" + "sin" + ")\n" +
                        "                .then(response => response.text())\n" +
                        "                .then(data => {\n" +
                        "                    document.getElementById(\"resultado\").innerHTML = \"Resultado Campo 1: \" + data;\n" +
                        "                });\n" +
                        "\n" +
                        "            fetch('URL2?campo2=' + campo2)\n" +
                        "                .then(response => response.text())\n" +
                        "                .then(data => {\n" +
                        "                    document.getElementById(\"resultado\").innerHTML += \"<br>Resultado Campo 2: \" + data;\n" +
                        "                });\n" +
                        "\n" +
                        "            fetch('URL3?campo3=' + campo3)\n" +
                        "                .then(response => response.text())\n" +
                        "                .then(data => {\n" +
                        "                    document.getElementById(\"resultado\").innerHTML += \"<br>Resultado Campo 3: \" + data;\n" +
                        "                });\n" +
                        "\n" +
                        "            fetch('URL4?campo4=' + campo4)\n" +
                        "                .then(response => response.text())\n" +
                        "                .then(data => {\n" +
                        "                    document.getElementById(\"resultado\").innerHTML += \"<br>Resultado Campo 4: \" + data;\n" +
                        "                });\n" +
                        "        });" +
                        "        });\n" +
                        "    </script>\n" +
                        "</body>\n" +
                        "</html>";
        return html;
    }
}
