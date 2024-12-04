package Movies;

import MovieHouses.BusySeat;
import MovieHouses.FreeSeat;

public class OpenForBooking implements Status{
    private final BusySeat busySeat = new BusySeat();
    private final FreeSeat freeSeat = new FreeSeat();

    @Override
    public void booking(int row, int seat, Screening screening) {
        if (row < 0 || row > screening.getHall().getRow() || seat < 0 || seat > screening.getHall().getSeat())
            screening.getSeatList()[row][seat] = busySeat;
    }
}
