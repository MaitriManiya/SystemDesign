public class Main {
    public static void main(String[] args) {
       RoomElement singleRoomObj= new SingleRoom();
       RoomElement doubleRoomObj= new DoubleRoom();
       RoomElement deluxRoomObj= new DeluxRoom();

       RoomVisitor pricingVisitorObj= new RoomPricingVisitor();
       singleRoomObj.accept(pricingVisitorObj);
       System.out.println(((SingleRoom)singleRoomObj).roomPrice);

        doubleRoomObj.accept(pricingVisitorObj);
        System.out.println(((DoubleRoom)doubleRoomObj).roomPrice);

        deluxRoomObj.accept(pricingVisitorObj);
        System.out.println(((DeluxRoom)deluxRoomObj).roomPrice);

        RoomVisitor maintenanceVisitorObj= new RoomMaintenanceVisitor();
        singleRoomObj.accept(maintenanceVisitorObj);
        doubleRoomObj.accept(maintenanceVisitorObj);
        deluxRoomObj.accept(maintenanceVisitorObj);
    }
}