public abstract class MaterialReciclable {
    protected String tipo;
    protected double peso;
    protected String material;

    public MaterialReciclable(String tipo, double peso, String material) {
        this.tipo = tipo;
        this.peso = peso;
        this.material = material;
    }

    public abstract double calcularPrecioReciclaje();

    public abstract boolean verificarSiEsReciclable();
}
