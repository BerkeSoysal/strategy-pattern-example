package com.company.strategy;

public class FastDeliveryByDistance implements FastDeliveryBehavior
{
    private static final int distanceFor1Day = 50;

    @Override
    public void calculateDaysForDelivery(ShipmentParameters shipmentParameters)
    {
        if(shipmentParameters.getDistance() > distanceFor1Day)
        {
            System.out.println("Will be delivered in 2 Days");
        }
        else
        {
            System.out.println("Will be delivered in 1 Day");
        }
    }
}
