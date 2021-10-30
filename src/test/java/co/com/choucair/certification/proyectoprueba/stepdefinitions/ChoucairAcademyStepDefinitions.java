package co.com.choucair.certification.proyectoprueba.stepdefinitions;

import co.com.choucair.certification.proyectoprueba.model.ChoucairAcademyData;
import co.com.choucair.certification.proyectoprueba.questions.Answer;
import co.com.choucair.certification.proyectoprueba.tasks.Login;
import co.com.choucair.certification.proyectoprueba.tasks.OpenUp;
import co.com.choucair.certification.proyectoprueba.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

/**
 * @author: Jennifer Gomez Diaz
 * @version: 28/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn at the academy Choucair$")
    public void thanBrandonWantsToLearnAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancombia(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }


    @Given("^than Rose want to learn automation at the academy Choucair$")
    public void thanRoseWantToLearnAutomationAtTheAcademyChoucair(List<ChoucairAcademyData> choucairAcademyData) throws Exception {
        OnStage.theActorCalled("Rose").wasAbleTo(OpenUp.thePage(), (Login.onThePage(
                choucairAcademyData.get(0).getStrUser(), choucairAcademyData.get(0).getStrPassword())));
    }

    @When("^she search for the course on the Choucair Academy platform$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatform(List<ChoucairAcademyData> choucairAcademyData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(choucairAcademyData.get(0).getStrCourse()));
    }

    @Then("^she finds the course called$")
    public void sheFindsTheCourseCalled(List<ChoucairAcademyData> choucairAcademyData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(choucairAcademyData.get(0).getStrCourse())));
    }

}
