package com.company.strategy;

public class DiscountByWeight implements DiscountBehavior
{
    public static final int maxWeightForDiscount = 2;

    @Override
    public void applyDiscount(ShipmentParameters shipmentParameters)
    {
        if(shipmentParameters.getWeight() < maxWeightForDiscount)
        {
            System.out.println("Discount is applied. Weight is suitable.");
        }
        else
        {
            System.out.println("Discount can't be applied. too heavy.");
        }
    }
}
