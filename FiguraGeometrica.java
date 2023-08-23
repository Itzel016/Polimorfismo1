class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public double calcularArea() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}