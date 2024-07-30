package Model;

public class Arbol {
    private String nombre;
    private int alto;
    private int horizontal;
    private String color;
    public static int contador = 0;

    public Arbol(String nombre, int alto, String color, int horizontal) {
        this.nombre = nombre;
        this.alto = alto;
        this.color = color;
        this.horizontal = horizontal;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getContador() {
        return contador;
    }

    public String getColor() {
        return color;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getAlto() {
        return alto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void setContador(int contador) {
        Arbol.contador = contador;
    }
}
