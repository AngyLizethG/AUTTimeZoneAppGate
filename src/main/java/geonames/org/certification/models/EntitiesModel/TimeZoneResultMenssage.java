package geonames.org.certification.models.EntitiesModel;

import geonames.org.certification.models.ModelTimeZone;

import java.util.List;

import static geonames.org.certification.enums.SetDataTimeZoneResultMenssage.MESSAGE;
import static geonames.org.certification.enums.SetDataTimeZoneResultMenssage.VALUE;

public class TimeZoneResultMenssage {
    private static ModelTimeZone timeZone;
    private TimeZoneResultMenssage(){}

    public static ModelTimeZone getTimeZoneResultMenssage(){
        return  timeZone;
    }

       public static void setTimeZoneResultMenssage(List<String> dataSetTimeZone){
        ModelTimeZone TimeZoneResultMenssageWhit=new  ModelTimeZone();
        TimeZoneResultMenssageWhit.setMessage(dataSetTimeZone.get(MESSAGE.getPosicion()));
        TimeZoneResultMenssageWhit.setValue(Integer.valueOf(dataSetTimeZone.get(VALUE.getPosicion())));
        TimeZoneResultMenssage.timeZone=TimeZoneResultMenssageWhit;
    }
}

