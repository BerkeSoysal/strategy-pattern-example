package com.company.client;

import com.company.strategy.DiscountByCity;
import com.company.strategy.FastDeliveryByDistance;

public class SafeAndQuick extends CargoFirm
{
    public SafeAndQuick()
    {
        this.discountBehavior = new DiscountByCity();
        this.fastDeliveryBehavior = new FastDeliveryByDistance();
    }

    @Override
    public void createShipment()
    {
        System.out.println("Created a shipment for fastdelivery...");
    }
}

