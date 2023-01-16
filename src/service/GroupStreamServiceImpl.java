package service;
import group.GroupStreamComparator;
import group.GroupStreamIterator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl {
    private List<GroupStreamIterator> groups;

    public GroupStreamServiceImpl(List<GroupStreamIterator> group) {
        this.groups = group;
    }
    public void GroupStreamSort(List<GroupStreamIterator> gr){
        Collections.sort(gr, new GroupStreamComparator());
    }
}
