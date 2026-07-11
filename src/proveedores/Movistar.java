package proveedores;

import planes.*;

public class Movistar extends Proveedor {

    public Movistar() {
        super("Movistar");
    }

    @Override
    public PlanDatos crearPlan(String tipo) {

        PlanDatos plan = null;

        switch (tipo.toLowerCase()) {

            case "personal":
                plan = new PlanPersonal();
                plan.setTasa(0.8f);
                break;

            case "negocio":
                plan = new PlanNegocio();
                plan.setTasa(1.6f);
                break;

            case "academico":
                plan = new PlanAcademico();
                plan.setTasa(1.25f);
                break;
        }

        return plan;
    }
}