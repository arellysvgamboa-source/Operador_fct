package proveedores;

import planes.*;

public class LineaRapida extends Proveedor {

    public LineaRapida() {
        super("Linea Rapida");
    }

    @Override
    public PlanDatos crearPlan(String tipo) {

        PlanDatos plan = null;

        switch (tipo.toLowerCase()) {

            case "personal":
                plan = new PlanPersonal();
                plan.setTasa(0.5f);
                break;

            case "negocio":
                plan = new PlanNegocio();
                plan.setTasa(1.5f);
                break;

            case "academico":
                plan = new PlanAcademico();
                plan.setTasa(1.0f);
                break;
        }

        return plan;
    }
}