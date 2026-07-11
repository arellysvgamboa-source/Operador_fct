package fabrica;

import proveedores.*;

public class FabricaCreadora {

    public static Proveedor crearPlanDatos(String proveedor) {

        switch (proveedor.toLowerCase()) {

            case "linearapida":
                return new LineaRapida();

            case "claro":
                return new Claro();

            case "movistar":
                return new Movistar();

            default:
                return null;
        }
    }
}