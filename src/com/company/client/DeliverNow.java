package com.company.client;

import com.company.strategy.DiscountByWeight;
import com.company.strategy.FastDeliveryByCity;

public class DeliverNow extends CargoFirm
{
    public DeliverNow()
    {
        this.discountBehavior = new DiscountByWeight();
        this.fastDeliveryBehavior = new FastDeliveryByCity();
    }

    @Override
    public void createShipment()
    {
        System.out.println("Created a shipment for DeliverNow...");
    }
}
