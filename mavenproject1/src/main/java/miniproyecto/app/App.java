package miniproyecto.app;

import java.util.Scanner;
import java.util.ArrayList;
import miniproyecto.Soldados.Soldado;
import miniproyecto.Soldados.Coronel;
import miniproyecto.Soldados.Capitan;
import miniproyecto.Soldados.Teniente;
import miniproyecto.Soldados.SoldadoRaso;
import miniproyecto.Menu.Menu;

public class App {
    public static void main(String[] args) {
        
        Menu mainMenu = new Menu();
        
        mainMenu.setVisible(true);
        /*Scanner opcion = new Scanner(System.in); 
        
        while (true) {
            System.out.println("Bienvenido al sistema de gestion militar, seleccione una opcion: ");
            String menu = " 1.-Crear \n 2.-Visualizar \n 3.-Modificar \n 4.-Realizar acción \n 5.-Salir";
            System.out.println("--------------------");
            System.out.println(menu);
            System.out.println("--------------------");
            System.out.print("Que opcion que desea realizar: ");
            String respuestas = opcion.nextLine();

            switch (respuestas) {
                case "1":
                    System.out.println("Seleccione el tipo de soldado que desea crear: ");
                    String seleccionSoldado = " 1.-Coronel \n 2.-Capitan \n 3.-Teniente \n 4.-Soldado Raso";
                    System.out.println("--------------------");
                    System.out.println(seleccionSoldado);
                    System.out.println("--------------------");

                    String tipoSoldado = opcion.nextLine();
                    switch (tipoSoldado) {
                        case "1":
                            System.out.print("Ingrese el nombre: ");
                            String nombreCoronel = opcion.nextLine();
                            System.out.print("Ingrese el ID: ");
                            String idCoronel = opcion.nextLine();
                            boolean idExistenteCo = false;
                            for (Soldado soldado : listaSoldados) {
                                if (soldado.getId().equals(idCoronel)) {
                                    System.out.println("El ID ingresado ya existe, vuelva a intentar.");
                                    idExistenteCo = true;
                                    break; 
                                }
                            }

                            if (!idExistenteCo) { 
                                System.out.print("Ingrese la unidad a la que pertenece: ");
                                String unidad = opcion.nextLine();
                                System.out.print("Ingrese una estrategia a seguir: ");
                                String estrategiaPlaneada = opcion.nextLine();
                                listaSoldados.add(new Coronel(nombreCoronel, idCoronel, unidad, estrategiaPlaneada));
                                System.out.println("Coronel agregado con éxito.");
                            } else {
                                System.out.println("No se ha agregado el Coronel debido a un ID duplicado.");
                            }
                            break;

                        case "2":
                            System.out.print("Ingrese el nombre: ");
                            String nombreCapitan = opcion.nextLine();
                            System.out.print("Ingrese el ID: ");
                            String idCapitan = opcion.nextLine();
                            boolean idExistenteCa = false;
                            for (Soldado soldado : listaSoldados) {
                            if (soldado.getId().equals(idCapitan)) {
                                System.out.println("El ID ingresado ya existe, vuelva a intentar.");
                                idExistenteCa = true;
                                break;
                                }
                            }
                            if (!idExistenteCa) { 
                                System.out.print("Ingrese la unidad a la que pertenece: ");
                                String unidadCapitan = opcion.nextLine();
                                System.out.print("Ingrese el numero de soldados bajo su mando: ");
                                int soldadosBajoMando = Integer.parseInt(opcion.nextLine());
                                listaSoldados.add(new Capitan(nombreCapitan, idCapitan, unidadCapitan, soldadosBajoMando));
                                System.out.println("Coronel agregado con éxito.");
                            } else {
                                System.out.println("No se ha agregado el Capitan debido a un ID duplicado.");
                            }
                            break;

                        case "3":
                            System.out.print("Ingrese el nombre: ");
                            String nombreTeniente = opcion.nextLine();
                            System.out.print("Ingrese el ID: ");
                            String idTeniente = opcion.nextLine();
                            boolean idExistenteT = false;
                            for (Soldado soldado : listaSoldados) {
                            if (soldado.getId().equals(idTeniente)) {
                                System.out.println("El ID ingresado ya existe, vuelva a intentar.");
                                idExistenteT = true;
                                break;
                                }
                            }
                            if (!idExistenteT) { 
                                System.out.print("Ingrese la unidad a la que pertenece: ");
                                String unidadTeniente = opcion.nextLine();
                                listaSoldados.add(new Teniente(nombreTeniente, idTeniente, unidadTeniente));
                                System.out.println("Coronel agregado con éxito.");
                            } else {
                                System.out.println("No se ha agregado el Teniente debido a un ID duplicado.");
                            }
                            break;
                            

                        case "4":
                            System.out.print("Ingrese el nombre: ");
                            String nombreSoldado = opcion.nextLine();
                            System.out.print("Ingrese el ID: ");
                            String idSoldado = opcion.nextLine();
                            boolean idExistenteR = false;
                            for (Soldado soldado : listaSoldados) {
                                if (soldado.getId().equals(idSoldado)) {
                                    System.out.println("El ID ingresado ya existe, vuelva a intentar.");
                                    idExistenteR = true;
                                    break;
                                    }
                                }
                                if (!idExistenteR) { 
                                    System.out.print("Ingrese la unidad a la que pertenece: ");
                                    String unidadRaso = opcion.nextLine();
                                    listaSoldados.add(new SoldadoRaso(nombreSoldado, idSoldado, unidadRaso));
                                    System.out.println("Coronel agregado con éxito.");
                                } else {
                                    System.out.println("No se ha agregado el Soldado raso debido a un ID duplicado.");
                                }
                                break;
                    
                        default:
                            System.out.println("Opcion ingresada no valida, vuelva a intentar.");
                            break;
                    }
                    break;

                case "2":
                    System.out.println("Lista de soldados: ");
                    System.out.println("--------------------");
                    for (Soldado soldado : listaSoldados) {
                        soldado.mostrarInformacion();
                        System.out.println("--------------------");
                    }
                    break;

                case "3":
                    System.out.print("Digite el ID del soldado que desea modificar: ");
                    String idSoldadoMod = opcion.nextLine();
                    for (Soldado soldado : listaSoldados) {
                        if (soldado.getId().equals(idSoldadoMod)) {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nuevoNombre = opcion.nextLine();
                            soldado.setNombre(nuevoNombre);
                            System.out.println("Soldado modificado con éxito.");

                            switch (soldado.getRango()) {
                                case "Teniente":
                                    System.out.print("Ingrese el numero de unidades bajo su mando: ");
                                    String unidades = opcion.nextLine();
                                    ((Teniente) soldado).setUnidad(unidades);
                                    break;

                                case "Coronel":
                                    System.out.print("Ingrese la nueva estrategia a seguir: ");
                                    String nuevaEstrategia = opcion.nextLine();
                                    ((Coronel) soldado).setEstrategia(nuevaEstrategia);
                                    break;

                                case "Capitan":
                                    System.out.print("Ingrese el numero de soldados bajo su mando: ");
                                    int soldadosInt = Integer.parseInt(opcion.nextLine());
                                    ((Capitan) soldado).setCantidadSoldadosBajoSuMando(soldadosInt);
                                    break;
                            }
                        }
                    }
                    break;

                case "4":
                    System.out.println("Seleccione el tipo de acción que desea realizar: ");
                    String accion = "1.-Dar orden";
                    System.out.println("--------------------");
                    System.out.println(accion);
                    System.out.println("--------------------");
                    String tipoAccion = opcion.nextLine();
                    switch (tipoAccion) {
                        case "1":
                        System.out.println("ingrese el id del superior: ");
                        String idSuperior = opcion.nextLine();
                        for (Soldado superior : listaSoldados) {
                            if (superior.getId().equals(idSuperior)) {
                                System.out.println("ingrese el id del subordinado: ");
                                String idSubordinado = opcion.nextLine();
                                for (Soldado subordinado : listaSoldados) {
                                    if (subordinado.getId().equals(idSubordinado)) {
                                        if (superior instanceof Coronel && subordinado instanceof Capitan) {
                                            ((Coronel) superior).darOrden((Capitan) subordinado);
                                        } else if (superior instanceof Capitan && subordinado instanceof Teniente) {
                                            ((Capitan) superior).darOrden((Teniente) subordinado);
                                        } else if (superior instanceof Teniente && subordinado instanceof SoldadoRaso) {
                                            ((Teniente) superior).realizarAccion((SoldadoRaso) subordinado);
                                        } else {
                                            System.out.println("El subordinado no tiene un rango inferior adecuado para recibir órdenes.");
                                        }

                                    }
                                }
                            }
                        }
                        break;
                    }
                    break;

                case "5":
                    System.out.println("Saliendo del sistema...");
                    opcion.close();
                    return;

                default:
                    System.out.println("Opcion ingresada no valida, vuelva a intentar.");
                    break;
            }
        }*/
    }
}


