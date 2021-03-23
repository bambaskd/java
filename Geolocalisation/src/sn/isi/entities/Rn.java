package sn.isi.entities;

import java.util.List;

public class Rn {
    private int id;
    List<Zone>zones;
    private double latitude, longitude;

    public Rn() {
    }

    public Rn(int id, List<Zone> zones, double latitude, double longitude) {
        this.id = id;
        this.zones = zones;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
