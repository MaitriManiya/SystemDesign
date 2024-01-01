import java.util.Stack;

//invoker
public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> acCommandHistory= new Stack<>();

    MyRemoteControl(){

    }
    public  void setCommand(ICommand command)
    {
        this.command=command;
    }

    public  void pressButton(){
        command.execute();
        acCommandHistory.push(command);
    }

    public  void undo(){
        if(!acCommandHistory.isEmpty()){
            ICommand lastCommand=acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
