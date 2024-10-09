public class Teniente extends Soldado implements OperacionesMilitares {
    private Rango rango;
    private String unidad;

    public Teniente(String nombre, String id, String unidad) {
        super(nombre, id, "Teniente");
        this.unidad = unidad;
        this.rango = new Rango(2) {
            @Override
            public void realizarAccion() {
                System.out.println(nombre + " lidera a los Soldados Rasos.");
            }
        };
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada al Teniente " + nombre + ": " + mision + " con la unidad " + unidad);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Teniente " + nombre + " está liderando la unidad " + unidad);
    }

    public void realizarAccion() {
        rango.realizarAccion();  // Ejecutar la acción del rango
    }
}
