package pt.vhpp.datastructures;

/*
 * @author Vitor Pereira
 * This is a class for a simplified Partition Data structure that is one of the ways to
 * implement a Disjoint Set for Union Find algorithms.
 * 
 * Notes:
 * - Initialization: All nodes are started at -1 which is the size of each disjoint set,
 *   at first all nodes are disjoint
 * 
 * Further information on Union Find here: https://en.wikipedia.org/wiki/Disjoint-set_data_structure
 */
public class Partition {
    private int[] partition;

    public Partition(int nElems) {
        partition = new int[nElems];
        for (int i = 0; i < nElems ; i++) {
            partition[i] = -1;
        }
    }

    /* If partition[i] < = then it is disjoint, else it point to another node
     * and while it finds the "parent" node it tunes the set so subsequent finds are faster
     */
    public int find (int element) {
        if (partition[element] < 0) {
            return element;
        } else {
            partition[element] = find(partition[element]);
            return partition[element];
        }
    }

    /* It unifies the Disjoint sets, by finding the parent of each first
     * and then the one that has the lower value (disjoint set size is saved as a negative number on the
     * parent for ease of implementation). 
     */
    public void union(int first, int second) {
        // Guarantee that you have the "head" of the Disjoint set
        int setA = find(first);
        int setB = find(second);

        if(partition[setA] <= partition[setB]) {
            partition[setA] = partition[setA] + partition[setB];
            partition[setB] = setA;
        } else {
            partition[setB] = partition[setB] + partition[setA];
            partition[setA] = setB;
        }
    }
}
