// Nivel 1: Tipos de Juegos
class Tipos_de_Juegos {
    private String genero;

    Tipos_de_Juegos(String genero) {
        this.genero = genero;
    }

    String getGenero() {
        return genero;
    }

    void setGenero() {
        this.genero = "Terror";
    }

    void mostrarGenero() {
        System.out.println("Genero: " + genero);
    }
}

// Nivel 2: Nombre de Juego
class Nombre_de_Juego extends Tipos_de_Juegos {
    private String nombre;

    Nombre_de_Juego(String genero, String nombre) {
        super(genero);
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre() {
        this.nombre = "Silent Hill";
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

// Nivel 3: Total de ventas
class TotalVentas extends Nombre_de_Juego {
    private String ventas;

    TotalVentas(String genero, String nombre, String ventas) {
        super(genero, nombre);
        this.ventas = ventas;
    }

    String getVentas() {
        return ventas;
    }

    void setVentas() {
        this.ventas = "45 millones";
    }

    void mostrarVentas() {
        System.out.println("Ventas: " + ventas);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            TotalVentas[] juegos = new TotalVentas[2];
            juegos[0] = new TotalVentas("Aventura", "Minecraft", "200 millones");
            juegos[1] = new TotalVentas("Accion", "CoD", "150 millones");

            for (TotalVentas juego : juegos) {
                System.out.println("Antes del cambio:");
                juego.mostrarGenero();
                juego.mostrarNombre();
                juego.mostrarVentas();

                juego.setGenero();
                juego.setNombre();
                juego.setVentas();

                System.out.println("Después del cambio:");
                juego.mostrarGenero();
                juego.mostrarNombre();
                juego.mostrarVentas();
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}
