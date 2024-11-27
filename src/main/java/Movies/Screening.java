package Movies;

import MovieHouses.BusySeat;
import MovieHouses.FreeSeat;
import MovieHouses.Hall;
import MovieHouses.Seat;

import java.sql.Date;
import java.sql.Time;
import org.apache.commons.lang3.SerializationUtils;


public class Screening {
    private final Movie movie;
    private final Seat[][] seatList;
    private final Hall hall;
    private final Time time;
    private final Date date;
    private final BusySeat busySeat = new BusySeat();
    private final FreeSeat freeSeat = new FreeSeat();

    public Screening(Movie movie, Hall hall, Time time, Date date) {
        this.movie = movie;
        this.hall = hall;
        this.time = time;
        this.date = date;
        this.seatList = new Seat[hall.getRow()][hall.getSeat()];

        for(int i = 0; i < hall.getRow(); i++) {
            for(int j = 0; j < hall.getSeat(); j++) {
                seatList[i][j] = freeSeat;
            }
        }
    }

    //Паттерн flyWeight
    public void booking(int row, int seat) {
        if (row < 0 || row > hall.getRow() || seat < 0 || seat >hall.getSeat())
            return;
        seatList[row][seat] = busySeat;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(movie, seatList.clone(), hall, time, date);
    }

    public Movie getMovie() {
        return movie;
    }

    public Seat[][] getSeatList() {
        return seatList;
    }

    public Hall getHall() {
        return hall;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }
}
