package nl.hva.dmci.ict.se.sortingsearching.pathfinding;

import java.util.Iterator;
import nl.hva.dmci.ict.se.sortingsearching.tileworld.TileWorldUtil;
import nl.hva.dmci.ict.se.sortingsearching.weigthedgraph.DirectedEdge;
import nl.hva.dmci.ict.se.sortingsearching.weigthedgraph.EdgeWeightedDigraph;

/**
 * TODO make sure your code is compliant with the HBO-ICT coding conventions!
 * @author ???
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Here you can do your experiments.
    	
    	// Please have a good look at the constructors of EdgeWeightedDigraph!
    	// Before you save any images make sure the value of TileWorldUtil.outputDir points to an
    	// existing folder and ands with a '/'!
    	// Example: TileWorldUtil.outputDir = "/Users/nico/output/";
        
        EdgeWeightedDigraph graph1 = new EdgeWeightedDigraph("i1");
        EdgeWeightedDigraph graph2 = new EdgeWeightedDigraph("i5");
        EdgeWeightedDigraph graph3 = new EdgeWeightedDigraph("i10");
        EdgeWeightedDigraph graph4 = new EdgeWeightedDigraph("i11");
        EdgeWeightedDigraph graph5 = new EdgeWeightedDigraph("custom1");
        EdgeWeightedDigraph graph6 = new EdgeWeightedDigraph("custom2");
        EdgeWeightedDigraph graph7 = new EdgeWeightedDigraph("custom3");
        EdgeWeightedDigraph graph = graph1;
        double total= 0;
        
        Dijkstra dijkstra = new Dijkstra(graph, graph.getStart());     
//        EdgeWeightedDigraph customGraph1 = new EdgeWeightedDigraph(1400);    
    

        if(dijkstra.hasPathTo(graph.getEnd()))
        {
            graph.tekenPad(dijkstra.pathTo(graph.getEnd()));  
//            System.out.println(dijkstra.pathTo(graph.getEnd()));
          
        for (Iterator<DirectedEdge> print = dijkstra.pathTo(graph.getEnd()).iterator(); print.hasNext();  ) 
        {
            total += print.next().weight();
        }
            System.out.println(total);
            System.out.println(dijkstra.length);
//            System.out.println(dijkstra.knopen);
//            TileWorldUtil.outputDir = "./src/main/resources/output/";
//            graph.save("custom3");
        }else
        {
            System.out.println("Path not found");
        }

    }
    
}
