How to read a complex object from the standard application.properties with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readAComplexObjectFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myBoolean=false<br/>
myArray[0].myMoreMestedObject.myString=qwerty1<br/>
myArray[0].myInteger=123<br/>
myArray[1].myMoreMestedObject.myString=qwerty2<br/>
myArray[1].myInteger=456<br/>
---MyConfigurationBean.java<br/>
private Boolean myBoolean;<br/>
&nbsp;&nbsp;private List&lt;MyNestedObject&gt; myArray = new ArrayList&lt;&gt;();<br/>
&nbsp;&nbsp;public static class MyNestedObject {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;private MyMoreNestedObject myMoreMestedObject;<br/>
&nbsp;&nbsp;&nbsp;&nbsp;private Integer myInteger;<br/>
&nbsp;&nbsp;&nbsp;&nbsp;public static class MyMoreNestedObject {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;private String myString;<br/>
+all getter and setter for each 5 fields<br/>
---The class who displays the value of the 'myString' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyBoolean());<br/>
for(MyNestedObject myNestedObject : myConf.getMyArray()) {<br/>
&nbsp;&nbsp;System.out.println(myNestedObject.getMyMoreMestedObject().getMyString());<br/>
&nbsp;&nbsp;System.out.println(myNestedObject.getMyInteger());<br/>
<br/>
<br/>
The application will read the content of the application.properties configuration file then display it in the terminal.<br/>


