package geonames.org.certification.enums;

public enum SetDataTimeZone {
    LAT (0),
    LNG (1),
    USERNAME(2);
    private final int orden;

    SetDataTimeZone(int orden){
        this.orden=orden;
    }
    public int getPosicion(){ return this.orden; }

}
