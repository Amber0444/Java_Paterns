package MovieHouses;

import java.util.List;

public class MyMovieHouse extends MovieHouse{
    List<Hall> list;

    public void addHall(Hall hall) {
        list.add(hall);
    }

    public void removeHall(Hall hall) {
        list.remove(hall);
    }

    public void openHall() {
        for(Hall hall: list) {
            hall.openHall();
        }
    }

    public void closeHall() {
        for(Hall hall: list) {
            hall.closeHall();
        }
    }
}
