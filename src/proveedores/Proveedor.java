package proveedores;

import planes.PlanDatos;

public abstract class Proveedor {

    protected String nombreProveedor;

    public Proveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public abstract PlanDatos crearPlan(String tipo);

    @Override
    public String toString() {
        return nombreProveedor;
    }
}