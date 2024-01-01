package Problem;

public class Main {
    public static void main(String[] args) {
       Student obj= new Student(20,70,"maitri");

       //creating clone of obj
        Student cloneObj=new Student();
        cloneObj.name=obj.name;
        cloneObj.age=obj.age;
        cloneObj.rollNumber=obj.rollNumber;
        //the problem here is if the few properties are private  then we cannot access it. and if there are 100 of peropertirs then we have to copy each
        //the cloning is not the responsibility of the client. it should the responsibility of class it self
    }
}