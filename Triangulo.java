
public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;
    

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.altura = altura;
        this.base = base;
        

    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double getArea(){
        double a = this.base * this.altura / 2;
        super.setArea(a);
        return a;
    }
    @Override
    public double getPerimetro(){
        double p = 3 * this.base;
        super.setPerimetro(p);
        //System.out.println("Perimetro de figura geometrica"+ super.getPerimetro());
        // si desde la clase hija nesesitas usar un metodo de la clase padre debes de 
        //usar la palabra super el . y el nombre del metodo

        return p;
    }

    
    @Override
    public String toString() {
        return super.toString()+"Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}
