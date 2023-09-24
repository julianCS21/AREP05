# TALLER 05 : TALLER DE DE MODULARIZACIÓN CON VIRTUALIZACIÓN E INTRODUCCIÓN A DOCKER

Proyecto para profundizar temas de modularización por medio de virtualización usando Docker.

### Prerequisitos

Para elaborar este proyecto se requirio de : 


Maven: Apache Maven es una herramienta que maneja el ciclo de vida del programa.



Git: Es un sistema de control de versiones distribuido (VCS).



Java 17: Java es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.


Docker : automatiza el despliegue de aplicaciones dentro de contenedores de software, proporcionando una capa adicional de abstracción y automatización de virtualización de aplicaciones en múltiples sistemas operativos.



### Instalación

Clonamos el repositorio

```
    git clone 

```
Se accede a la carpeta principal del repositorio repositorio que acabamos de clonar

	 cd AREP05

Hacemos la construccion del proyecto

	 mvn package
---
### Corriendo
Corremos los siguientes comando
	
	 mvn clean package install
	 mvn clean install

Ahora corremos el servidor
	
**Windows**

	 java -cp "target/classes;target/dependency/*" org.example.server.SparkWebServer    

**Linux/MacOs**

	 java -cp "target/classes:target/dependency/*" org.example.server.SparkWebServer    

Por ultimo accedemos a nuestro navegador de confianza con la siguiente URL

	 http://localhost:4567/bonoForms

Aqui nos debera de cargar la siguiente pagina, con la cual podemos empezar a hacer las busquedas que necesitemos

![image](https://github.com/julianCS21/AREP05/assets/96396177/83973d80-690f-45e8-8973-910fe351bf32)


Tambien, para evitar todos estos pasos podemos bajar y correr la imagen desde el DockerHub con este comando


	docker run -d  -p 36001:6000 --name sparkapp juliancs21/sparkapp


 Donde 36001 es el puerto de la maquina fisica(puede ser cualquier puerto) y 6000 el puerto del contenedor(este si debe ser igual ya que se configuro para poder mapearse a ese puerto), y debe aparecer algo asi:


 ![image](https://github.com/julianCS21/AREP05/assets/96396177/33c42cd0-a1fe-4990-b391-2e11b9bb8d1a)


 

---
### Corriendo test

Ejecutamos el comando

	mvn test
	
---


### Arquitectura del programa.



La estructura del programa consta de varias capas, cada una con su función específica:

### server


La capa server actúa como punto de entrada para las solicitudes entrantes, dirigiéndolas hacia las partes apropiadas del programa.

### view


La capa view contiene las vistas que presenta el servidor.

### services

La capa services contiene la logica del programa, donde estan ubicados los endpoints del servidor web.


Esta estructura de capas facilita la organización, mantenimiento y escalabilidad del programa al separar las responsabilidades en componentes claros y definidos.





## Construido con

* [Maven](https://maven.apache.org/): Apache Maven es una herramienta que estandariza la configuración del ciclo de vida del proyecto.
* [Git](https://rometools.github.io/rome/):  Es un sistema de control de versiones distribuido (VCS).
* [Intellj](https://www.jetbrains.com/es-es/idea/): IntelliJ IDEA es un IDE que ayuda a los desarrolladores a escribir, depurar y administrar código de manera más eficiente y efectiva, con muchas características que facilitan el proceso de desarrollo de software.
* [Java 19](https://www.java.com/es/): Lenguaje de programación de propósito general con enfoque a el paradigma de orientado a objetos, y con un fuerte tipado de variables.
* [Html](https://developer.mozilla.org/es/docs/Learn/Getting_started_with_the_web/HTML_basics): es un lenguaje de marcado que estructura una página web y su contenido.
* [JavaScript](https://developer.mozilla.org/es/docs/Learn/JavaScript/First_steps/What_is_JavaScript): lenguaje de programación que los desarrolladores utilizan para hacer paginas web dinamicas.
* [CSS](https://developer.mozilla.org/es/docs/Web/CSS) Lenguaje para darles estilos a paginas web.
* [Docker](https://www.docker.com) Automatiza el despliegue de aplicaciones dentro de contenedores de software.


## Autor
* **[Julián David Castillo Soto](https://www.linkedin.com/in/julián-david-castillo-soto-118856216/)**  - [julianCS21](https://github.com/julianCS21)

## Licencia
**©** Julián David Castillo Soto, Estudiante de Ingeniería de Sistemas de la Universidad Escuela Colombiana de Ingeniería Julio Garavito.
