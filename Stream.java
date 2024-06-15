import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;

    public Stream() {
        this.studentGroups = new ArrayList<>();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
