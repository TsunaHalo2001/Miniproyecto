package miniproyecto.Interfaces;

import miniproyecto.Enum.EstadoEnum;

public interface OperacionesMilitares {
    public abstract String asignarMision(String mision);
    public abstract String reportarEstadoMision(EstadoEnum estadoMision);
    public abstract String reportarEstado(int nivel);

     
}
