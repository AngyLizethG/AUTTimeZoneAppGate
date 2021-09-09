package geonames.org.certification.questions;


import geonames.org.certification.models.ModelTimeZoneDataResult;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static geonames.org.certification.utilities.Constant.JSON_LNG;
import static geonames.org.certification.utilities.Constant.JSON_CONTRYCODE;
import static geonames.org.certification.utilities.Constant.JSON_GMTOFFSET;
import static geonames.org.certification.utilities.Constant.JSON_RAWOFFSET;
import static geonames.org.certification.utilities.Constant.JSON_TIMEZONEID;
import static geonames.org.certification.utilities.Constant.JSON_DSTOFFSET;
import static geonames.org.certification.utilities.Constant.JSON_CONTRYNAME;
import static geonames.org.certification.utilities.Constant.JSON_TIME;
import static geonames.org.certification.utilities.Constant.JSON_LAT;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AnswerResponse implements Question<Boolean>{

    private ModelTimeZoneDataResult myResultResponse;
    public AnswerResponse(ModelTimeZoneDataResult myResultResponse){this.myResultResponse=myResultResponse;}

    @Override
    @Subject("check json response has correct service information")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        SerenityRest.lastResponse().then()
                .body(JSON_LNG, is( myResultResponse.getLng()))
                .body(JSON_CONTRYCODE, is (myResultResponse.getCountryCode()))
                .body(JSON_GMTOFFSET, is (myResultResponse.getGmtOffset()))
                .body(JSON_RAWOFFSET, is (myResultResponse.getRawOffset()))
                .body(JSON_TIMEZONEID, is (myResultResponse.getTimezoneId()))
                .body(JSON_DSTOFFSET, is (myResultResponse.getDstOffset()))
                .body(JSON_CONTRYNAME, is (myResultResponse.getCountryName()))
                .body(JSON_TIME, is (notNullValue()))
                .body(JSON_LAT, is (myResultResponse.getLat())
                ).and().assertThat().statusCode(is(equalTo(200)));

        result=true;
        return result;
    }

    public static AnswerResponse withTheData(ModelTimeZoneDataResult myResultResponse){
        return new AnswerResponse(myResultResponse);
    }


}
