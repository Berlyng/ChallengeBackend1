

import java.util.Map;
import java.util.Scanner;

public class Principal {

    static void menu() {

        System.out.println("#################### Menu #######################");
        System.out.println("Seleccione el tipo de cambio que desea realizar");
        System.out.println("1) USD a ARS");
        System.out.println("2) ARS a USD");
        System.out.println("3) BOB a USD");
        System.out.println("4) USD a BOB");
        System.out.println("5) CLP a USD");
        System.out.println("6) USD a CLP");
        System.out.println("7) COP a USD");
        System.out.println("8) USD a COP");
        System.out.println("9) Salir");
        System.out.println("##################################################");
    }

    static void convertidor(String monedaDeorigen, String monedaDestino) {
        String opc = "";
        ConsultorDeConversor consultor = new ConsultorDeConversor();
        String tipoDemoneda = monedaDeorigen;
        Conversor conversor = consultor.verconversor(tipoDemoneda);
        Map<String, Float> tasasDeConversion = conversor.conversion_rates();
        opc = monedaDestino;
        Float cambio = tasasDeConversion.get(opc);
        Scanner lectura1 = new Scanner(System.in);
        System.out.println("A seleccionado de " + monedaDeorigen + " a " + monedaDestino);
        System.out.println("Cuanto desea cambiar? ");
        var monto = Float.valueOf(lectura1.next());
        float resultado = monto * cambio;
        System.out.println("El cambio es de USD a ARS es de: " + resultado);
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            menu();
            int seleccion = Integer.parseInt(lectura.next());

            switch (seleccion) {
                case 1:
                    convertidor("USD", "ARS");
                    break;
                case 2:
                    convertidor("ARS", "USD");
                    break;
                case 3:
                    convertidor("BOB", "USD");
                    break;
                case 4:
                    convertidor("USD", "BOB");
                    break;
                case 5:
                    convertidor("CLP", "USD");
                    break;
                case 6:
                    convertidor("USD", "CLP");
                    break;
                case 7:
                    convertidor("COP", "USD");
                    break;
                case 8:
                    convertidor("USD", "COP");
                    break;
                case 9:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
