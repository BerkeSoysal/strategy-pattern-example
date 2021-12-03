package com.company;

import com.company.client.CargoFirm;
import com.company.client.EasyPeasy;
import com.company.client.SafeAndQuick;
import com.company.strategy.DiscountByWeight;
import com.company.strategy.FastDeliveryByCity;
import com.company.strategy.FastDeliveryByDistance;
import com.company.strategy.ShipmentParameters;

public class Main {

    public static void main(String[] args) {

        ShipmentParameters shipmentParameters = new ShipmentParameters();
        shipmentParameters.setSameCity(false);
        shipmentParameters.setDistance(40);
        shipmentParameters.setWeight(1);

        CargoFirm safeAndQuick = new SafeAndQuick();
        safeAndQuick.createShipment();
        safeAndQuick.displayStatus();
        safeAndQuick.performFastDelivery(shipmentParameters);
        safeAndQuick.performDiscount(shipmentParameters); //discount can't be performed, not same city.
        safeAndQuick.setDiscountBehavior(new DiscountByWeight());
        safeAndQuick.performDiscount(shipmentParameters); //discont can be applied based on weight.

        CargoFirm easyPeasy = new EasyPeasy();
        easyPeasy.createShipment();
        easyPeasy.displayStatus();
        easyPeasy.performDiscount(shipmentParameters);
        easyPeasy.performFastDelivery(shipmentParameters); // in 2 days
        easyPeasy.setFastDeliveryBehavior(new FastDeliveryByDistance()); //behavior changed
        easyPeasy.performFastDelivery(shipmentParameters); // in 2 days
    }
}
