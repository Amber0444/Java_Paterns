package Movies;

import MovieHouses.Hall;
import MovieHouses.Seat;

import java.sql.Date;
import java.sql.Time;

public class Snapshot {
    private final Movie movie;
    private final Seat[][] seatList;
    private final Hall hall;
    private final Time time;
    private final Date date;

    public Snapshot(Movie movie, Seat[][] seatList, Hall hall, Time time, Date date) {
        this.movie = movie;
        this.seatList = seatList;
        this.hall = hall;
        this.time = time;
        this.date = date;
    }

    public Snapshot restore() {
        return new Snapshot(movie, seatList.clone(), hall, time, date);
    }
}
