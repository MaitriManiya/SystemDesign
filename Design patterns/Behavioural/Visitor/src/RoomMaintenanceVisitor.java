public class RoomMaintenanceVisitor implements RoomVisitor{
    @java.lang.Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("performing manintenance of SingleRoom");
    }

    @java.lang.Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("performing manintenance of DoubleRoom");
    }

    @java.lang.Override
    public void visit(DeluxRoom deluxRoomObj) {
        System.out.println("performing manintenance of DeluxRoom");
    }
}
