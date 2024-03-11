import java.util.ArrayList;

public class Farm {

    ArrayList<Flower> flowers;

    public void zasaditRostlinu(Flower flower) {
        for (Flower flower1 : flowers) {
            if (flower.area = true) {
                flowers.add(flower);
            } else {
                System.out.println("Nelze zasadit kytku");
            }
        }
    }

    public void rustRostliny(Flower flower) {
        for (Flower flower1 : flowers) {
            if (flower.voda = (true)) {
                flower.setChanceOfGrowth(flower.getChanceOfGrowth() + 10);
            } else {
                System.out.println("Nepodarilo se rostlionu zalit");
            }
        }
    }

    public void skliditRostlinu(Flower flower) {
        for (Flower flower1 : flowers) {
            if (flower.chanceOfGrowth > 50) {
                flowers.remove(flower);
            } else {
                System.out.println("Kytka neni pripravena ne sklizen");
            }
        }
    }
}