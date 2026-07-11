package planes;

public abstract class PlanDatos {

    protected String nombre;
    protected float tasa;

    public PlanDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setTasa(float tasa){
        this.tasa = tasa;
    };

    public float calculaPago(int megas) {
        return tasa * megas;
    }

    @Override
    public String toString() {
        return "Plan: " + nombre + " Tasa :" + tasa;
    }
}