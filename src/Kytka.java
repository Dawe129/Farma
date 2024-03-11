public class Kytka extends Flower {

    public Kytka(String name, double price, double neededArea, boolean voda, double chanceOfGrowth) {
        super(name, price, neededArea, voda, chanceOfGrowth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kytka{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", neededArea=").append(neededArea);
        sb.append(", voda=").append(voda);
        sb.append(", chanceOfGrowth=").append(chanceOfGrowth);
        sb.append(", kytky=").append(kytky);
        sb.append('}');
        return sb.toString();
    }
}

