package group;

import student_group.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator {
    private GroupStream groups;
    private Iterator<StudentGroup> group;
    private int size;

    public GroupStreamIterator(GroupStream groups) {
        this.groups = groups;
        this.group = groups.getMyStudents().iterator();
        while (group.hasNext()){
            this.size++;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean hasNext() {
        return this.group.hasNext();
    }

    @Override
    public Object next() {
        return group.next();
    }
}
