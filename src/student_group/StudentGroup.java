package student_group;
import java.util.Iterator;
import java.util.List;
import student.Student;
import teacher.Teacher;

public class StudentGroup{
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;


    public StudentGroup(List<Student> studentList, Teacher teacher, int groupNumber) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
