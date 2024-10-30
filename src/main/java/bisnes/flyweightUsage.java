package bisnes;

import MovieHouses.MovieHouse;
import Movies.Movie;
import Movies.Screening;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;

public class flyweightUsage {
    public void booking() {
        MovieHouse coolMovieHouse = new MovieHouse();
        Movie movie = new Movie("Inglourious Basterds", Duration.parse("PT2H33M"));

        coolMovieHouse.addHall(20, 10);

        Screening screening = new Screening(movie,
                coolMovieHouse.getHall(0),
                Time.valueOf("10:15:00"),
                Date.valueOf("15:11:2024"));

        screening.booking(10, 10);
    }
}
