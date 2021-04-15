import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{

    //Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public double area() {
        double area_todo = 0;
        for (Graphic graphic : childGraphics) {
            area_todo += graphic.area();
        }
        return(area_todo);
    }

    public double perimetro(){
        double perimetro_total = 0;
        for (Graphic g : childGraphics){
            perimetro_total += g.perimetro();
        }
        return perimetro_total;
    }


    //Adiciona o grafico a composição.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }
    //Remove a forma geometrica da composição.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
