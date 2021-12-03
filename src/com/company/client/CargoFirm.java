package com.company.client;

import com.company.strategy.DiscountBehavior;
import com.company.strategy.FastDeliveryBehavior;
import com.company.strategy.ShipmentParameters;

public abstract class CargoFirm
{
    DiscountBehavior discountBehavior;
    FastDeliveryBehavior fastDeliveryBehavior;

    public void performDiscount(ShipmentParameters shipmentParameters)
    {
        discountBehavior.applyDiscount(shipmentParameters);
    }

    public void performFastDelivery(ShipmentParameters shipmentParameters)
    {
        fastDeliveryBehavior.calculateDaysForDelivery(shipmentParameters);
    }
    public abstract void createShipment(); //each firm has its own way of doing that.

    public void displayStatus()
    {
        System.out.println("Displaying status..."); //Fetches from db...
        System.out.println("Your shipment is currenly on delivery.");
    }

    public void setDiscountBehavior(DiscountBehavior discountBehavior)
    {
        this.discountBehavior = discountBehavior;
    }

    public void setFastDeliveryBehavior(FastDeliveryBehavior fastDeliveryBehavior)
    {
        this.fastDeliveryBehavior = fastDeliveryBehavior;
    }
}
