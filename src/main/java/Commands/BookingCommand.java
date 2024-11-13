package Commands;

import MovieHouses.Seat;
import Movies.Screening;

import java.util.Arrays;

public class BookingCommand implements Command {
    private final Screening screening;
    private Seat[][] seatListBackUp;

    public BookingCommand(Screening screening) {
        this.screening = screening;
    }

    @Override
    public void execute(int seat, int row) {
        seatListBackUp = Arrays.copyOf(screening.getSeatList(), screening.getHall().getRow());
        screening.booking(seat, row);
    }

    public Screening getScreening() {
        return screening;
    }
}
