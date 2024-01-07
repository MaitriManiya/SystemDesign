import java.util.*;
public class ConfigurationCareTaker {
    List<ConfigurationMemento> history= new ArrayList<>();

    public  void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public  ConfigurationMemento undo(){
        if(!history.empty()){
            int lastMementoIndex=history.size()-1;
            //get the last memento from the list
            ConfigurationMemento lastMemento= history.get(lastMementoIndex);
            history.remove(lastMementoIndex);
            return  lastMemento;
        }
        return null;
    }
}
