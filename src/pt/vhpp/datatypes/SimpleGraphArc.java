package pt.vhpp.datatypes;

public class SimpleGraphArc implements Comparable<SimpleGraphArc> {
    private Integer a;
    private Integer b;
    private Integer cost;

    public SimpleGraphArc(int a, int b, int cost) {
        super();
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int compareTo(SimpleGraphArc arc) {
        int comp = cost.compareTo(arc.getCost());
        if (comp == 0) {
            comp = a.compareTo(arc.getA());
        }
        if (comp == 0) {
            comp = b.compareTo(arc.getB());
        }
        return comp;
    }
}
