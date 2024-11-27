package bisnes;

import Commands.BookingCommand;
import Commands.Command;
import Commands.CommandHistory;
import MovieHouses.MovieHouse;
import Movies.Movie;
import Movies.Screening;
import repositories.Repository;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;

public class Controller {
    public void booking() {
        MovieHouse coolMovieHouse = new MovieHouse();
        Movie movie = new Movie("Inglourious Basterds", Duration.parse("PT2H33M"));

        coolMovieHouse.addHall(20, 10);

        Screening screening = new Screening(movie,
                coolMovieHouse.getHall(0),
                Time.valueOf("10:15:00"),
                Date.valueOf("15:11:2024"));

        Command command = new BookingCommand(screening);
        CommandHistory commandHistory = new CommandHistory();

        //Бронирование происходит через команды
        command.execute(10, 10);
        commandHistory.push(command);

        //паттерн memento
        Repository repository = new Repository();
        repository.add(screening.createSnapshot());
    }
}
