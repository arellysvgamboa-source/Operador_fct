package principal;

import fabrica.*;
import planes.*;
import proveedores.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcion;

        do {

            System.out.println("\n===== PLANES DE INTERNET =====");

            System.out.println("Seleccione una operadora:");
            System.out.println("1. Linea Rapida");
            System.out.println("2. Claro");
            System.out.println("3. Movistar");
            System.out.print("ingrese la opcion seleccionada: ");
            int opOperadora = sc.nextInt();

            String nombreOperadora;

            switch (opOperadora) {
                case 1:
                    nombreOperadora = "linearapida";
                    break;
                case 2:
                    nombreOperadora = "claro";
                    break;
                case 3:
                    nombreOperadora = "movistar";
                    break;
                default:
                    System.out.println("Operadora no valida.");
                    opcion = 'S';
                    continue;
            }

            Proveedor proveedor = FabricaCreadora.crearPlanDatos(nombreOperadora);

            System.out.println("\nSeleccione el tipo de plan:");
            System.out.println("1. Personal");
            System.out.println("2. Negocio");
            System.out.println("3. Academico");
            System.out.print("Ingrese la opcion seleccionada: ");
            int opPlan = sc.nextInt();

            String tipoPlan;

            switch (opPlan) {
                case 1:
                    tipoPlan = "personal";
                    break;
                case 2:
                    tipoPlan = "negocio";
                    break;
                case 3:
                    tipoPlan = "academico";
                    break;
                default:
                    System.out.println("Plan no valido.");
                    opcion = 'S';
                    continue;
            }

            PlanDatos plan = proveedor.crearPlan(tipoPlan);

            System.out.print("\nIngrese la cantidad de megas consumidos: ");
            int megas = sc.nextInt();

            double pago = plan.calculaPago(megas);

            System.out.println("\n===== DETALLE DEL PLAN =====");
            System.out.println("Operadora : " + proveedor);
            System.out.println(plan);
            System.out.println("Megas consumidos : " + megas);
            System.out.println("Pago total : S/. " + pago);

            System.out.print("\n¿Desea registrar otro plan? (SI/NO): ");
            opcion = sc.next().toUpperCase().charAt(0);

        } while (opcion == 'S');

        sc.close();
    }
}