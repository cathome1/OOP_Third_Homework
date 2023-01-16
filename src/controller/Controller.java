package controller;

import group.GroupStream;
import group.GroupStreamIterator;
import service.GroupStreamServiceImpl;

import java.util.List;

public class Controller {
    private GroupStreamServiceImpl groupStreamService;
    public void groupStreamSort(List<GroupStreamIterator> gr){
        groupStreamService.GroupStreamSort(gr);
    }
}
