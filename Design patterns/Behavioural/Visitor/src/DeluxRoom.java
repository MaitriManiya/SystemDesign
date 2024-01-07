public class DeluxRoom implements  RoomElement{
    public int roomPrice=0;
    @java.lang.Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
