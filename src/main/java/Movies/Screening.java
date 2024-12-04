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
    private Status status;
    private final FreeSeat freeSeat = new FreeSeat();


    public Screening(Movie movie, Hall hall, Time time, Date date, Status status) {
        this.movie = movie;
        this.hall = hall;
        this.time = time;
        this.date = date;
        this.seatList = new Seat[hall.getRow()][hall.getSeat()];
        this.status = status;


        for(int i = 0; i < hall.getRow(); i++) {
            for(int j = 0; j < hall.getSeat(); j++) {
                seatList[i][j] = freeSeat;
            }
        }
    }

    //Паттерн State
    //Бронирование зависит от status
    public void booking(int row, int seat) {
        status.booking(row, seat, this);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(movie, seatList.clone(), hall, time, date);
    }

    public void changeStatus() {
        if (status instanceof ClosesForBooking) {
            setStatus(new OpenForBooking());
        } else {
            setStatus(new ClosesForBooking());
        }
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
