package miniproyecto.app;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista v, Modelo m) {
		this.vista = v;
		this.modelo = m;
        this.modelo.leerLista(this.vista.menu.Lista_Soldados);
	
		this.vista.menu.Boton_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				vista.crear();
			}
		});

        this.vista.menu.Boton_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (vista.menu.Lista_Soldados.getSelectedIndex() != -1) {
					modelo.index = vista.menu.Lista_Soldados.getSelectedIndex();
					vista.actualizar();
				}
            }
        });

        this.vista.menu.Resetear.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.resetearLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.menu.Boton_Visualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.realizarAccion();
				modelo.leerLista(vista.realizarAccion.jList1);
				modelo.leerLista(vista.realizarAccion.jList2);
            }
        });
		
        this.vista.menu.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.eliminardeLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.crear.Volver_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuC();
				modelo.leerLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.crear.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearRaso(vista.crear.jTextField1, vista.crear.jTextField2, vista.crear.jTextField3);
            }
        });

        this.vista.crear.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.crearTeniente(vista.crear.jTextField5, vista.crear.jTextField7, vista.crear.jTextField6);
            }
        });

        this.vista.crear.jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelo.crearCapitan(vista.crear.jTextField4, vista.crear.jTextField8, vista.crear.jTextField9, vista.crear.jTextField10);
            }
        });

        this.vista.crear.jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.crearCoronel(vista.crear.jTextField11, vista.crear.jTextField12, vista.crear.jTextField13, vista.crear.jTextField14);
            }
        });

        this.vista.actualizar.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarRaso(vista.actualizar.jTextField1, vista.actualizar.jTextField2, vista.actualizar.jTextField3);
				vista.menuA();
				modelo.leerLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.actualizar.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarTeniente(vista.actualizar.jTextField5, vista.actualizar.jTextField7, vista.actualizar.jTextField6);
				vista.menuA();
				modelo.leerLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.actualizar.jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCapitan(vista.actualizar.jTextField4, vista.actualizar.jTextField8, vista.actualizar.jTextField9, vista.actualizar.jTextField10);
				vista.menuA();
				modelo.leerLista(vista.menu.Lista_Soldados);
			}
        });

        this.vista.actualizar.jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.actualizarCoronel(vista.actualizar.jTextField11, vista.actualizar.jTextField12, vista.actualizar.jTextField13, vista.actualizar.jTextField14);
				vista.menuA();
				modelo.leerLista(vista.menu.Lista_Soldados);
			}
        });

        this.vista.realizarAccion.jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menuRA();
				modelo.leerLista(vista.menu.Lista_Soldados);
            }
        });

        this.vista.realizarAccion.jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.darOrdenAction(vista.realizarAccion.jList1, vista.realizarAccion.jList2, vista.realizarAccion.jLabel1);
            }
        });

        this.vista.realizarAccion.jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.reganarAction(vista.realizarAccion.jList1, vista.realizarAccion.jList2, vista.realizarAccion.jLabel1);
            }
        });

        this.vista.realizarAccion.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.saludarAction(vista.realizarAccion.jList1, vista.realizarAccion.jList2, vista.realizarAccion.jLabel1);
            }
        });

        this.vista.realizarAccion.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
        		modelo.patrullarAction(vista.realizarAccion.jList1, vista.realizarAccion.jList2, vista.realizarAccion.jLabel1);
            }
        });
	}
}
