public class Piramide extends FiguraGeometrica {
    private double alturaPrisma;
    private double volumen;
    private Triangulo base;

    
    public Piramide(String nombre, double alturaPrisma, Triangulo base) {
        super(nombre);
        this.alturaPrisma = alturaPrisma;
        this.base = base;
    }

    
    public void calcularAreaBase() {
        double areaBase = base.getArea();
        super.setArea(areaBase); 
    }

    
    public void calcularVolumen() {
        this.volumen = getArea() * alturaPrisma; 
    }

    public double getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public Triangulo getBase() {
        return base;
    }

    public void setBase(Triangulo base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return super.toString() + "Piramide [alturaPrisma=" + alturaPrisma + ", volumen=" + volumen + "]";
    }
}
