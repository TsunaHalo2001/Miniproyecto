package miniproyecto.app;

import miniproyecto.Menu.Actualizar;
import miniproyecto.Menu.Consola;
import miniproyecto.Menu.Crear;
import miniproyecto.Menu.Menu;
import miniproyecto.Menu.Realizar_Accion;

public class Vista {
	Menu menu;
	Crear crear;
	Actualizar actualizar;
	Realizar_Accion realizarAccion;
	Consola consola;

	public Vista() {
		this.menu = new Menu();
		this.crear = new Crear();
		this.actualizar = new Actualizar();
		this.realizarAccion = new Realizar_Accion();
		this.consola = new Consola();
		this.menu.setVisible(true);
	}

	public void menu() {
		this.menu.setVisible(true);
		this.consola.setVisible(false);
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
	
	public void terminal() {
		this.consola.setVisible(true);
		this.menu.setVisible(false);
	}

	public void terminalMenu() {
		this.consola.getTerminal().setText("""
			<html>
			Bienvenido al sistema de gestion militar<br>
            Seleccione una opcion:<br>
			1. Crear<br>
			2. Actualizar<br>
			3. Realizar accion<br>
			4. Eliminar<br>
			5. Resetear<br>
			</html>
			""");
	}

	public void terminalCrear() {
		this.consola.getTerminal().setText("""
			<html>
			Seleccione una opcion:<br>
			1. Crear soldado raso<br>
			2. Crear teniente<br>
			3. Crear capitan<br>
			4. Crear coronel<br>
			5. Volver<br>
			</html>
				""");
	}

	public void terminalCrearNombreR() {
		this.consola.getTerminal().setText("Ingrese el nombre del soldado raso:");
	}

	public void terminalCrearNombreT() {
		this.consola.getTerminal().setText("Ingrese el nombre del teniente:");
	}

	public void terminalCrearNombreCa() {
		this.consola.getTerminal().setText("Ingrese el nombre del capitan:");
	}

	public void terminalCrearNombreCo() {
		this.consola.getTerminal().setText("Ingrese el nombre del coronel:");
	}

	public void terminalCrearCodigoR() {
		this.consola.getTerminal().setText("Ingrese el codigo del soldado raso:");
	}

	public void terminalCrearCodigoT() {
		this.consola.getTerminal().setText("Ingrese el codigo del teniente:");
	}

	public void terminalCrearCodigoCa() {
		this.consola.getTerminal().setText("Ingrese el codigo del capitan:");
	}

	public void terminalCrearCodigoCo() {
		this.consola.getTerminal().setText("Ingrese el codigo del coronel:");
	}

	public void terminalCrearUnidadR() {
		this.consola.getTerminal().setText("Ingrese la unidad del soldado raso:");
	}

	public void terminalCrearUnidadT() {
		this.consola.getTerminal().setText("Ingrese la unidad del teniente:");
	}

	public void terminalCrearUnidadCa() {
		this.consola.getTerminal().setText("Ingrese la unidad del capitan:");
	}

	public void terminalCrearUnidadCo() {
		this.consola.getTerminal().setText("Ingrese la unidad del coronel:");
	}

	public void terminalCrearUnidadesCa() {
		this.consola.getTerminal().setText("Ingrese el numero de unidades al mando del capitan:");
	}

	public void terminalCrearEstrategiaCo() {
		this.consola.getTerminal().setText("Ingrese la estrategia del coronel:");
	}

	public String getInput() {
		return this.consola.getInput().getText();
	}
}
