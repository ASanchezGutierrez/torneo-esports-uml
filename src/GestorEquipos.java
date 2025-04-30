import java.util.ArrayList;
import java.util.List;

public class GestorEquipos {
    private List<Equipo> listaEquipos;

    public GestorEquipos() {
        this.listaEquipos = new ArrayList<>();
    }

    public void registrarEquipo(String nombre) {
        listaEquipos.add(new Equipo(nombre));
    }

    public void añadirJugadorAEquipo(String nombreEquipo, Jugador jugador) {
        for (Equipo e : listaEquipos) {
            if (e.getNombre().equalsIgnoreCase(nombreEquipo)) {
                e.agregarJugador(jugador);
                return;
            }
        }
        System.out.println("⚠️ Equipo no encontrado.");
    }

    public List<Equipo> consultarEquiposYJugadores() {
        return listaEquipos;
    }
}
