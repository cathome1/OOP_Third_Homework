package group;
import student_group.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;

    public GroupStream(List<StudentGroup> groups) {
        this.groups = groups;

    }

    public List<StudentGroup> getMyStudents() {
        return groups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
