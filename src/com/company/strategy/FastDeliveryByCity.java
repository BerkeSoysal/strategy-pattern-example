package com.company.strategy;

public class FastDeliveryByCity implements FastDeliveryBehavior
{
    @Override
    public void calculateDaysForDelivery(ShipmentParameters shipmentParameters)
    {
        if(shipmentParameters.isSameCity())
        {
            System.out.println("Will be delivered in 1 Days");
        }
        else
        {
            System.out.println("Will be delivered in 2 Days");
        }
    }
}
