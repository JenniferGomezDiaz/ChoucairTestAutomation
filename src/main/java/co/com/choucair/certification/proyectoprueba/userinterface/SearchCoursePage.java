package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


/**
 * @author: Jennifer Gomez Diaz
 * @version: 28/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the("Select choucair university")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Find the course")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("Click to find the cursor")
            .located(By.id("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("Click to search the course")
            .located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));

    public static final Target NAME_COURSE = Target.the("Extract course name")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}
