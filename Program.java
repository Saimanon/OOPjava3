import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup1.addStudent(van);
        studentGroup1.addStudent(igor);
        studentGroup2.addStudent(alex);
        studentGroup2.addStudent(alexey);

        Stream stream1 = new Stream();
        stream1.addStudentGroup(studentGroup1);

        Stream stream2 = new Stream();
        stream2.addStudentGroup(studentGroup1);
        stream2.addStudentGroup(studentGroup2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream2);
        streams.add(stream1);

        System.out.println("Before sorting:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudentGroups().size() + " groups.");
        }

        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        System.out.println("After sorting:");
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getStudentGroups().size() + " groups.");
        }
    }
}