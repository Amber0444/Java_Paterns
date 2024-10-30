package MovieHouses;

import java.util.List;

public class MovieHouse {
    List<Hall> list;

    public void addHall(int seat, int row) {
        Hall hall = new Hall(seat, row);
        list.add(hall);
    }

    public Hall getHall(int numberOfHall) {
        return list.get(numberOfHall);
    }
}