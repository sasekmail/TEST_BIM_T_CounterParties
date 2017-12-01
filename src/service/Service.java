package service;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import static utils.Methods.*;

import java.util.Map;

import main.Main;
import pageObjects.CounterpartiesPage;
import pageObjects.CreateCounterpartyPage;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.OperationsPage;
import utils.Helper;

/**
  
  BIM_v66.2_COMPONENTS
  MAIN_WEB
 
 * */


public class Service extends Main {
	
	
	
	
	@Test
	public void counterpartiesTest(){
		
		 String counterPartyName;
		
		/* Inicjacja PageObjects */
		
		LoginPage loginPage = new LoginPage(driver);
		MainPage mainPage = new MainPage(driver);
		OperationsPage operationsPage = new OperationsPage(driver);
		CreateCounterpartyPage createCounterPartyPage = new CreateCounterpartyPage(driver);
		CounterpartiesPage counterpartiesPage = new CounterpartiesPage(driver);
	   
		
	
			
		/* Koniec inicjacji PageObjects */
		loggerE.log(LogStatus.INFO, "LOOWANIE LOG HTML");	
		
	
		
		
	}
	
	
	
}
