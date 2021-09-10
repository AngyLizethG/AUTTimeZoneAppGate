package geonames.org.certification.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import geonames.org.certification.questions.AnswerMenssage;
import geonames.org.certification.questions.AnswerResponse;
import geonames.org.certification.tasks.ConsumeSeriviceGetTimeZone;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static geonames.org.certification.models.EntitiesModel.TimeZone.getTimeZone;
import static geonames.org.certification.models.EntitiesModel.TimeZone.setTimeZone;
import static geonames.org.certification.models.EntitiesModel.TimeZoneResultMenssage.setTimeZoneResultMenssage;
import static geonames.org.certification.models.EntitiesModel.TimeZoneResultMenssage.getTimeZoneResultMenssage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static geonames.org.certification.models.EntitiesModel.TimeZoneDatasetResult.setTimeZoneResultData;
import static geonames.org.certification.models.EntitiesModel.TimeZoneDatasetResult.getTimeZoneResultData;

public class serviceTimeTimeZoneSteps {
	
	@Before
	public void configurarElEscenario() {
		OnStage.setTheStage(new OnlineCast());
		OnStage.theActorCalled("analyst");
	}

	@Given("the time zone service is consumed with the data")
	public void theTimeZoneServiceIsConsumedWithTheData(DataTable dataSetTest) {
		setTimeZone(dataSetTest.asList());
		theActorInTheSpotlight().attemptsTo(ConsumeSeriviceGetTimeZone.withParameters(getTimeZone()));
	}

	@Then("the service will answer us")
	public void theServiceWillAnswerUs(DataTable dataSetTest) {
		setTimeZoneResultMenssage(dataSetTest.asList());
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerMenssage.withTheData(getTimeZoneResultMenssage())));
	}

	@Then("the service will respond to the data")
	public void theServiceWillRespondToTheData(DataTable dataSetTest) {
		setTimeZoneResultData(dataSetTest.asList());
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerResponse.withTheData(getTimeZoneResultData())));
	}

}
