package readAComplexObjectFromStandardPropertiesFile.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
	private Boolean myBoolean;
	private List<MyNestedObject> myArray = new ArrayList<>();
	public static class MyNestedObject {
		private MyMoreNestedObject myMoreMestedObject;
		private Integer myInteger;
		public static class MyMoreNestedObject {
			private String myString;

			public String getMyString() {
				return myString;
			}

			public void setMyString(String myString) {
				this.myString = myString;
			}
		}
		public MyMoreNestedObject getMyMoreMestedObject() {
			return myMoreMestedObject;
		}
		public void setMyMoreMestedObject(MyMoreNestedObject myMoreMestedObject) {
			this.myMoreMestedObject = myMoreMestedObject;
		}
		public Integer getMyInteger() {
			return myInteger;
		}
		public void setMyInteger(Integer myInteger) {
			this.myInteger = myInteger;
		}
	}
	public Boolean getMyBoolean() {
		return myBoolean;
	}
	public void setMyBoolean(Boolean myBoolean) {
		this.myBoolean = myBoolean;
	}
	public List<MyNestedObject> getMyArray() {
		return myArray;
	}
	public void setMyArray(List<MyNestedObject> myArray) {
		this.myArray = myArray;
	}
}