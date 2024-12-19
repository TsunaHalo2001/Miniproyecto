package miniproyecto.app;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista v, Modelo m) {
		this.vista = v;
		this.modelo = m;
        this.modelo.leerLista(this.vista.menu.getLista_Soldados());
	
		this.vista.menu.getBoton_Crear().addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				vista.crear();
			}
		});

        this.vista.menu.getBoton_Actualizar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vista.menu.getLista_Soldados().getSelectedIndex() != -1) {
					modelo.index = vista.menu.getLista_Soldados().getSelectedIndex();
					vista.actualizar();
				}
            }
        });

        this.vista.menu.getResetear().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.resetearLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.menu.getBoton_RealizarAccion().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.realizarAccion();
				modelo.leerLista(vista.realizarAccion.getSubordinado());
				modelo.leerLista(vista.realizarAccion.getSuperior());
            }
        });
		
        this.vista.menu.getBoton_Eliminar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.eliminardeLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.crear.getVolver_boton().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.crear.getGuardarR().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearRaso(vista.crear.getNombreR(), vista.crear.getCodigoR(), vista.crear.getUnidadR());
            }
        });

        this.vista.crear.getGuardarT().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.crearTeniente(vista.crear.getNombreT(), vista.crear.getCodigoT(), vista.crear.getUnidadT());
            }
        });

        this.vista.crear.getGuardarCa().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearCapitan(vista.crear.getNombreCa(), vista.crear.getCodigoCa(), vista.crear.getUnidadCa(), vista.crear.getUnidadesCa());
            }
        });

        this.vista.crear.getGuardarCo().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.crearCoronel(vista.crear.getNombreCo(), vista.crear.getCodigoCo(), vista.crear.getUnidadCo(), vista.crear.getEstrategiaCo());
            }
        });

        this.vista.actualizar.getGuardarR().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarRaso(vista.actualizar.getNombreR(), vista.actualizar.getCodigoR(), vista.actualizar.getUnidadR());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.actualizar.getGuardarT().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarTeniente(vista.actualizar.getNombreT(), vista.actualizar.getCodigoT(), vista.actualizar.getUnidadT());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.actualizar.getGuardarCa().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCapitan(vista.actualizar.getNombreCa(), vista.actualizar.getCodigoCa(), vista.actualizar.getUnidadCa(), vista.actualizar.getUnidadesCa());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
			}
        });

        this.vista.actualizar.getGuardarCo().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCoronel(vista.actualizar.getNombreCo(), vista.actualizar.getCodigoCo(), vista.actualizar.getUnidadCo(), vista.actualizar.getEstrategiaCo());
				vista.menuA();
				modelo.leerLista(vista.menu.getLista_Soldados());
			}
        });

        this.vista.realizarAccion.getVolver().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuRA();
				modelo.leerLista(vista.menu.getLista_Soldados());
            }
        });

        this.vista.realizarAccion.getDar_Orden().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.darOrdenAction(vista.realizarAccion.getSubordinado(), vista.realizarAccion.getSuperior(), vista.realizarAccion.getSalida());
            }
        });

        this.vista.realizarAccion.getReganar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.reganarAction(vista.realizarAccion.getSubordinado(), vista.realizarAccion.getSuperior(), vista.realizarAccion.getSalida());
            }
        });

        this.vista.realizarAccion.getSaludar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.saludarAction(vista.realizarAccion.getSubordinado(), vista.realizarAccion.getSuperior(), vista.realizarAccion.getSalida());
            }
        });

        this.vista.realizarAccion.getPatrullar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.patrullarAction(vista.realizarAccion.getSubordinado(), vista.realizarAccion.getSuperior(), vista.realizarAccion.getSalida());
            }
        });
	}
}
