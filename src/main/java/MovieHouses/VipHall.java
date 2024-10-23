package MovieHouses;

public class VipHall implements Hall{
    public boolean Status;

    public void openHall() {
        Status = true;
    }

    public void closeHall() {
        Status = false;
    }
}
