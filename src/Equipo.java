import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j) {
        jugadores.add(j);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(nombre).append("\n");
        for (Jugador j : jugadores) {
            sb.append("  - ").append(j).append("\n");
        }
        return sb.toString();
    }
}
