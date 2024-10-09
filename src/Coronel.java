public class Coronel extends Soldado implements OperacionesMilitares {
    private Rango rango;
    private String estrategia;

    public Coronel(String nombre, String id, String estrategia) {
        super(nombre, id, "Coronel");
        this.estrategia = estrategia;
        this.rango = new Rango(4) {
            @Override
            public void realizarAccion() {
                System.out.println("Coronel " + nombre + " está implementando la estrategia: " + estrategia);
            }
        };
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Coronel " + nombre + " ha asignado la misión: " + mision + " dentro de la estrategia: " + estrategia);
    }

    @Override
    public void reportarEstado() {
        System.out.println("Coronel " + nombre + " está implementando la estrategia: " + estrategia);
    }

    public void realizarAccion() {
        rango.realizarAccion();  // Ejecutar la acción del rango
    }
}
