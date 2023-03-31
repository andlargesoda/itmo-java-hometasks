package ru.itmo.homeworks.homework6.hikes;

public class Climber {
    private String nameClimber;
    private String addressClimber;
    public Climber(String nameClimber, String addressClimber) {
        setNameClimber(nameClimber);
        setAddressClimber(addressClimber);
    }
    public void setNameClimber(String nameClimber) {
        if (nameClimber == null || nameClimber.length() < 3) {
            throw new IllegalArgumentException("nameclimber не менее 3-х символов");
        }
        this.nameClimber = nameClimber;
    }
    public void setAddressClimber(String addressClimber) {
        if (addressClimber == null || addressClimber.length() < 5) {
            throw new IllegalArgumentException("addressClimber не менее 5-х символов");
        }
        this.addressClimber = addressClimber;
    }
    public String getNameClimber() {
        return nameClimber;
    }
}
