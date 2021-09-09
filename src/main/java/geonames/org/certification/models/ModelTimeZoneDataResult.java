package geonames.org.certification.models;

public class ModelTimeZoneDataResult {

    private String Sunrise;
    private int lng;
    private String countryCode;
    private int gmtOffset;
    private int rawOffset;
    private String Sunset;
    private String timezoneId;
    private int dstOffset;
    private String countryName;
    private String time;
    private int lat;

    public String getSunrise() {
        return Sunrise;
    }

    public void setSunrise(String sunrise) {
        Sunrise = sunrise;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(int gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public int getRawOffset() {
        return rawOffset;
    }

    public void setRawOffset(int rawOffset) {
        this.rawOffset = rawOffset;
    }

    public String getSunset() {
        return Sunset;
    }

    public void setSunset(String sunset) {
        Sunset = sunset;
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    public int getDstOffset() {
        return dstOffset;
    }

    public void setDstOffset(int dstOffset) {
        this.dstOffset = dstOffset;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }




}
