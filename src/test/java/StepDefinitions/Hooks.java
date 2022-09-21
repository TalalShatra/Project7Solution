package StepDefinitions;

import Utilities.Driver;
import org.junit.*;

public class Hooks {
    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }

    @After
    public void after()
    {
            Driver.quitDriver();
    }
}
