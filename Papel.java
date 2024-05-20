public class Papel extends MaterialReciclable implements Reciclable {
    private String color;

    public Papel(String tipo, double peso, String material, String color) {
        super(tipo, peso, material);
        this.color = color;
    }

    @Override
    public double calcularPrecioReciclaje() {
        // Implementación específica para papel
        return peso * 0.10; // Ejemplo de cálculo
    }

    @Override
    public boolean verificarSiEsReciclable() {
        // Implementación específica para papel
        return !color.equalsIgnoreCase("negro");
    }

    @Override
    public void reciclar() {
        // Proceso de reciclaje específico para papel
        System.out.println("Reciclando papel de color: " + color);
    }

    @Override
    public String obtenerInformacionReciclaje() {
        return "Papel de tipo: " + tipo + ", peso: " + peso + ", material: " + material + ", color: " + color;
    }
}
