package miniproyecto.app;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import miniproyecto.Soldados.Capitan;
import miniproyecto.Soldados.Coronel;
import miniproyecto.Soldados.Soldado;
import miniproyecto.Soldados.SoldadoRaso;
import miniproyecto.Soldados.Teniente;

public class Modelo {
    public ArrayList<SoldadoRaso> listaSoldadoRaso = new ArrayList<>();
    public ArrayList<Teniente> listaTeniente = new ArrayList<>();
    public ArrayList<Capitan> listaCapitan = new ArrayList<>();
    public ArrayList<Coronel> listaCoronel = new ArrayList<>();
    
    public int index;
    
    private DefaultListModel limpiarLista (JList<String> Lista_Soldados) {
        DefaultListModel modelo = new DefaultListModel();

        Lista_Soldados.setModel(modelo);

        return modelo;
    }

    private DefaultListModel agregarValor (Soldado soldado, JList<String> Lista_Soldados) {
        DefaultListModel modelo = (DefaultListModel) Lista_Soldados.getModel();

        modelo.addElement(soldado.mostrarInformacion());

        return modelo;
    }

    private void leerLista (JList<String> Lista_Soldados) {
        limpiarLista(Lista_Soldados);

        if (Soldado.getContadorSoldados() > 0) {
            int a = this.listaSoldadoRaso.size() + this.listaTeniente.size() + this.listaCoronel.size() + this.listaCapitan.size();
            
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) if (this.listaSoldadoRaso.get(j).getContSoldado() == i + 1) agregarValor(this.listaSoldadoRaso.get(j), Lista_Soldados);
                for (int j = 0; j < this.listaTeniente.size(); j++)    if (this.listaTeniente.get(j).getContSoldado() == i + 1)    agregarValor(this.listaTeniente.get(j), Lista_Soldados);
                for (int j = 0; j < this.listaCoronel.size(); j++)     if (this.listaCoronel.get(j).getContSoldado() == i + 1)     agregarValor(this.listaCoronel.get(j), Lista_Soldados);
                for (int j = 0; j < this.listaCapitan.size(); j++)     if (this.listaCapitan.get(j).getContSoldado() == i + 1)     agregarValor(this.listaCapitan.get(j), Lista_Soldados);
            }

            if (Soldado.getContadorSoldados() - a > 0) {
                int aux = Soldado.getContadorSoldados() - a;
                for (int i = 0; i < aux; i++) {
                    for (int j = 0; j < this.listaSoldadoRaso.size(); j++) if (this.listaSoldadoRaso.get(j).getContSoldado() == a + i + 1) agregarValor(this.listaSoldadoRaso.get(j), Lista_Soldados);
                    for (int j = 0; j < this.listaTeniente.size(); j++)    if (this.listaTeniente.get(j).getContSoldado() == a + i + 1)    agregarValor(this.listaTeniente.get(j), Lista_Soldados);
                    for (int j = 0; j < this.listaCoronel.size(); j++)     if (this.listaCoronel.get(j).getContSoldado() == a + i + 1)     agregarValor(this.listaCoronel.get(j), Lista_Soldados);
                    for (int j = 0; j < this.listaCapitan.size(); j++)     if (this.listaCapitan.get(j).getContSoldado() == a + i + 1)     agregarValor(this.listaCapitan.get(j), Lista_Soldados);
                }
            }
        }
    }

    private void eliminardeLista (JList<String> Lista_Soldados) {
        if (Lista_Soldados.getModel().getSize() > 0) {
            DefaultListModel modelo = (DefaultListModel) Lista_Soldados.getModel();

            for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
                if (this.listaSoldadoRaso.get(i).mostrarInformacion().equals(Lista_Soldados.getSelectedValue())) {
                    this.listaSoldadoRaso.remove(i);
                    modelo.remove(Lista_Soldados.getSelectedIndex());
                    return;
                }
            }
            
            for (int i = 0; i < this.listaTeniente.size(); i++) {
                if (this.listaTeniente.get(i).mostrarInformacion().equals(Lista_Soldados.getSelectedValue())) {
                    this.listaTeniente.remove(i);
                    modelo.remove(Lista_Soldados.getSelectedIndex());
                    return;
                }
            }

            for (int i = 0; i < this.listaCoronel.size(); i++) {
                if (this.listaCoronel.get(i).mostrarInformacion().equals(Lista_Soldados.getSelectedValue())) {
                    this.listaCoronel.remove(i);
                    modelo.remove(Lista_Soldados.getSelectedIndex());
                    return;
                }
            }

            for (int i = 0; i < this.listaCapitan.size(); i++) {
                if (this.listaCapitan.get(i).mostrarInformacion().equals(Lista_Soldados.getSelectedValue())) {
                    this.listaCapitan.remove(i);
                    modelo.remove(Lista_Soldados.getSelectedIndex());
                    return;
                }
            }
        }
    }

    private void resetearLista (JList<String> Lista_Soldados) {
        limpiarLista(Lista_Soldados);

        Soldado.resetear();
        this.listaSoldadoRaso.clear();
        this.listaTeniente.clear();
        this.listaCoronel.clear();
        this.listaCapitan.clear();
    }

    private void actualizarRaso (JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) {
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) return;

        SoldadoRaso soldado = new SoldadoRaso(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
        Soldado.setContSoldiers(Soldado.getContadorSoldados() - 1);
        soldado.setContSoldado(this.index + 1);

        if (!this.listaSoldadoRaso.isEmpty()) {
            for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
                if (this.listaSoldadoRaso.get(i).getContSoldado() == this.index + 1) {
                    this.listaSoldadoRaso.set(i, soldado);
                    break;
                }
            }
        }

        if (!this.listaTeniente.isEmpty()) {
            for (int i = 0; i < this.listaTeniente.size(); i++) {
                if (this.listaTeniente.get(i).getContSoldado() == this.index + 1) {
                    this.listaTeniente.remove(i);
                    this.listaSoldadoRaso.add(soldado);
                    break;
                }
            }
        }

        if (!this.listaCapitan.isEmpty()) {
            for (int i = 0; i < this.listaCapitan.size(); i++) {
                if (this.listaCapitan.get(i).getContSoldado() == this.index + 1) {
                    this.listaCapitan.remove(i);
                    this.listaSoldadoRaso.add(soldado);
                    break;
                }
            }
        }

        if (!this.listaCoronel.isEmpty()) {
            for (int i = 0; i < this.listaCoronel.size(); i++) {
                if (this.listaCoronel.get(i).getContSoldado() == this.index + 1) {
                    this.listaCoronel.remove(i);
                    this.listaSoldadoRaso.add(soldado);
                    break;
                }
            }
        }
    }

    private void actualizarTeniente (JTextField jTextField5, JTextField jTextField7, JTextField jTextField6) {
        if (jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty()) return;
        Teniente teniente = new Teniente(jTextField5.getText(), jTextField7.getText(), jTextField6.getText());
        Soldado.setContSoldiers(Soldado.getContadorSoldados() - 1);
        teniente.setContSoldado(this.index + 1);
        if (!this.listaTeniente.isEmpty()) {
            for (int i = 0; i < this.listaTeniente.size(); i++) {
                if (this.listaTeniente.get(i).getContSoldado() == this.index + 1) {
                    this.listaTeniente.set(i, teniente);
                    break;
                }
            }
        }

        if (!this.listaSoldadoRaso.isEmpty()) {
            for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
                if (this.listaSoldadoRaso.get(i).getContSoldado() == this.index + 1) {
                    this.listaSoldadoRaso.remove(i);
                    this.listaTeniente.add(teniente);
                    break;
                }
            }
        }

        if (!this.listaCapitan.isEmpty()) {
            for (int i = 0; i < this.listaCapitan.size(); i++) {
                if (this.listaCapitan.get(i).getContSoldado() == this.index + 1) {
                    this.listaCapitan.remove(i);
                    this.listaTeniente.add(teniente);
                    break;
                }
            }
        }

        if (!this.listaCoronel.isEmpty()) {
            for (int i = 0; i < this.listaCoronel.size(); i++) {
                if (this.listaCoronel.get(i).getContSoldado() == this.index + 1) {
                    this.listaCoronel.remove(i);
                    this.listaTeniente.add(teniente);
                    break;
                }
            }
        }
    }

    private void actualizarCapitan (JTextField jTextField4, JTextField jTextField8, JTextField jTextField9, JTextField jTextField10) {
        if (jTextField4.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty()) return;
        if (!Character.isDigit(jTextField10.getText().charAt(0))) return;

        Capitan capitan = new Capitan(jTextField4.getText(), jTextField8.getText(), jTextField9.getText(), Integer.parseInt(jTextField10.getText()));

        Soldado.setContSoldiers(Soldado.getContadorSoldados() - 1);
        capitan.setContSoldado(this.index + 1);

        if (!this.listaCapitan.isEmpty()) {
            for (int i = 0; i < this.listaCapitan.size(); i++) {
                if (this.listaCapitan.get(i).getContSoldado() == this.index + 1) {
                    this.listaCapitan.set(i, capitan);
                    break;
                }
            }
        }

        if (!this.listaSoldadoRaso.isEmpty()) {
            for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
                if (this.listaSoldadoRaso.get(i).getContSoldado() == this.index + 1) {
                    this.listaSoldadoRaso.remove(i);
                    this.listaCapitan.add(capitan);
                    break;
                }
            }
        }

        if (!this.listaTeniente.isEmpty()) {
            for (int i = 0; i < this.listaTeniente.size(); i++) {
                if (this.listaTeniente.get(i).getContSoldado() == this.index + 1) {
                    this.listaTeniente.remove(i);
                    this.listaCapitan.add(capitan);
                    break;
                }
            }
        }

        if (!this.listaCoronel.isEmpty()) {
            for (int i = 0; i < this.listaCoronel.size(); i++) {
                if (this.listaCoronel.get(i).getContSoldado() == this.index + 1) {
                    this.listaCoronel.remove(i);
                    this.listaCapitan.add(capitan);
                    break;
                }
            }
        }
    }

    private void actualizarCoronel (JTextField jTextField11, JTextField jTextField12, JTextField jTextField13, JTextField jTextField14) {
        if (jTextField11.getText().isEmpty() || jTextField12.getText().isEmpty() || jTextField13.getText().isEmpty() || jTextField14.getText().isEmpty()) return;

        Coronel coronel = new Coronel(jTextField11.getText(), jTextField12.getText(), jTextField13.getText(), jTextField14.getText());

        Soldado.setContSoldiers(Soldado.getContadorSoldados() - 1);
        coronel.setContSoldado(this.index + 1);

        if (!this.listaCoronel.isEmpty()) {
            for (int i = 0; i < this.listaCoronel.size(); i++) {
                if (this.listaCoronel.get(i).getContSoldado() == this.index + 1) {
                    this.listaCoronel.set(i, coronel);
                    break;
                }
            }
        }

        if (!this.listaSoldadoRaso.isEmpty()) {
            for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
                if (this.listaSoldadoRaso.get(i).getContSoldado() == this.index + 1) {
                    this.listaSoldadoRaso.remove(i);
                    this.listaCoronel.add(coronel);
                    break;
                }
            }
        }

        if (!this.listaTeniente.isEmpty()) {
            for (int i = 0; i < this.listaTeniente.size(); i++) {
                if (this.listaTeniente.get(i).getContSoldado() == this.index + 1) {
                    this.listaTeniente.remove(i);
                    this.listaCoronel.add(coronel);
                    break;
                }
            }
        }

        if (!this.listaCapitan.isEmpty()) {
            for (int i = 0; i < this.listaCapitan.size(); i++) {
                if (this.listaCapitan.get(i).getContSoldado() == this.index + 1) {
                    this.listaCapitan.remove(i);
                    this.listaCoronel.add(coronel);
                    break;
                }
            }

        }
    }

    private void crearRaso (JTextField jTextField1, JTextField jTextField2, JTextField jTextField3) {
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) return;

        SoldadoRaso soldado = new SoldadoRaso(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());

        this.listaSoldadoRaso.add(soldado);
    }

    private void crearTeniente (JTextField jTextField5, JTextField jTextField7, JTextField jTextField6) {
        if (jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty()) return;

        Teniente teniente = new Teniente(jTextField5.getText(), jTextField7.getText(), jTextField6.getText());

        this.listaTeniente.add(teniente);
    }

    private void crearCapitan (JTextField jTextField4, JTextField jTextField8, JTextField jTextField9, JTextField jTextField10) {
        if (jTextField4.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty()) return;
        if (!Character.isDigit(jTextField10.getText().charAt(0))) return;

        Capitan capitan = new Capitan(jTextField4.getText(), jTextField8.getText(), jTextField9.getText(), Integer.parseInt(jTextField10.getText()));

        this.listaCapitan.add(capitan);
    }

    private void crearCoronel (JTextField jTextField11, JTextField jTextField12, JTextField jTextField13, JTextField jTextField14) {
        if (jTextField11.getText().isEmpty() || jTextField12.getText().isEmpty() || jTextField13.getText().isEmpty() || jTextField14.getText().isEmpty()) return;

        Coronel coronel = new Coronel(jTextField11.getText(), jTextField12.getText(), jTextField13.getText(), jTextField14.getText());

        this.listaCoronel.add(coronel);
    }

    private void darOrdenAction (JList jList1, JList jList2, JLabel jLabel1) {
        if (jList1.getSelectedIndex() == -1 || jList2.getSelectedIndex() == -1) {
            jLabel1.setText("Seleccione un soldado");
            return;
        }

        if (jList1.getSelectedIndex() == jList2.getSelectedIndex()) {
            jLabel1.setText("No puede dar orden a si mismo");
            return;
        }

        for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
            if (this.listaSoldadoRaso.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado no puede dar orden a otro soldado raso");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(j).darOrden(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(j).darOrden(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(j).darOrden(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaTeniente.size(); i++) {
            if (this.listaTeniente.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede dar orden a un teniente");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede dar orden a otro teniente");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(j).darOrden(this.listaTeniente.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(j).darOrden(this.listaTeniente.get(i)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCapitan.size() ; i++) {
            if (this.listaCapitan.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede dar orden a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede dar orden a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El coronel no puede dar orden a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El capitan no puede dar orden a otro capitan");
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCoronel.size(); i++) {
            if (this.listaCoronel.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede dar orden a un coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede dar orden a un coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El coronel no puede dar orden a otro coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El capitan no puede dar orden a un coronel");
                        return;
                    }
                }
            }
        }
    }

    private void reganarAction (JList jList1, JList jList2, JLabel jLabel1) {
        if (jList1.getSelectedIndex() == -1 || jList2.getSelectedIndex() == -1) {
            jLabel1.setText("Seleccione un soldado");
            return;
        }

        if (jList1.getSelectedIndex() == jList2.getSelectedIndex()) {
            jLabel1.setText("No puede dar orden a si mismo");
            return;
        }

        for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
            if (this.listaSoldadoRaso.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado no puede regañar a otro soldado raso");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(j).reganiado(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(j).reganiado(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(j).reganiado(this.listaSoldadoRaso.get(i)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaTeniente.size(); i++) {
            if (this.listaTeniente.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede regañar a un teniente");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede regañar a otro teniente");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(j).reganiado(this.listaTeniente.get(i)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(j).reganiado(this.listaTeniente.get(i)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCapitan.size() ; i++) {
            if (this.listaCapitan.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede regañar a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede regañar a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El coronel no puede regañar a un capitan");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El capitan no puede regañar a otro capitan");
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCoronel.size(); i++) {
            if (this.listaCoronel.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El soldado Raso no puede regañar a un coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El teniente no puede regañar a un coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El coronel no puede regañar a otro coronel");
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText("El capitan no puede regañar a un coronel");
                        return;
                    }
                }
            }
        }
    }

    private void saludarAction (JList jList1, JList jList2, JLabel jLabel1) {
        if (jList1.getSelectedIndex() == -1 || jList2.getSelectedIndex() == -1) {
            jLabel1.setText("Seleccione un soldado");
            return;
        }

        if (jList1.getSelectedIndex() == jList2.getSelectedIndex()) {
            jLabel1.setText("No puede dar orden a si mismo");
            return;
        }

        for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
            if (this.listaSoldadoRaso.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaSoldadoRaso.get(i).saludar(this.listaSoldadoRaso.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaSoldadoRaso.get(i).saludar(this.listaTeniente.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaSoldadoRaso.get(i).saludar(this.listaCoronel.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaSoldadoRaso.get(i).saludar(this.listaCapitan.get(j)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaTeniente.size(); i++) {
            if (this.listaTeniente.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(i).saludar(this.listaSoldadoRaso.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(i).saludar(this.listaTeniente.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(i).saludar(this.listaCoronel.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaTeniente.get(i).saludar(this.listaCapitan.get(j)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCapitan.size() ; i++) {
            if (this.listaCapitan.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(i).saludar(this.listaSoldadoRaso.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(i).saludar(this.listaTeniente.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(i).saludar(this.listaCoronel.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCapitan.get(i).saludar(this.listaCapitan.get(j)));
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < this.listaCoronel.size(); i++) {
            if (this.listaCoronel.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                for (int j = 0; j < this.listaSoldadoRaso.size(); j++) {
                    if (this.listaSoldadoRaso.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(i).saludar(this.listaSoldadoRaso.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaTeniente.size(); j++) {
                    if (this.listaTeniente.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(i).saludar(this.listaTeniente.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCoronel.size(); j++) {
                    if (this.listaCoronel.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(i).saludar(this.listaCoronel.get(j)));
                        return;
                    }
                }

                for (int j = 0; j < this.listaCapitan.size(); j++) {
                    if (this.listaCapitan.get(j).getContSoldado() == jList2.getSelectedIndex() + 1) {
                        jLabel1.setText(this.listaCoronel.get(i).saludar(this.listaCapitan.get(j)));
                        return;
                    }
                }
            }
        }
    }

    private void patrullarAction (JList jList1, JList jList2, JLabel jLabel1) {
        if (jList1.getSelectedIndex() == -1 && jList2.getSelectedIndex() == -1) {
            jLabel1.setText("Seleccione un soldado");
            return;
        }

        for (int i = 0; i < this.listaSoldadoRaso.size(); i++) {
            if (this.listaSoldadoRaso.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                jLabel1.setText(this.listaSoldadoRaso.get(i).patrullar());
                return;
            }
        }

        for (int i = 0; i < this.listaTeniente.size(); i++) {
            if (this.listaTeniente.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                jLabel1.setText(this.listaTeniente.get(i).patrullar());
                return;
            }
        }

        for (int i = 0; i < this.listaCoronel.size(); i++) {
            if (this.listaCoronel.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                jLabel1.setText(this.listaCoronel.get(i).patrullar());
                return;
            }
        }

        for (int i = 0; i < this.listaCapitan.size(); i++) {
            if (this.listaCapitan.get(i).getContSoldado() == jList1.getSelectedIndex() + 1) {
                jLabel1.setText(this.listaCapitan.get(i).patrullar());
                return;
            }
        }
    }
}
