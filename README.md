#MI_SOLUCION
##Niveles realizados:  1, 2 y 3
###### mi_solucion1, mi_solucion2 y mi_solucion3

Los 3 proyectos se realizaron en IntelliJ Idea, con Maven.
Por lo que para compilar solo es necesario contar con Java y Maven instalados en la maquina.
Con las variables de entorno %JAVA_HOME% y %MAVEN_HOME% configuradas con la ruta donde cada aplicacion esta instalada y agregar estas a %PATH% en M$Windows.
En linux, dependiendo de la distribucion, pueden configurar las variables en .bashrc de su home o en el arvhivo profile, donde necesitaran tambien agregarlas a $PATH

Para compilar los proyectos, se debe ingresar a la carpeta del proyecto y ejecutar:
```
mvn package
```
Este se compilara, generando el archivo .jar correspondiente en la subcarpeta "target", dentro de la carpeta principal del proyecto.
Luego para ejecutarlo basta con escribir en consola : java -jar <nombre del ejecutable de la aplicacion> <parametro 1> <parametro 2> (los ultimos solo aplican a la solucion 1 que es una aplicacion de consola y recibe 2 parametros, para las demas obviar.)

Ejemplo:
```
java -jar mi_solucion1-0.0.1-SNAPSHOT.jar entrada.json salida.json
```

Lo anterior ejecutara la aplicacion de consola mi_solucion1 recibiendo como entrada el json en el archivo entrada.json y luego de analizarlo escribira el resultado en salida.json

###### Cada proyecto incluye su propio README.md
###### Pero aqui hay un resumen:

#Resumen README's:

##__mi_solucion1__ (primer proyecto, corresponde al desafio nivel1)

Consiste en una aplicacion de consola que lee un archivo json con la informacion del periodo, la analiza y escribe el resultado en otro archivo.
La aplicacion recibe 2 parametros que en orden de entrada son, el archivo a leer (archivo que contiene el json del periodo a analizar) y el archivo de salida, en el que escribira el json correspondiente al resultado del analisis del periodo entregado.

##__mi_solucion2__ (segundo proyecto, corresponde al desafio nivel2)

Consiste en una aplicacion de consola que al ejecutarse consume un servicio rest ([Generador Datos Desafio](https://github.com/previred/Generador_Datos_Desafio_Uno)). Esta aplicacion debe estar operando en el puerto 8080
La aplicacion mi_solucion2 esta configurada para trabajar en el **puerto 9090** con tal de no topar. Para cambiar la configuracion del puerto solo es necesario modificar el archivo :
**mi_solucion2/src/main/resources/application.properties**
cambiando el numero de puerto por uno disponible.

##__mi_solucion3__ (tercer proyecto, corresponde al desafio nivel3)
Consiste en una API REST desarrollada con Spring Boot y Swagger2.
La aplicacion, configurada para operar en el **puerto 9999**, lee el servicio rest __Generador Datos Desafio__, operando en el puerto 8080. Desde la cual obtiene el json del Periodo, lo analiza y devuelve el resultado en la raiz, para hacelo mas conveniente y facil de encontrar (http://localhost:9999/)
Para una mejor visualizacion del resultado se recomienda utilizar [PostMan](https://www.getpostman.com/)
Ingresando la URL antes indicada y en Header pasando el parametro 'Accept' con el valor 'application/json'

