package geonames.org.certification.models.EntitiesModel;

import geonames.org.certification.models.ModelTimeZone;
import java.util.List;
import static geonames.org.certification.enums.SetDataTimeZone.LNG;
import static geonames.org.certification.enums.SetDataTimeZone.LAT;
import static geonames.org.certification.enums.SetDataTimeZone.USERNAME;

public class TimeZone {
    private static ModelTimeZone timeZone;
    private TimeZone(){}

    public static ModelTimeZone getTimeZone(){
        return  timeZone;
    }

    public static void setTimeZone(List<String> dataSetTimeZone){
        ModelTimeZone TimeZoneWhit=new  ModelTimeZone();
        TimeZoneWhit.setLat(Integer.valueOf(dataSetTimeZone.get(LAT.getPosicion())));
        TimeZoneWhit.setLng(Integer.valueOf(dataSetTimeZone.get(LNG.getPosicion())));
        TimeZoneWhit.setUsername(dataSetTimeZone.get(USERNAME.getPosicion()));
        TimeZone.timeZone=TimeZoneWhit;
    }
}
