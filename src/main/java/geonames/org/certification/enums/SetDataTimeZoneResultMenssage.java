package geonames.org.certification.enums;

public enum SetDataTimeZoneResultMenssage {
    VALUE (1),
    MESSAGE(0);
    private final int orden;

    SetDataTimeZoneResultMenssage(int orden){
        this.orden=orden;
    }
    public int getPosicion(){ return this.orden; }

}
