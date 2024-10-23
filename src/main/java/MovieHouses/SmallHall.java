package MovieHouses;

public class SmallHall implements Hall{
    public boolean Status;

    public void openHall() {
        Status = true;
    }

    public void closeHall() {
        Status = false;
    }
}
