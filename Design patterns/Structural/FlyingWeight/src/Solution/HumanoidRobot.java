package Solution;

public class HumanoidRobot implements IRobot {
    private String type;
    private Sprites body;//small 2d bitmap (graphic element)

    HumanoidRobot(String type, Sprites body){
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
        //use the humanoid sprites object
        //and x and y coordiantes to render the image
    }
}
