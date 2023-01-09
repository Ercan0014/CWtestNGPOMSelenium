package clarusway.tests;


import clarusway.utilites.ConfigReader;
import clarusway.utilites.Driver;

import org.testng.annotations.Test;

public class Day01_C02_ConfigReader {

@Test
    public void readConfig() {
    Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    Driver.closeDriver();

}

}
