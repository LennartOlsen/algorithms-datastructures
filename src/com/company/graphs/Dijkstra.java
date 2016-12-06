/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.graphs;

import java.util.*;

/**
 *
 * @author Alexandros
 */
public class Dijkstra {

    public static List<Vertice> nodes;
    public static void main() {

        nodes = new ArrayList();
        TopSort(acyclicGraph());

        Vertice[] startend = initNodes(false);
        ExecuteDijkstra(startend[0], startend[1]);
        ShowBestPath(startend[1]);
    }
    
    
    public static void ExecuteDijkstra(Vertice Source, Vertice destination)  {
        // Set the priority queue
        PriorityQueue<Vertice> queue = new PriorityQueue<Vertice>(201, 
            new Comparator<Vertice>(){
                public int compare(Vertice a, Vertice b){
                    if (a.getWeight() > b.getWeight()) 
                        return 1;
                    else
                        return -1;
                }
            });
        
        queue.add(Source);
        
        while(!queue.isEmpty())
        {
            Vertice v = queue.poll();
            List<Edge> e = v.getEdges();
            
            
            // Set vertice as visited
            v.setVisited(true);
            
            // Show node
            System.out.println(v.ToString());
            
            // Go through edges
            for(int j = 0; j < e.size(); j++ )
            {
                double curDistance = e.get(j).getDestination().getWeight();
                double newDistance = v.getWeight() + e.get(j).getWeight();
                Vertice next = e.get(j).getDestination();
                
                // Compare 
                if( curDistance > newDistance)
                {
                    // set new weight
                    next.setWeight(newDistance);
                    next.setPrev(v);
                }
                
                // if Vertice has not been visited
                if(!next.isVisited())
                { // add Vertice to queue
                    queue.add(next);
                }
                
                // Destination found and has been visited
                if(v.equals(destination) && v.isVisited())
                    return;
                
                // Show Edge 
                System.out.println(e.get(j).ToString());
            }
        }
    }
    
    
    public static void ShowBestPath(Vertice v) {
        System.out.println("Best path weight " + v.getWeight());
        
        // Set shortest path ending vertice
        String path = " -> " + v.getName();
        while(true)
        {
            // If previous vertice is empty we are back at the beginning
            if(v.getPrev() != null)
            {
                // combine string of shortest path 
                path =  " -> " + v.getPrev().getName() + path;
                v = v.getPrev();
            }
            else
            {
                System.out.println("Shortest path is: " + path);
                return;
            }
        }
    }

    private static void TopSort(Vertice[] vertices){
        LinkedList<Vertice> ll = new LinkedList<>();

        int counter = 0;
        final int NUM_VERTICIES = vertices.length;

        for (Vertice v:
             vertices) {
            if(v.getIndegrees() == 0){
                ll.addFirst(v);
            }
        }

        while(!ll.isEmpty()){

            Vertice v = ll.pop();
            v.setTopnum(++counter);
            System.out.print("HANDLING : ");
            System.out.println(v.getName());



            for (Vertice vA:
                 v.getAdjecentTo()) {
                System.out.print("Setting ");
                System.out.print(vA.getName().toUpperCase() +  "s INDEGREES TO ");
                System.out.print(vA.getIndegrees() - 1);
                System.out.println();
                vA.setIndegrees(vA.getIndegrees() - 1);
                if(vA.getIndegrees() == 0){
                    ll.addFirst(vA);
                }
            }

            System.out.println("=======================" + "\n");

        }

        if(counter != NUM_VERTICIES){
            System.out.println("Is Cyclic" + "\n");
        } else {
            System.out.println("No Cycles" + "\n");
        }
    }

    private static Vertice[] initNodes(Boolean returnAll){
        // All Vertices
        Vertice a = new Vertice("a");
        Vertice b = new Vertice("b");
        Vertice c = new Vertice("c");
        Vertice d = new Vertice("d");
        Vertice e = new Vertice("e");
        Vertice f = new Vertice("f");
        Vertice g = new Vertice("g");

        // Edges for A
        a.AddEdge(new Edge(1, a, b));

        // Edges for B
        b.AddEdge(new Edge(3, b, c));
        b.AddEdge(new Edge(2, b, d));
        b.AddEdge(new Edge(1, b, e));

        // Edges for C
        c.AddEdge(new Edge(4, c, e));
        c.AddEdge(new Edge(1, c, d));

        // Edges for D
        d.AddEdge(new Edge(2, d, a));
        d.AddEdge(new Edge(2, d, e));

        // Edges for G
        g.AddEdge(new Edge(1, g, d));

        // Edges for E
        e.AddEdge(new Edge(3, e, f));

        a.setWeight(0);

        if(!returnAll) {
            return new Vertice[]{a, f};
        }else {
            return new Vertice[]{a,b,c,d,e,f,g};
        }
    }

    /**
     * SEE : http://faculty.cs.niu.edu/~freedman/340/340notes/gifImages/340graph2.gif
     * @return
     */
    private static Vertice[] acyclicGraph(){
        // All Vertices
        Vertice a = new Vertice("a");
        Vertice b = new Vertice("b");
        Vertice c = new Vertice("c");
        Vertice d = new Vertice("d");
        Vertice e = new Vertice("e");
        Vertice f = new Vertice("f");
        Vertice g = new Vertice("g");

        // Edges for A
        a.AddEdge(new Edge(1, a, b));
        a.AddEdge(new Edge(1, a, c));
        a.AddEdge(new Edge(1, a, d));

        // Edges for B
        b.AddEdge(new Edge(3, b, d));
        b.AddEdge(new Edge(2, b, e));

        // Edges for C
        c.AddEdge(new Edge(4, c, f));

        // Edges for D
        d.AddEdge(new Edge(2, d, c));
        d.AddEdge(new Edge(2, d, f));
        d.AddEdge(new Edge(2, d, g));

        // Edges for E
        e.AddEdge(new Edge(1, e, d));
        e.AddEdge(new Edge(1, e, g));

        // Edges for F
        // NONE

        // Edges for G
        g.AddEdge(new Edge(3, g, f));

        a.setWeight(0);


        return new Vertice[]{a,b,c,d,e,f,g};
    }
    
}
    

