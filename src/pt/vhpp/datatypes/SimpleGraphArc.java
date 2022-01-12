package pt.vhpp.datatypes;

public class SimpleGraphArc implements Comparable<SimpleGraphArc> {
    private Integer from;
    private Integer to;
    private Integer cost;

    public SimpleGraphArc(int from, int to, int cost) {
        super();
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
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
            comp = from.compareTo(arc.getFrom());
        }
        if (comp == 0) {
            comp = to.compareTo(arc.getTo());
        }
        return comp;
    }
}
