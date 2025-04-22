package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_011Page;

public class tc_011Steps {

    tc_011Page page = new tc_011Page();

    @Given("el usuario tiene un archivo Excel exportado desde la aplicación")
    public void el_usuario_tiene_un_archivo_Excel_exportado() {
        // Implementar lógica para obtener o generar el archivo Excel
        page.loadExcelFile("ruta/del/archivo.xlsx");
    }

    @When("el usuario inspecciona el encabezado de la columna en el Excel")
    public void el_usuario_inspecciona_el_encabezado_de_la_columna_en_el_Excel() {
        // Implementar lógica para inspeccionar el encabezado
        page.inspectExcelHeader();
    }

    @Then("el encabezado debe mostrarse como 'Descripción Status Pago' en lugar de 'Status de Pago'")
    public void el_encabezado_debe_mostrarse_correctamente() {
        String expectedHeader = "Descripción Status Pago";
        String actualHeader = page.getExcelHeader();
        Assert.assertEquals(expectedHeader, actualHeader);
    }
}