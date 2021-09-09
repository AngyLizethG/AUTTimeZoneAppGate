package geonames.org.certification.enums;

public enum SetDataTimeZoneResult {
    LNG(0),
    COUNTRYCODE(1),
    GMTOFFSET(2),
    RAWOFFSET(3),
    TIMEZONEID(4),
    DSTOFFSET(5),
    COUNTRYNAME(6),
    TIME(7),
    LAT(8);
    private final int orden;
    SetDataTimeZoneResult(int orden){
        this.orden=orden;
    }
    public int getPosicion(){ return this.orden; }

}
