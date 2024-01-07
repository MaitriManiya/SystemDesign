public class RoomPricingVisitor implements RoomVisitor{
    @java.lang.Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("pricing computation login of SingleRoom");
        singleRoomObj.roomPrice=1000;
    }

    @java.lang.Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("pricing computation login of DoubleRoom");
        doubleRoomObj.roomPrice=1000;
    }

    @java.lang.Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("pricing computation login of DeluxRoom");
        deluxRoomObj.roomPrice=1000;
    }
}
