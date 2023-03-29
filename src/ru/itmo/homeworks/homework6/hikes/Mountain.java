package ru.itmo.homeworks.homework6.hikes;

public class Mountain {
    private String nameMountain;
    private String countryMountain;
    private int heightMountain;
    public Mountain(String nameMountain, String countryMountain, int heightMountain) {
        setNameMountain(nameMountain);
        setCountryMountain(countryMountain);
        setHeightMountain(heightMountain);
    }
    public void setNameMountain(String NameMountain) {
        if (NameMountain == null || NameMountain.length() < 4) {
            throw new IllegalArgumentException("nameclimber не менее 4-х символов");
        }
        this.nameMountain = NameMountain;
    }
    public void setCountryMountain(String countryMountain) {
        if (countryMountain == null || countryMountain.length() < 4) {
            throw new IllegalArgumentException("addressClimber не менее 4-х символов");
        }
        this.countryMountain = countryMountain;
    }
    public void setHeightMountain(int heightMountain) {
        if (heightMountain < 5) {
            throw new IllegalArgumentException("addressClimber не менее 100 метров");
        }
        this.countryMountain = countryMountain;
    }
}
