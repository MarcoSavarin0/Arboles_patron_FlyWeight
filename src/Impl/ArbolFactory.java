package Impl;

import Model.Arbol;

import java.util.HashMap;

public class ArbolFactory {
    private static final HashMap<String, Arbol> cancionMap = new HashMap<>();
    public static Arbol getArbol(String nombre,int alto,int horizontal, String color){
        String clave = "Key: " +nombre+alto+color+horizontal;
        Arbol arbol;
        if (!cancionMap.containsKey(clave)){
            arbol = new Arbol(nombre,alto,color,horizontal);
            System.out.println("Se creo el arbol");
            cancionMap.put(clave,arbol);
        }
        arbol = cancionMap.get(clave);
        System.out.println("se obtuvo el arbol, " + arbol);
        return arbol;
    }
}
