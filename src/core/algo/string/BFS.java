package core.algo.string;

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class GraphNode {
    final int nodId;
    private GraphNode(int id) {
        this.nodId = id;
    }

    static GraphNode create(int id) {
        return new GraphNode(id);
    }
    
   	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nodId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphNode other = (GraphNode) obj;
		if (nodId != other.nodId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GN[Id=" + nodId + "]";
	}
}

public class BFS {
    private final Map<GraphNode, ArrayList<GraphNode>> al = new LinkedHashMap<>();
    private final LinkedList<GraphNode> bfsq = new LinkedList<>();

    void traverse(GraphNode n) {
    	
    	Map<GraphNode, Integer> visitedMap = new HashMap<>();
    	bfsq.addFirst(n);        
    	visitedMap.put(n, 0);
        do {
            GraphNode n1 = bfsq.removeLast();
            int num = 0;
            for (GraphNode gn : al.get(n1)) {            	
            	if (al.get(gn).contains(n1))
            		num = visitedMap.get(n1)+6;
            	if (!visitedMap.containsKey(gn)) {
                    bfsq.addFirst(gn);
                    visitedMap.put(gn, num);
                } 
            }            
        } while(!bfsq.isEmpty()) ;

        for (GraphNode gn: al.keySet()) {
        	if (gn.equals(n))
        		continue;
            if (visitedMap.containsKey(gn))
                out.print(visitedMap.get(gn)+" ");
            else
            	out.print("-1 ");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BFS sol1 = new BFS();
        try (Scanner in = new Scanner(new FileInputStream("BFS_case6_input.txt"))) {
        
	        int noOfTestCases = in.nextInt();
	        for (int t = 0; t < noOfTestCases; t++) {
	
	            int noOfVertices = in.nextInt();
	
	            for (int no = 1; no <= noOfVertices; no++)
	                sol1.al.put(GraphNode.create(no), new ArrayList<>());
	
	            int noOfEdges = in.nextInt();
	
	            for (int j = 0; j < noOfEdges; j++) {
	                GraphNode entry = GraphNode.create(in.nextInt());
	                GraphNode adjescent = GraphNode.create(in.nextInt());
	                sol1.al.get(entry).add(adjescent);
	                sol1.al.get(adjescent).add(entry);
	            }
	
	            GraphNode startNode = GraphNode.create(in.nextInt());
	
	            sol1.traverse(startNode);
	            out.println();
	
	            sol1.al.clear();
	        }
        }
    }
}
