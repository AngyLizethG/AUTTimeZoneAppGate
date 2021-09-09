package geonames.org.certification.questions;
import geonames.org.certification.models.ModelTimeZone;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import static geonames.org.certification.utilities.Constant.JSON_VALUE;
import static geonames.org.certification.utilities.Constant.JSON_MESSAGE;
import static org.hamcrest.Matchers.is;

public class AnswerMenssage implements Question<Boolean>{

    private ModelTimeZone myResult;
    public AnswerMenssage(ModelTimeZone myResult){this.myResult=myResult;}

    @Override
    @Subject("check json response has correct service information")
    public Boolean answeredBy(Actor actor) {
        boolean result;
        SerenityRest.lastResponse().then().body(JSON_MESSAGE, is( myResult.getMessage()))
                .body(JSON_VALUE, is (myResult.getValue()));
        result=true;
        return result;
    }


    public static AnswerMenssage withTheData(ModelTimeZone myResult){
        return new AnswerMenssage(myResult);
    }


}
