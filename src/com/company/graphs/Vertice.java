/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandros
 */
 
public class Vertice {
    private static int idCount = 1;

    int id = 0;
    private String name;
    private double weight;
    private boolean visited;
    private List<Edge> edges;
    private Vertice prev;
    private int indegrees = 0;
    private int topnum;
    
    Vertice(String name)
    {
        edges = new ArrayList<Edge>();
        this.id = idCount;
        this.name = name;
        visited = false;
        this.weight = Double.POSITIVE_INFINITY; 
        idCount++;
    }
    
    public void AddEdge(Edge e)
    {
        edges.add(e);
    }
    
    public String ToString()
    {
        return "Vertice: " + id + " - " + getName() + ", visited: " + isVisited(); 
    }
    
    
    public List<Edge> getEdges(){
        return edges;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the visited
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     * @return the prev
     */
    public Vertice getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Vertice prev) {
        this.prev = prev;
    }

    public int getIndegrees() {
        return indegrees;
    }

    public void setIndegrees(int indegrees) {
        this.indegrees = indegrees;
    }

    public int getTopnum() {
        return topnum;
    }

    public void setTopnum(int topnum) {
        this.topnum = topnum;
    }

    public List<Vertice> getAdjecentTo(){
        List<Vertice> vs = new ArrayList<>();
        for (Edge e:
             edges) {
            vs.add(e.getDestination());
        }

        return vs;
    }
}
