package pt.vhpp.datatypes;

import java.util.List;

public class SimpleGraphNode {
    private Integer id;
    private List<SimpleGraphEdge> edges;

    public SimpleGraphNode(Integer id, List<SimpleGraphEdge> edges) {
        this.id = id;
        this.edges = edges;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<SimpleGraphEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<SimpleGraphEdge> edges) {
        this.edges = edges;
    }

}
