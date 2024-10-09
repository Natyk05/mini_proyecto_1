public class SoldadoRaso extends Soldado implements OperacionesMilitares {
    private Rango rango;

    public SoldadoRaso(String nombre, String id) {
        super(nombre, id, "Soldado Raso");
        this.rango = new Rango(1) {
            @Override
            public void realizarAccion() {
                System.out.println(nombre + " sigue las órdenes.");
            }
        };
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Misión asignada a " + nombre + ": " + mision);
    }

    @Override
    public void reportarEstado() {
        System.out.println(nombre + " está en estado operativo.");
    }

    public void realizarAccion() {
        rango.realizarAccion();  // Ejecutar la acción del rango
    }
}
