package Actistep;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\Acti.feature",glue={"Actistep"},plugin= {"pretty","html:target\\ActiPom.html"})
public class Runner {
	

}
