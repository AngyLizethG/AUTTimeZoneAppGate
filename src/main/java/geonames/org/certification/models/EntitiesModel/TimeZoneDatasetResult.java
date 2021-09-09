package geonames.org.certification.models.EntitiesModel;

import geonames.org.certification.models.ModelTimeZoneDataResult;
import java.util.List;
import static geonames.org.certification.enums.SetDataTimeZoneResult.LAT;
import static geonames.org.certification.enums.SetDataTimeZoneResult.COUNTRYCODE;
import static geonames.org.certification.enums.SetDataTimeZoneResult.LNG;
import static geonames.org.certification.enums.SetDataTimeZoneResult.GMTOFFSET;
import static geonames.org.certification.enums.SetDataTimeZoneResult.RAWOFFSET;
import static geonames.org.certification.enums.SetDataTimeZoneResult.TIMEZONEID;
import static geonames.org.certification.enums.SetDataTimeZoneResult.DSTOFFSET;
import static geonames.org.certification.enums.SetDataTimeZoneResult.COUNTRYNAME;


import static geonames.org.certification.enums.SetDataTimeZoneResult.TIME;
public class TimeZoneDatasetResult {
    private static ModelTimeZoneDataResult timeZoneDataResult;
    private TimeZoneDatasetResult(){}

    public static ModelTimeZoneDataResult getTimeZoneResultData(){
        return  timeZoneDataResult;
    }

    public static void setTimeZoneResultData(List<String> dataSetTimeZone){
        ModelTimeZoneDataResult TimeZoneWhitResulData=new  ModelTimeZoneDataResult();
        TimeZoneWhitResulData.setLng(Integer.valueOf(dataSetTimeZone.get(LNG.getPosicion())));
        TimeZoneWhitResulData.setCountryCode(dataSetTimeZone.get(COUNTRYCODE.getPosicion()));
        TimeZoneWhitResulData.setGmtOffset(Integer.valueOf(dataSetTimeZone.get(GMTOFFSET.getPosicion())));
        TimeZoneWhitResulData.setRawOffset(Integer.valueOf(dataSetTimeZone.get(RAWOFFSET.getPosicion())));
        TimeZoneWhitResulData.setTimezoneId(dataSetTimeZone.get(TIMEZONEID.getPosicion()));
        TimeZoneWhitResulData.setDstOffset(Integer.valueOf(dataSetTimeZone.get(DSTOFFSET.getPosicion())));
        TimeZoneWhitResulData.setCountryName(dataSetTimeZone.get(COUNTRYNAME.getPosicion()));
        TimeZoneWhitResulData.setTime(dataSetTimeZone.get(TIME.getPosicion()));
        TimeZoneWhitResulData.setLat(Integer.valueOf(dataSetTimeZone.get(LAT.getPosicion())));
        TimeZoneDatasetResult.timeZoneDataResult=TimeZoneWhitResulData;
    }
}
