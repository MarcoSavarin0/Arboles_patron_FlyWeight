package Test;

import Impl.ArbolFactory;
import Model.Arbol;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArbolFactoryTest {
    @Test
    @DisplayName("Crear 1 MILLON de arboles")
    void caso1() {
        for (int i = 0; i < 1000 * 1000; i++) {
            Arbol arbol1 = ArbolFactory.getArbol("Ornamentales", 200, 400, "verde");
            Arbol arbol2 = ArbolFactory.getArbol("Frutales", 500, 300, "rojo");
            Arbol arbol3 = ArbolFactory.getArbol("Florales", 100, 200, "celeste");
        }
        int contador = Arbol.getContador();
        assertEquals(3, contador);
    }

    @Test
    @DisplayName("Crear 1 MILLON de arboles, la mitad rojo y la otra mitad verde")
    void caso2() {
        int total = 1000 * 1000;
        int rojo = 0;
        int verde = 0;

        for (int j = 0; j < total / 2; j++) {
            Arbol arbol1 = ArbolFactory.getArbol("Ornamentales", 200, 400, "verde");
            verde++;
        }
        for (int j = 0; j < total / 2; j++) {
            Arbol arbol2 = ArbolFactory.getArbol("Frutales", 500, 300, "rojo");
            rojo++;
        }
        int contador = Arbol.getContador();
        System.out.println("Cantidad de Rojos: " + rojo + " " + "Cantidad de Verdes: " + verde);
        assertEquals(2, contador);
    }
}