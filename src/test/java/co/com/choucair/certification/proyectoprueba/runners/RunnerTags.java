package co.com.choucair.certification.proyectoprueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/academy_choucair_v2.feature",
        tags = "@stories",
        glue ="co.com.choucair.certification.proyectoprueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

/**
 * @author: Jennifer Gomez Diaz
 * @version: 28/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class RunnerTags {

}