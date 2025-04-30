public class Jugador {
    private String nombre;
    private String nickname;
    private int edad;

    public Jugador(String nombre, String nickname, int edad) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + nickname + "), " + edad + " años";
    }
}
