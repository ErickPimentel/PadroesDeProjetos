public class ClienteComposite {
    public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Inicializa tres componentes do grafico.
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Faz o grafico
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        System.out.println("Graphic1 Area: " + graphic1.area());
        System.out.println("Graphic1 Perimetro: " + graphic1.perimetro());

        graphic2.add(ellipse4);

        System.out.println("Graphic2 Area: " + graphic2.area());
        System.out.println("Graphic2 Perimetro: " + graphic2.perimetro());

        graphic.add(graphic1);
        graphic.add(graphic2);
        graphic.add(new Circle());
        // Printa quatro vezes a String Ellipse ( Ele printa o grafico completo).
        graphic.print();

        System.out.println("Graphic2 Area: " + graphic.area());
        System.out.println("Graphic2 Perimetro: " + graphic.perimetro());

        CompositeGraphic graphic3 = new CompositeGraphic();
        graphic3.add(graphic1);
        graphic3.add(graphic2);
        graphic3.add(new Square());
        graphic3.add(new Triangle());
        graphic3.add(new Circle());
        graphic3.add(new Ellipse());

        System.out.println("Graphic2 Area: " + graphic.area());
        System.out.println("Graphic2 Perimetro: " + graphic.perimetro());

        graphic3.remove(graphic1);

        System.out.println("Graphic2 Area: " + graphic.area());
        System.out.println("Graphic2 Perimetro: " + graphic.perimetro());


    }
}
