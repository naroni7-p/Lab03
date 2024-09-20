import java.util.List;

public class studentsReader {
    public static void readStudents(List<String> studentsNames)
    {
        if (studentsNames == null || studentsNames.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for(String student:studentsNames)
        System.out.println(student);
    }
}
