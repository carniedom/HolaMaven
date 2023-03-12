package net.alumnado.dam;

import net.alumnado.dam.HolaMon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

class HolaMonTest {

    @Test
    void esMayor() {
    }

    private static HolaMon helloWorld;


    @BeforeAll
    public static void Before() {
        System.out.println("Antes de todas");
    }

    @Test
    public void isGreaterTest() {

        helloWorld = new HolaMon();
        System.out.println("La Prueba");
        if (helloWorld.esMayor(4, 3)) {
            System.out.println("El 1 es mayor que el 2");
        } else {
            System.out.println("El 2 es mayor que el 1");
        }
    }

    @Test
    public void isGreaterTest2() {

        helloWorld = new HolaMon();
        System.out.println("La Prueba 2");
        if (helloWorld.esMayor(3,4)){
            System.out.println("El 1 es mayor que el 2");
        }
        else {
            System.out.println("El 2 es mayor que el 1");
        }
    }
}