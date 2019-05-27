#MI_SOLUCION2

Consiste en una aplicacion de consola que al ejecutarse consume un servicio rest ([Generador Datos Desafio](https://github.com/previred/Generador_Datos_Desafio_Uno)). Esta aplicacion debe estar operando en el **puerto 8080**
La aplicacion **__mi_solucion2__** esta configurada para trabajar en el **puerto 9090** con tal de no topar. Para cambiar la configuracion del puerto solo es necesario modificar el archivo :
**mi_solucion2/src/main/resources/application.properties**
cambiando el numero de puerto por uno disponible.

Para compilar el proyecto, se debe ingresar a la carpeta del proyecto y ejecutar:
```
mvn package
```

Este se compilara, generando el archivo .jar correspondiente en la subcarpeta "target", dentro de la carpeta principal del proyecto.
Luego para ejecutarlo basta con escribir en consola : java -jar <nombre del ejecutable de la aplicacion> <parametro>

Ejemplo:
```
java -jar mi_solucion2.jar
```

La aplicacion, se conecta al servicio REST, tomando un json como el siguiente:

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
Luego lo analiza y escribe un resultado en json en el archivo de nombre resultado.json (o en el nombre de archivo especificado en el parametro) con una salida como la siguiente:

```json
{
  "id": "1",
  "fechaCreacion": "1989-09-01",
  "fechaFin": "2017-03-01",
  "fechasRecibidas": [
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