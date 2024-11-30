package miniproyecto.app;

import java.util.ArrayList;
import miniproyecto.Menu.Menu;
import miniproyecto.Soldados.Capitan;
import miniproyecto.Soldados.Coronel;
import miniproyecto.Soldados.SoldadoRaso;
import miniproyecto.Soldados.Teniente;

public class Logica {
    public static ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();
    public static ArrayList<Teniente> listaTeniente = new ArrayList<>();
    public static ArrayList<Capitan> listaCapitan = new ArrayList<>();
    public static ArrayList<Coronel> listaCoronel = new ArrayList<>();
    
    public static void main(String[] args){
        Menu men = new Menu();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
    }
}
