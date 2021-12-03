package com.company.client;

import com.company.strategy.DiscountByWeight;
import com.company.strategy.FastDeliveryByCity;

public class EasyPeasy extends CargoFirm
{
    public EasyPeasy()
    {
        this.discountBehavior = new DiscountByWeight();
        this.fastDeliveryBehavior = new FastDeliveryByCity();
    }

    @Override
    public void createShipment()
    {
        System.out.println("Creating shipment for EasyPeasy");
    }
}