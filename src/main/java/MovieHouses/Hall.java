package MovieHouses;

import Movies.Screening;

import java.lang.reflect.Array;

public class Hall {
    private Seat[][] seatList;
    private Screening[] screeningList;
    final private int seat;
    private final int row;

    public Hall(int seat, int row) {
        this.seat = seat;
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public int getRow() {
        return row;
    }

    public Seat[][] getSeatList() {
        return seatList;
    }

    public void setSeatList(Seat[][] seatList) {
        this.seatList = seatList;
    }
}
