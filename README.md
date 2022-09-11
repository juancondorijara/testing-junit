# **Testing Con JUnit en IntelliJ IDEA**

# **Kata Simple Para Afianzar la Metodología TDD**

Registro centralizado en la arquitectura de microservicios utilizando ELK(Elasticsearch-Logstash-Kibana) + Spring Boot Microservice

## **Requisito Tener IntelliJ IDEA**

- __[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows)__

## **Archivos `.java`**

- Crear una clase llamada `User2.java`, y crear un campo string llamado name.

![](imagenes/1.png)

- Crear una clase llamada `User1.java`, con los siguientes métodos:
    * Arraylist
    * crear
    * buscar
    * borrar

![](imagenes/2.png)

- Crear una clase llamada `User1Test.java`, en la misma ubicación, ejemplo:
    * main -> java -> com -> testingjunit -> user -> `User1.java`
    * test -> java -> com -> testingjunit -> user -> `User1Test.java`

![](imagenes/3.png)

- En la clase `User1Test.java`, crear los siguientes métodos anotados:
    * inicializar
    * testCrearUser
    * testObtenerUser
    * testObtenerUserNoExistente
    * testBorrarUser
    * testBorrarUserNoExistente

![](imagenes/4.png)
![](imagenes/5.png)
![](imagenes/6.png)
-->

- Ejecutar la clase `User1Test.java` with Coverage.

![](imagenes/7.png)

- En la parte inferior se visualizará los resultados de los Test.

![](imagenes/8.png)

- Se puede visualizar los resultados por cada Test.

![](imagenes/9.png)
![](imagenes/10.png)
![](imagenes/11.png)
![](imagenes/12.png)
![](imagenes/13.png)

- Podemos ver el coverage de la clase `User1.java`.

![](imagenes/14.png)
