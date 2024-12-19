package miniproyecto.app;

import miniproyecto.Menu.Actualizar;
import miniproyecto.Menu.Crear;
import miniproyecto.Menu.Menu;
import miniproyecto.Menu.Realizar_Accion;

public class Vista {
	Menu menu;
	Crear crear;
	Actualizar actualizar;
	Realizar_Accion realizarAccion;

	public Vista() {
		this.menu = new Menu();
		this.crear = new Crear();
		this.actualizar = new Actualizar();
		this.realizarAccion = new Realizar_Accion();
		this.menu.setVisible(true);
	}

	public void menuC() {
        this.menu.setVisible(true);
        this.crear.setVisible(false);
	}

	public void menuA() {
		this.menu.setVisible(true);
		this.actualizar.setVisible(false);
	}

	public void menuRA() {
		this.menu.setVisible(true);
		this.realizarAccion.setVisible(false);
	}

	public void crear() {
		this.crear.setVisible(true);
		this.menu.setVisible(false);
	}

	public void actualizar() {
		this.actualizar.setVisible(true);
		this.menu.setVisible(false);
	}

	public void realizarAccion() {
        this.realizarAccion.setVisible(true);
        this.menu.setVisible(false);
	}
}
