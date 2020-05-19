package readAComplexObjectFromStandardPropertiesFile.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import readAComplexObjectFromStandardPropertiesFile.configuration.MyConfigurationBean.MyNestedObject;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Will display the entire content of the src/main/resources/application.properties file");
		System.out.println(myConf.getMyBoolean());
		for(MyNestedObject myNestedObject : myConf.getMyArray()) {
			System.out.println(myNestedObject.getMyMoreMestedObject().getMyString());
			System.out.println(myNestedObject.getMyInteger());
		}
	}
}