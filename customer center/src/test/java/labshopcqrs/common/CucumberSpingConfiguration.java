package labshopcqrs.common;

import io.cucumber.spring.CucumberContextConfiguration;
import labshopcqrs.CustomerCenterApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerCenterApplication.class })
public class CucumberSpingConfiguration {}
