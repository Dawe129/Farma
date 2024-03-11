import java.util.ArrayList;

public class Farm  {

    ArrayList<Flower> flowers;

    public void zasaditRosdtlinu(Flower flower){
        flowers.add(flower);
    }

    public void rustRostliny(Flower flower) {
        for (Flower flower1 : flowers) {
            if (flower.voda = (true)) {
                flower.setChanceOfGrowth(flower.getChanceOfGrowth()+10);
            } else {
                System.out.println("Nepodarilo se rostlionu zalit");
            }
        }
    }


}
