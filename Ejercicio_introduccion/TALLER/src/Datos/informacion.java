
package Datos;

import javax.swing.JOptionPane;

public class informacion {

    public static void main(String[] args) {
        dataBase datos = new dataBase();
        
        datos.Inicializar();
        
        boolean salir = false;

        JOptionPane.showMessageDialog(null, " BIENVENIDO AL SISTEMA DE RESERVA DE VIAJES ");
        JOptionPane.showMessageDialog(null, " RELLENE LOS DATOS NECESARIOS:");

        datos.datosE[0] = JOptionPane.showInputDialog("1ER NOMBRE:");
        datos.datosE[1] = JOptionPane.showInputDialog("APELLIDO PATERNO:");
        datos.datosN[0] = Integer.parseInt(JOptionPane.showInputDialog("DNI:"));
        datos.datosN[1] = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DE PERSONAS EN TOTAL (INCLUIDO USTED):"));
        int numero;
        numero=datos.datosN[1];
        JOptionPane.showMessageDialog(null, "INFORMACION RECIBIDA!");
 
        while (!salir) {
            String menu = "*****MENU*****\n" +
                    "Digite el numero de la opcion que elija:\n" +
                    "1) REALIZAR RESERVACION\n" +
                    "2) BUSCAR RESERVA POR NOMBRE\n" +
                    "3) CANCELAR RESERVA\n" +
                    "4) FACTURA\n" +
                    "5) SALIR";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                
                case 1:
                    boolean tipo = true;
                    while (tipo) {
                        String habitacionesDisponibles = "REGISTRE su tipo de vuelo:\n" +
                                "1) Vuelos nacionales:\n" +
                                "2) Vuelos internacionales:\n" +
                                "3) Vuelos comerciales: \n" +
                                "4) Vuelos privados o ejecutivos:\n" +
                                "5) Vuelos directos: ";

                        int numop = Integer.parseInt(JOptionPane.showInputDialog(habitacionesDisponibles));

                        int precio = 0;

                        switch (numop) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Precio por pasajero: 125 dolares");
                                precio = 125;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Precio por pasajero: 200 dolares");
                                precio = 200;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Precio por pasajero: 150 dolares");
                                precio = 150;
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Precio por pasajero: 400 dolares");
                                precio = 400;
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Precio por pasajero: 250 dolares");
                                precio = 200;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                                continue;
                        }

                        tipo = false;

                        double monto = numero * precio;
                        JOptionPane.showMessageDialog(null, "MONTO ESTIMADO: " + monto + " DOLARES");

                        datos.dinero[0] = monto;
                        datos.dinero[2]=precio;
                    }

                    JOptionPane.showMessageDialog(null, "RESERVA REALIZADA CON EXITO!");
                    break;

                case 2:
                    boolean encontrado = false;
                    String nombreBuscado = JOptionPane.showInputDialog("INGRESE SOLO EL PRIMER NOMBRE DE LA PERSONA:");

                    if (nombreBuscado.equals(datos.datosE[0])) {
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, nombreBuscado + " ya ha hecho reservas");
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "NINGUNA RESERVA HECHA POR " + nombreBuscado);
                    }
                    break;

                case 3:
                    String respuesta1 = JOptionPane.showInputDialog("ESTA SEGURO DE HACER LA CANCELACION? S/N");
                    respuesta1 = respuesta1.toUpperCase();

                    if (respuesta1.equals("S")) {
                        datos.dinero[0] = 0;
                        datos.dinero[1] = 0;
                        datos.datosE[0] = "NINGUNO";
                        datos.datosE[1] = "";
                        datos.datosN[0] = 0; 
                        datos.datosN[1] = 0;
                        JOptionPane.showMessageDialog(null, "RESERVACION CANCELADA CON EXITO!");
                    } else if (respuesta1.equals("N")) {
                        JOptionPane.showMessageDialog(null, "***SALIENDO***");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, ELIJA 'S' para SI y 'N' para NO");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "FACTURA:\n" +
                            "---------------------------------\n" +
                            "NOMBRE: " + datos.datosE[0] + " " + datos.datosE[1] + "\n" +
                            "DNI: " + datos.datosN[0] + "\n" +
                            "NUMERO DE PERSONAS EN TOTAL: " + datos.datosN[1] + "\n" +
                            "MONTO ESTIMADO: " + datos.dinero[2] + " DOLARES\n" +
                            "MONTO TOTAL: " + (datos.dinero[0] + datos.dinero[1]) + " DOLARES\n" +
                            "---------------------------------");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR NUESTRO PROGRAMA!");
                    salir = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                    break;
            }
        }
    }
    }
    

