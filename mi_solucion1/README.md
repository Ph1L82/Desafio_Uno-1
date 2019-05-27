#MI_SOLUCION1

Consiste en una aplicacion de consola que lee un archivo json con la informacion del periodo, la analiza y escribe el resultado en otro archivo.
La aplicacion recibe 2 parametros que en orden de entrada son, el archivo a leer (archivo que contiene el json del periodo a analizar) y el archivo de salida, en el que escribira el json correspondiente al resultado del analisis del periodo entregado.

Para compilar el proyecto, se debe ingresar a la carpeta del proyecto y ejecutar:
```
mvn package
```

Este se compilara, generando el archivo .jar correspondiente en la subcarpeta "target", dentro de la carpeta principal del proyecto.
Luego para ejecutarlo basta con escribir en consola : java -jar <nombre del ejecutable de la aplicacion> <parametro 1> <parametro 2>

Ejemplo:
```
java -jar mi_solucion1-0.0.1-SNAPSHOT.jar entrada.json salida.json
```

La aplicacion toma el archivo de entrada, segun el ejemplo anterior __entrada.json__

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

Lo revisa y genera una respuesta json como la siguiente:

```json
{
  "id": "1",
  "fechaCreacion": "1989-09-01",
  "fechaFin": "2017-03-01",
  "fechasFaltantes": [
    "1989-10-01",
    "1989-11-01",
    "2016-12-01",
    "2017-01-01"
  ]
}
```
Esta respuesta la guarda en el archivo que se le indica como segundo parametro al iniciar la aplicacion. En el ejemplo, el archivo se llama __salida.json__

**__Las respuestas anteriores se cortaron para mostrar formato, no contenido__**


