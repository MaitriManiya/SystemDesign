package Problem;

public class Robot {
    //extrinsic data-changes for every object
    int coordinateX;
    int coordinateY;

    //intrinsic data- same for all obj
    String type;
    String body;

    Robot(int x,int y,String type, String body){
        this.coordinateX=x;
        this.coordinateY=y;
        this.type=type;
        this.body=body;
    }
}
