package com.testingjunit.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class User1Test {

    private final String nombrePorDefecto = "Juan Gabriel";

    User1 user1 = new User1();
    User2 user2 = new User2();

    @BeforeEach
    void inicializar(){
        user2.name = nombrePorDefecto;
    }

    @Test
    void testCrearUser(){
        User2 usuarioCreado = user1.crear(user2);
        assertEquals(usuarioCreado.name,nombrePorDefecto);
        System.out.println("NOMBRE = " + user2.name);
    }

    @Test
    void testObtenerUser(){
        user1.crear(user2);

        String resultado = user1.buscar(user2);
        assertEquals(nombrePorDefecto, resultado);
        System.out.println(resultado + " = " + user1.buscar(user2));
    }

    @Test
    void testObtenerUserNoExistente(){
        String resultado = user1.buscar(user2);
        assertEquals(null, resultado);
        System.out.println("RESULTADO = " + resultado);
    }

    @Test
    void testBorrarUser(){
        user1.crear(user2);
        boolean resultado = user1.borrar(user2);
        assertEquals(true, resultado);
        System.out.println("USUARIO BORRADO = " + user2.name);

        resultado = user1.borrar(user2);
        assertEquals(false, resultado);
        System.out.println("EL USUARIO YA HA SIDO BORRADO = " + user2.name);
    }

    @Test
    void testBorrarUserNoExistente(){
        boolean resultado = user1.borrar(user2);
        assertEquals(false, resultado);
        System.out.println("USUARIO NO EXISTE");
    }
}