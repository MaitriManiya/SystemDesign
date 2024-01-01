package Solution;
public class RoboticDog implements IRobot {
    private String type;
    private Sprites body;//small 2d bitmap (graphic element)

    RoboticDog(String type, Sprites body){
        this.type=type;
        this.body=body;
    }

    public String getType(){
        return type;
    }

    public String getBody(){
        return type;
    }

    @java.lang.Override
    public void display(int x, int y) {
        //use the robotic Dog sprites obejct
        //and x and y coordinate to render
    }
}
