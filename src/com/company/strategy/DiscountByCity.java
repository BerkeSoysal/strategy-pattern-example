package com.company.strategy;

public class DiscountByCity implements DiscountBehavior
{
    @Override
    public void applyDiscount(ShipmentParameters shipmentParameters)
    {
        if(shipmentParameters.isSameCity())
        {
            System.out.println("Discount is applied. based on city");
        }
        else
        {
            System.out.println("Discount can't be applied. They are not in the same city.");
        }
    }
}
