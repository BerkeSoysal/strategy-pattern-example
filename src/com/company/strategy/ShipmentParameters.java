package com.company.strategy;

public class ShipmentParameters
{
    private boolean isSameCity;
    private int distance;
    private int weight;

    public boolean isSameCity()
    {
        return isSameCity;
    }

    public void setSameCity(boolean sameCity)
    {
        isSameCity = sameCity;
    }

    public int getDistance()
    {
        return distance;
    }

    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}
