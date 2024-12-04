package Movies;

public class ClosesForBooking implements Status{

    @Override
    public void booking(int row, int seat, Screening screening) {
        throw new IllegalStateException("Бронирование закрыто");
    }
}
