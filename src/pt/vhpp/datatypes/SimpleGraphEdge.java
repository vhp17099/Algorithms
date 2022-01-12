package pt.vhpp.datatypes;

public class SimpleGraphEdge implements Comparable<SimpleGraphEdge>{
    private Integer to;
    private Integer cost;

    public SimpleGraphEdge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(SimpleGraphEdge other) {
        int comp = cost.compareTo(other.getCost());
        if (comp == 0) {
            comp = to.compareTo(other.getTo());
        }
        return comp;
    }
}
