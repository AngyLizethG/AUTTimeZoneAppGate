package geonames.org.certification.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/geonames.org.certification/features/service_TimeZone.feature"},
        glue = {"geonames.org.certification.stepsdefinitions"},
        		snippets = SnippetType.CAMELCASE)

public class serviceTimeZoneRuner {

}


