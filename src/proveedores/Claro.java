package proveedores;

import planes.*;

public class Claro extends Proveedor {

    public Claro() {
        super("Claro");
    }

    @Override
    public PlanDatos crearPlan(String tipo) {

        PlanDatos plan = null;

        switch (tipo.toLowerCase()) {

            case "personal":
                plan = new PlanPersonal();
                plan.setTasa(0.6f);
                break;

            case "negocio":
                plan = new PlanNegocio();
                plan.setTasa(1.6f);
                break;

            case "academico":
                plan = new PlanAcademico();
                plan.setTasa(1.2f);
                break;
        }

        return plan;
    }
}