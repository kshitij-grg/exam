package part2_2_7;

public sealed interface Shipment permits ExpressShipment, OvernightShipment, StandardShipment {
    String getTrackingDetails();
}
