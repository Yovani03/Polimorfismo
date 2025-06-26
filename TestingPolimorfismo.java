public class TestingPolimorfismo{
    public static void main(String[] args) {
        FiguraGeometrica unFigura = new FiguraGeometrica("Exagono");
        unFigura.setArea(15);
        unFigura.setPerimetro(14);
        System.out.println("Datos de unaFigura" + unFigura);


        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentagono" , 15);
        System.out.println("Datos de otra figura " + otraFigura.toString());

        Triangulo triangulo1 = new Triangulo("Triangulo",10, 15.8);
        double perimetro = triangulo1.getPerimetro();
        

        System.out.println("Datos del triangulo 1" + triangulo1.toString());

        System.out.println("Area de triangulo" + triangulo1.getArea());
        System.out.println("Perimetro del triangulo 1:" + triangulo1.getPerimetro());
        // si desde la clase hija nesesitas utilizar un metodo de clase padre 
        // solo debes de escribir el objeto de la clase hija, el . y el nombre
        //del metodo. Porque un objeto de la clase hija es tambien un objeto de la clase padre
        
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos del triangulo 1" + triangulo1.toString());

        Triangulo baseTriangulo = new Triangulo("Triangulo base", 10, 8); 
        Piramide prisma1 = new Piramide("Prisma Triangular", 20, baseTriangulo); 
        prisma1.calcularAreaBase();    
        prisma1.calcularVolumen();     

        System.out.println("Área de la base: " + prisma1.getArea());
        System.out.println("Volumen del prisma: " + prisma1.getVolumen());

        

    }
}
