package student_group;
import student.Student;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator  implements Iterator {
    private StudentGroup studentGroup;
    private List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudentList();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean hasNext() {
        return cursor < this.students.size();
    }

    @Override
    public Object next() {
        return this.students.get(cursor++);
    }
}
