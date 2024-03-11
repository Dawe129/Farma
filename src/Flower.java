import java.util.ArrayList;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected boolean voda;
    protected double chanceOfGrowth;

    ArrayList<Flower> kytky = new ArrayList<>();

    public Flower(String name, double price, double neededArea, boolean voda, double chanceOfGrowth) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.voda = voda;
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public boolean isVoda() {
        return voda;
    }

    public double getChanceOfGrowth() {
        return chanceOfGrowth;
    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public void setVoda(boolean voda) {
        this.voda = voda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
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
