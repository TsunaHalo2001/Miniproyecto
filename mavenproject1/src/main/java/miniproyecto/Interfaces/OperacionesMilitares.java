package miniproyecto.Interfaces;

import miniproyecto.Enum.EstadoEnum;

public interface OperacionesMilitares {
    public abstract void asignarMision(String mision);
    public abstract void reportarEstadoMision(EstadoEnum estadoMision);
    public abstract void reportarEstado(int nivel);

     
}
