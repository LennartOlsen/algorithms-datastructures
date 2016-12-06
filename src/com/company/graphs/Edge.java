/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.graphs;

/**
 *
 * @author Alexandros
 */
public class Edge {
    private static int idCount = 1;
    private int id;
    private double weight;
    private Vertice start;
    private Vertice destination;
    
    Edge(double weight, Vertice start, Vertice destination)
    {
        this.id = idCount;
        this.weight = weight;
        this.start = start;
        setDestination(destination);
        idCount++;

    }
    
    
    public String ToString()
    {
        return "Edge: " + getStart().getName() + " -> " + getDestination().getName(); 
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
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
     * @return the start
     */
    public Vertice getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(Vertice start) {
        this.start = start;
    }

    /**
     * @return the destination
     */
    public Vertice getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Vertice destination) {
        destination.setIndegrees(destination.getIndegrees() + 1);
        this.destination = destination;

    }
}
