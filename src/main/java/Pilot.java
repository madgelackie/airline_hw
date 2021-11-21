public class Pilot extends Staff{

    private String licenceNumber;

    public Pilot(String name, Ranking rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public Boolean readyToFly() {
        if (getLicenceNumber() != null) {
            return true;
        } else return false;
    }
}
