import java.util.List;
import java.util.ArrayList;
public class MBAStudentBuilder extends StudentBuilder{
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Business Studies");
        subs.add("Operations Management");
        this.subjects = subs;
        return this;
    }

}
