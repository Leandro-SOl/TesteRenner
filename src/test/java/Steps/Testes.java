package Steps;

import org.openqa.selenium.By;

import Pages.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testes {

	Metodos metodo = new Metodos();

	// Dados de login
	// login: leandrooliveira.lo52@gmail.com
	// senha: testerenner12345

	@Given("que eu esteja no {string} para realizar login")
	public void que_eu_esteja_no_para_realizar_login(String appUrl) throws InterruptedException {
		metodo.abrirNavegador(appUrl);
		metodo.clicar(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
		Thread.sleep(10000);
		metodo.escrever("leandrooliveira.lo52@gmail.com", By.xpath("//*[@id=\"email\"]"));
		metodo.escrever("testerenner12345", By.name("passwd"));
		metodo.clicar(By.cssSelector("#SubmitLogin > span"));
	}

	@When("selecionar as pecas de roupa para compra")
	public void selecionar_as_pecas_de_roupa_para_compra() throws InterruptedException {
		// primeiro pedido
		metodo.escrever("Printed Chiffon Dress", By.name("search_query"));
		Thread.sleep(2000);
		metodo.submit(By.name("search_query"));
		Thread.sleep(5000);
		metodo.clicar(By.id("color_37"));
		Thread.sleep(5000);
		metodo.clicar(By.name("group_1"));
		Thread.sleep(2000);
		metodo.clicar(By.cssSelector("#uniform-group_1 > span"));
		metodo.clicar(By.cssSelector("#add_to_cart > button > span"));
		metodo.clicar(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span"));
		// segundo pedido
		metodo.escrever("Faded Short Sleeve T-shirts", By.name("search_query"));
		Thread.sleep(2000);
		metodo.submit(By.name("search_query"));
		metodo.clicar(By.id("color_2"));
		metodo.clicar(By.cssSelector("#add_to_cart > button > span"));
		metodo.clicar(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span"));
		// terceiro pedido
		metodo.escrever("Blouse ", By.name("search_query"));
		Thread.sleep(2000);
		metodo.submit(By.name("search_query"));
		metodo.clicar(By.cssSelector("#center_column > ul > li > div > div.left-block > div > a.product_img_link > img"));
		metodo.clicar(By.cssSelector("#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up > span"));
		metodo.clicar(By.cssSelector("#add_to_cart > button > span"));
		metodo.clicar(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span"));
		// quarto pedido
		metodo.escrever("Printed Dress", By.name("search_query"));
		Thread.sleep(2000);
		metodo.submit(By.name("search_query"));
		metodo.clicar(By.cssSelector("#center_column > ul > li:nth-child(2) > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span"));
	}

	@Then("compra e realizada com sucesso")
	public void compra_e_realizada_com_sucesso() {

	}

}
