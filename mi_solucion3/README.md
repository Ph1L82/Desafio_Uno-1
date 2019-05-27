#MI_SOLUCION3

Consiste en una API REST desarrollada con Spring Boot y Swagger2.
La aplicacion, configurada para operar en el **puerto 9999**, lee el servicio rest __Generador Datos Desafio__, operando en el __puerto 8080__. Desde la cual obtiene el json del Periodo, lo analiza y devuelve el resultado en la raiz, para hacelo mas conveniente y facil de encontrar (http://localhost:9999/)
Si necesitan cambiar el puerto de la aplicacion, pueden hacerlo modificando el archivo: **__mi_solucion3/src/main/resources/application.properties__**

Para una mejor visualizacion del resultado se recomienda utilizar [PostMan](https://www.getpostman.com/)
Ingresando la URL antes indicada y en Header pasando el parametro 'Accept' con el valor 'application/json'

Para compilar el proyecto, se debe ingresar a la carpeta del proyecto y ejecutar:
```
mvn package
```

Este se compilara, generando el archivo .jar correspondiente en la subcarpeta "target", dentro de la carpeta principal del proyecto.
Luego para ejecutarlo basta con escribir en consola : java -jar <nombre del ejecutable de la aplicacion>

Ejemplo:
```
java -jar mi_solucion3-0.0.1-SNAPSHOT.jar
```

Para acceder al UI de Swagger pueden ingresar a la URL: http://localhost:9999/swagger-ui.html
En la que se desplegara informacion de la API

La API, consume el servicio REST __Generador_Datos_Desafio__, tomando un json como el siguiente:

```json
{
    "id": 1,
    "fechaCreacion": "1989-09-01",
    "fechaFin": "2017-03-01",
    "fechas": [
        "1989-09-01",
        "1990-05-01",
        "1990-06-01",
        "2017-02-01"
    ]
}
```
Luego lo analiza y entrega el resultado en la URL : http://localhost:9999/
El resultado va en formato JSON, como el siguiente:

```json
{
  "id": "1",
  "fechaCreacion": "1989-09-01",
  "fechaFin": "2017-03-01",
  "fechas": [
        "1989-09-01",
        "1990-05-01",
        "1990-06-01",
        "2017-02-01"
    ],
  "fechasFaltantes": [
    "1989-10-01",
    "1989-11-01",
    "2016-12-01",
    "2017-01-01"
  ]
}
```

Para una mejor visualizacion del resultado se recomienda utilizar [PostMan](https://www.getpostman.com/)
Ingresando la URL antes indicada y en Header pasando el parametro 'Accept' con el valor 'application/json'