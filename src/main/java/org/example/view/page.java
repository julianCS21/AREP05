package org.example.view;

public class page {

    public String getPage(){
        return """
                        <!DOCTYPE html>
                        <html>
                        <head>
                          <title>Spark test with Docker</title>
                        </head>
                        <body>
                          <input type="text" id="campo1" placeholder="seno">
                          <button onclick="actualizarSin()">Actualizar</button>
                          <input type="text" id="campo2" placeholder="coseno">
                          <button onclick="actualizarCos()">Actualizar</button>
                          <input type="text" id="campo3" placeholder="palindromo">
                          <button onclick="actualizarPalin()">Actualizar</button>
                          <input type="text" id="campo4" placeholder="magnitud">
                          <button onclick="actualizarMag()">Actualizar</button>
                          <h1 id="resultado"></h1>
                                
                          <script>
                            function actualizarSin() {
                              let campo1 = document.getElementById('campo1').value;
                              fetch("/sin?num=" + campo1)
                                .then(response => response.json())
                                .then(data => {
                                    const resultado = document.getElementById('resultado');
                                    resultado.textContent = data.resultado;
                                })
                            .catch(error => {
                              console.error('Error:', error);
                                });
                            }
                                
                            function actualizarCos() {
                              let campo2 = document.getElementById('campo2').value;
                              fetch("/cos?num=" + campo2)
                                .then(response => response.json())
                                .then(data => {
                                    const resultado = document.getElementById('resultado');
                                    resultado.textContent = data.resultado;
                                })
                            .catch(error => {
                              console.error('Error:', error);
                                });
                            }
                                
                            function actualizarPalin() {
                              let campo3 = document.getElementById('campo3').value;
                              fetch("/palindromo?word=" + campo3)
                                .then(response => response.json())
                                .then(data => {
                                    const resultado = document.getElementById('resultado');
                                    resultado.textContent = data.resultado;
                                })
                            .catch(error => {
                              console.error('Error:', error);
                                });
                            }
                            function actualizarMag() {
                                let campo4Value = document.getElementById('campo4').value;
                                let valores = campo4Value.split(",");
                                let campo4 = valores[0];
                                let campo5 = valores[1];
                              fetch("/magnitud?num1=" + campo4 + "&num2=" +campo5)
                                .then(response => response.json())
                                .then(data => {
                                    const resultado = document.getElementById('resultado');
                                    resultado.textContent = data.resultado;
                                })
                            .catch(error => {
                              console.error('Error:', error);
                                });
                            }
                          </script>
                        </body>
                        </html>
                """;

    }
}
