import java.util.ArrayList;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected boolean voda;
    protected int druhy = 5;
    protected double chanceOfGrowth = 50;

    ArrayList<Flower> kytky = new ArrayList<>();

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
