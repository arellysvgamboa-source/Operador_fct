package planes;

public abstract class PlanDatos {

    protected String nombre;
    protected float tasa;

    public PlanDatos(String nombre) {
        this.nombre = nombre;
    }

    public abstract void setTasa();

    public float calculaPago(int megas) {
        return tasa * megas;
    }

    @Override
    public String toString() {
        return "Plan: " + nombre + " Tasa :" + tasa;
    }
}