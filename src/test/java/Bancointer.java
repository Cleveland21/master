import static org.junit.Assert.*;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Bancointer {
	
	


	WebDriver driver;
	
	
	@Before
	public void setUp() throws Exception {
		// codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		// comando para chamar o driver dentro do before
	
		driver = new ChromeDriver();
	
	//comando para indicar URL
	driver.get("https://www.4devs.com.br/");
	
	
	    //comando para maximizar a tela
		driver.manage().window().maximize();
		
		//comando para interagir com o elemento
	
		
		Thread.sleep(3000);
		
	//gerador de pessoas
		
	    driver.findElement(By.xpath("//*[@id=\"top-nav\"]/li[23]/a")).click();
	   
	    Thread.sleep(3000);
	
	    //ok
	    // gerar pessoas 
	    
	    driver.findElement(By.cssSelector("#bt_gerar_pessoa")).click();
	    
	    Thread.sleep(3000);
	
	  String nome = driver.findElement(By.xpath("//*[@id=\"nome\"]")).getText();
	  String celular = driver.findElement(By.xpath("//*[@id=\"celular\"]")).getText();
	  String email = driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
	  String Cpf = driver.findElement(By.xpath("//*[@id=\"cpf\"]")).getText();
	  String datadenasc = driver.findElement(By.xpath("//*[@id=\"data_nasc\"]")).getText();	    
	    driver.quit();
	    
	    Thread.sleep(3000);
	    
	    driver = new ChromeDriver();
	  //comando para indicar URL
		driver.get("https://www.bancointer.com.br/");
		
		 //comando para maximizar a tela
		driver.manage().window().maximize();
		
		//comando para interagir com o elemento
		
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.id("nome")).sendKeys(nome);
			driver.findElement(By.id("celular")).sendKeys(celular);
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("cpf")).sendKeys(Cpf);
			driver.findElement(By.id("dataNascimento")).sendKeys(datadenasc);
			
			Thread.sleep(3000);
			
			// botão ok
			driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
			
			Thread.sleep(3000);
			
			// chackbox
		    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		
		    Thread.sleep(3000);
		    
		    //botão continuar
		    
		    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
		
		    Thread.sleep(3000);
		    
	       
		
	    
	    
	    
	    
	}
	
	
		/*driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	
		Thread.sleep(3000);
		 //nome
		driver.findElement (By.id("nome")).sendKeys("Cleveland Moizés de Oliveira Soares");
	    // celular
	    driver.findElement(By.id("celular")).sendKeys("11957793141");
	    //email
	    driver.findElement(By.id("email")).sendKeys ("clevermoises21@gmail.com");
	    //cpf
	    driver.findElement(By.id("cpf")).sendKeys ("22421345820");
	    //data de nascimento
	    driver.findElement(By.id("dataNascimento")).sendKeys ("11101992");
	    
	    // botão "ok"
	    
	    driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
	    
	    Thread.sleep(3000);
	    // chackbox
	    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
	
	    Thread.sleep(3000);
	    
	    //botão continuar
	    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
	
	}*/
	
	
	
	
	
	/*@Before
	public void setUp() throws Exception {
		// codigo para indicar o navegador
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		// comando para chamar o driver dentro do before
	
		
		driver = new ChromeDriver();
	
	//comando para indicar URL
	driver.get("https://www.bancointer.com.br/");
	
	//comando para maximizar a tela
		driver.manage().window().maximize();
		
		//comando para interagir com o elemento

		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	
		Thread.sleep(3000);
		 //nome
		driver.findElement (By.id("nome")).sendKeys("Cleveland Moizés de Oliveira Soares");
	    // celular
	    driver.findElement(By.id("celular")).sendKeys("11957793141");
	    //email
	    driver.findElement(By.id("email")).sendKeys ("clevermoises21@gmail.com");
	    //cpf
	    driver.findElement(By.id("cpf")).sendKeys ("22421345820");
	    //data de nascimento
	    driver.findElement(By.id("dataNascimento")).sendKeys ("11101992");
	    
	    // botão "ok"
	    
	    driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
	    
	    Thread.sleep(3000);
	    // chackbox
	    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
	
	    Thread.sleep(3000);
	    
	    //botão continuar
	    driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
	
	}*/
	
	
	

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
		
		
	}

	@Test
	public void test() throws InterruptedException, IOException {
		
		
		Thread.sleep(3000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
		System.out.println(texto);
		assertEquals(texto, "Prontinho! Recebemos os seus dados.");
		
		
		// Tirar o print
	    
    	File print = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   

    // SALVAR PRINT
    	
    Files.copy(print, new File ("Users/apple/Desketop/printscreen.png"));	
	
    
		
		
		
	}

}


