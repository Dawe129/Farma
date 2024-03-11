import java.util.ArrayList;

public class Farm extends Flower {

    ArrayList<Flower> flowers;

    public void vyrostlaRostlina(Flower flower) {
        for (Flower flower1 : flowers) {
            if (flower.voda = (true)) {
                setChanceOfGrowth(60);
            } else {
                System.out.println("Nepodarilo se rostlionu zalit");
            }
        }
    }
}
