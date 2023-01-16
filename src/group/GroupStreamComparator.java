package group;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStreamIterator> {

    @Override
    public int compare(GroupStreamIterator t0, GroupStreamIterator t1) {
        if (t0.getSize() > t1.getSize()) return 1;
        if (t0.getSize() < t1.getSize()) return -1;
        return 0;
    }
}
