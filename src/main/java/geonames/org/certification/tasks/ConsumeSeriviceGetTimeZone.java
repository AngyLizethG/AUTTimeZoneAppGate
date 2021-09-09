package geonames.org.certification.tasks;

import geonames.org.certification.models.ModelTimeZone;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static geonames.org.certification.utilities.Constant.URL_BASE;
import static geonames.org.certification.utilities.Constant.URL_TIMEZONE;
import static geonames.org.certification.utilities.Constant.CONTENT_TYPE;
import static geonames.org.certification.utilities.Constant.LNG;
import static geonames.org.certification.utilities.Constant.USERNAME;
import static geonames.org.certification.utilities.Constant.APLICATION_JSON;
import static geonames.org.certification.utilities.Constant.AUTORIZATION;
import static geonames.org.certification.utilities.Constant.COMILLAS;

public class ConsumeSeriviceGetTimeZone implements Task{

    ModelTimeZone dataTimeZone;
    public ConsumeSeriviceGetTimeZone(ModelTimeZone dataTimeZone) {
        this.dataTimeZone=dataTimeZone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(CallAnApi.at(URL_BASE));
        actor.attemptsTo(Get.resource(URL_TIMEZONE+dataTimeZone.getLat()+LNG+dataTimeZone.getLng()+USERNAME+dataTimeZone.getUsername())
                .with(request -> request.header(CONTENT_TYPE,APLICATION_JSON ).header(AUTORIZATION,COMILLAS)
                        .log().all()));

    }
    public static ConsumeSeriviceGetTimeZone withParameters(ModelTimeZone dataTimeZone){
        return Tasks.instrumented(ConsumeSeriviceGetTimeZone.class, dataTimeZone);
    }

}
