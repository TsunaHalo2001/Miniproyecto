package miniproyecto.app;

import javax.swing.JTextField;

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

        this.vista.menu.getGUITSelector().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.terminal();
                vista.menu.getGUITSelector().setSelected(false);
                vista.terminalMenu();
            }
        });

        this.vista.consola.getGUITSelector().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vista.menu();
                modelo.leerLista(vista.menu.getLista_Soldados());
                vista.consola.getGUITSelector().setSelected(false);
            }
        });

        this.vista.consola.getInput().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    switch (modelo.state) {
                        case 0:
                            if (vista.consola.getInput().getText().equals("1")) modelo.state = 1;
                            else if (vista.consola.getInput().getText().equals("2")) modelo.state = 16;
                            //if (vista.consola.getInput().getText().equals("3")) modelo.state = 3;
                            //if (vista.consola.getInput().getText().equals("4")) modelo.state = 4;
                            break;
                        case 1:
                            switch (vista.consola.getInput().getText()) {
                                case "1":
                                    modelo.state = 2;
                                    break;
                                case "2":
                                    modelo.state = 5;
                                    break;
                                case "3":
                                    modelo.state = 8;
                                    break;
                                case "4":
                                    modelo.state = 12;
                                    break;
                                case "5":
                                    modelo.state = 0;
                                    break;
                                default:
                                    break;
                            }
                            break;

                        case 2:
                            modelo.Raux[0] = vista.consola.getInput().getText();
                            modelo.state = 3;
                            break;
                        case 3:
                            modelo.Raux[1] = vista.consola.getInput().getText();
                            modelo.state = 4;
                            break;
                        case 4:
                            modelo.Raux[2] = vista.consola.getInput().getText();
                            JTextField[] JRaux = new JTextField[3];
                            JRaux[0] = new JTextField(modelo.Raux[0]);
                            JRaux[1] = new JTextField(modelo.Raux[1]);
                            JRaux[2] = new JTextField(modelo.Raux[2]);
                            modelo.crearRaso(JRaux[0], JRaux[1], JRaux[2]);
                            modelo.state = 0;
                            break;
                        case 5:
                            modelo.Taux[0] = vista.consola.getInput().getText();
                            modelo.state = 6;
                            break;
                        case 6:
                            modelo.Taux[1] = vista.consola.getInput().getText();
                            modelo.state = 7;
                            break;
                        case 7:
                            modelo.Taux[2] = vista.consola.getInput().getText();
                            JTextField[] JTaux = new JTextField[3];
                            JTaux[0] = new JTextField(modelo.Taux[0]);
                            JTaux[1] = new JTextField(modelo.Taux[1]);
                            JTaux[2] = new JTextField(modelo.Taux[2]);
                            modelo.crearTeniente(JTaux[0], JTaux[1], JTaux[2]);
                            modelo.state = 0;
                            break;
                        case 8:
                            modelo.Caaux[0] = vista.consola.getInput().getText();
                            modelo.state = 9;
                            break;
                        case 9:
                            modelo.Caaux[1] = vista.consola.getInput().getText();
                            modelo.state = 10;
                            break;
                        case 10:
                            modelo.Caaux[2] = vista.consola.getInput().getText();
                            modelo.state = 11;
                            break;
                        case 11:
                            modelo.Caaux[3] = vista.consola.getInput().getText();
                            JTextField[] JCaaux = new JTextField[4];
                            JCaaux[0] = new JTextField(modelo.Caaux[0]);
                            JCaaux[1] = new JTextField(modelo.Caaux[1]);
                            JCaaux[2] = new JTextField(modelo.Caaux[2]);
                            JCaaux[3] = new JTextField(modelo.Caaux[3]);
                            modelo.crearCapitan(JCaaux[0], JCaaux[1], JCaaux[2], JCaaux[3]);
                            modelo.state = 0;
                            break;
                        case 12:
                            modelo.Coaux[0] = vista.consola.getInput().getText();
                            modelo.state = 13;
                            break;
                        case 13:
                            modelo.Coaux[1] = vista.consola.getInput().getText();
                            modelo.state = 14;
                            break;
                        case 14:
                            modelo.Coaux[2] = vista.consola.getInput().getText();
                            modelo.state = 15;
                            break;
                        case 15:
                            modelo.Coaux[3] = vista.consola.getInput().getText();
                            JTextField[] JCoaux = new JTextField[4];
                            JCoaux[0] = new JTextField(modelo.Coaux[0]);
                            JCoaux[1] = new JTextField(modelo.Coaux[1]);
                            JCoaux[2] = new JTextField(modelo.Coaux[2]);
                            JCoaux[3] = new JTextField(modelo.Coaux[3]);
                            modelo.crearCoronel(JCoaux[0], JCoaux[1], JCoaux[2], JCoaux[3]);
                            modelo.state = 0;
                            break;
                        default:
                            break;
                    }

                    consolaMode();
                }
            }
        });
	}

    
    public void consolaMode() {
        switch (modelo.state) {
            case 0 -> vista.terminalMenu();
            case 1 -> vista.terminalCrear();
            case 2 -> vista.terminalCrearNombreR();
            case 3 -> vista.terminalCrearCodigoR();
            case 4 -> vista.terminalCrearUnidadR();
            case 5 -> vista.terminalCrearNombreT();
            case 6 -> vista.terminalCrearCodigoT();
            case 7 -> vista.terminalCrearUnidadT();
            case 8 -> vista.terminalCrearNombreCa();
            case 9 -> vista.terminalCrearCodigoCa();
            case 10 -> vista.terminalCrearUnidadCa();
            case 11 -> vista.terminalCrearUnidadesCa();
            case 12 -> vista.terminalCrearNombreCo();
            case 13 -> vista.terminalCrearCodigoCo();
            case 14 -> vista.terminalCrearUnidadCo();
            case 15 -> vista.terminalCrearEstrategiaCo();
        }
    }
}
