package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver = new ChromeDriver();
    tc_001Page loginPage = new tc_001Page(driver);

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver.get("https://example.com/login");
    }

    @When("el usuario ingresa el nombre de usuario {string} y la contraseña {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario_y_la_contraseña(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("el usuario presiona el botón de inicio de sesión")
    public void el_usuario_presiona_el_boton_de_inicio_de_sesion() {
        loginPage.clickLoginButton();
    }

    @Then("se muestra la página principal")
    public void se_muestra_la_página_principal() {
        // Usar una afirmación para validar que la página principal se muestra
    }
}