public class Capitan extends Soldado implements OperacionesMilitares {
    private Rango rango;
    private int cantidadSoldadosBajoSuMando;

    public Capitan(String nombre, String id, int cantidadSoldadosBajoSuMando) {
        super(nombre, id, "Capitan");
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
        this.rango = new Rango(3) {
            @Override
            public void realizarAccion() {
                System.out.println(nombre + " está coordinando una misión.");
            }
        };
    }

    @Override
    public void asignarMision(String mision) {
        System.out.println("Capitán " + nombre + " ha asignado la misión: " + mision + " a sus " + cantidadSoldadosBajoSuMando + " soldados.");
    }

    @Override
    public void reportarEstado() {
        System.out.println("Capitán " + nombre + " está coordinando a " + cantidadSoldadosBajoSuMando + " soldados.");
    }

    public void realizarAccion() {
        rango.realizarAccion();  // Ejecutar la acción del rango
    }
}
