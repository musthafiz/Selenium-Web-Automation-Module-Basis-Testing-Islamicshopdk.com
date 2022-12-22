 # Content

- [Site URL](https://github.com/musthafiz/Selenium-Web-Automation-Module-Basis-Testing-Islamicshopdk.com#site-url-httpswwwislamicshopdkcom)  
- [Project Video Record](https://github.com/musthafiz/Selenium-Web-Automation-Module-Basis-Testing-Islamicshopdk.com#project-video-record)  
- [Work Step Description](https://github.com/musthafiz/Selenium-Web-Automation-Module-Basis-Testing-Islamicshopdk.com#work-step-description)  
- [Setup for Running Web Automation test-cases Using Selenium, Java and TestNG on Your Windows Device](https://github.com/musthafiz/Selenium-Web-Automation-Module-Basis-Testing-Islamicshopdk.com#setup-for-running-web-automation-test-cases-using-selenium-java-and-testng-on-your-windows-device)  
	- JAVA

  
     
## Site URL https://www.islamicshopdk.com/
### Project Video Record
https://user-images.githubusercontent.com/92669932/209064173-1c6abc0d-c3de-4b43-b1c5-bd107e4b37a9.mp4    
### Work Step Description   
1. Visit This Site   
2. Scroll Down Upto Slider    
3. Select Book from The Slider   
4. View Any Book   
5. Click Add To Cart  
6. Click Checkout   
7. Provide All Information on View Cart page  
8. Place Order  


### Setup for Running Web Automation test-cases Using Selenium, Java and TestNG on Your Windows Device
<details>
  <summary> JAVA</summary>
  
  ### Java JDK Download, install, set JAVA_HOME and path in environment’s system variable.  

- [ ]  Download and install Java JDK any version you want from java 8 or above    
   https://www.oracle.com/java/technologies/downloads/     

- [ ]  Open Environment Variables and click on the new System variable → set     
  Variable name: JAVA_HOME   
  Variable value: Your Java SDK Location   
  ![image](https://user-images.githubusercontent.com/92669932/209069219-6db58804-46a7-405f-9627-6b2717386ca6.png)   

- [ ]  Select Path system variables then click on Edit → click on new and write   
  ``` 
  %JAVA_HOME%\bin    
  ``` 
  ![55](https://user-images.githubusercontent.com/92669932/209087100-dc37b232-3568-41bb-ba4b-9159a0ad9f0b.jpg)   
  ![88](https://user-images.githubusercontent.com/92669932/209086622-81226fe9-4efa-43c6-b73a-bd9277347646.jpg)    
- [ ]  Test successful Java setup → Open CMD and write     
  ``` 
  java -version  
  ``` 

</details>

<details>
  <summary>Maven</summary>
  
  ### Maven zip file Download, extract set  MAVEN_HOME and path in environment’s system variable.   
  - [ ]  Download and extract the Maven Binary zip file inside your Java folder(optional) → to keep everything organized    
    https://maven.apache.org/download.cgi   

    ```diff
    ! Keep apach-maven Folder in => C:\Program Files\Java
    ```
   
    ![image](https://user-images.githubusercontent.com/92669932/209069763-b2952b3c-3af1-4d64-9874-11846d8d01c0.png)     
 - [ ]  Open Environment Variables and click new System variable → set    
   Variable name: MAVEN_HOME    
   Variable value: Your Maven directory     
   ![image](https://user-images.githubusercontent.com/92669932/209069897-99f65bc9-e0ff-46d3-854b-2cd8541e8751.png)     
   - [ ]  Select Path system variables then click on Edit → click new and write  
   ```   
   %MAVEN_HOME%\bin  
   ```    
- [ ]  Test successful Maven setup → Open CMD and write    
   ```    
   mvn -version  
   ```   
</details>   

<details>
  <summary>Eclipse</summary>
  
  ### Eclipse or any other IDE download and install.      
  - [ ]  Download and install Eclipse IDE     
    https://www.eclipse.org/downloads/        
  - [ ]  TestNG - Install TestNG Plug-in on your eclipse IDE          
    Help → Eclipse Marketplace     
    ![image](https://user-images.githubusercontent.com/92669932/209094958-e36414ae-da55-4b11-8973-f27b9392c8ed.png)    
    Now Search for TestNG and Click on Install → It will ask for your permission → So give the permission by clicking       
    allow/yes/agree and so on     
    ![image](https://user-images.githubusercontent.com/92669932/209095204-15cfc161-20e9-4092-a34c-c5635c03343d.png)
  - [ ]  (Optional) Add multiple Java JDK in your Eclipse {if you want}       
    Install your Java JDK version in any location. [for an organized way keep it inside java folder]    
    ![image](https://user-images.githubusercontent.com/92669932/209095508-e996bf13-a3fe-4710-b20a-11bd41e691fa.png)     
    Open Eclipse → Window → Preferences → Java → Installed JREs → Add → Standard VM → Next → JRE home - Directory → select  
    your new JDK home Folder → Finish → Apply    
    ![image](https://user-images.githubusercontent.com/92669932/209095588-8bfa1870-4bed-4f2f-9b8b-201be62c1512.png)    
  - [ ]  Bonus tips for fewer keystrokes when you are waiting for program code    
    ![image](https://user-images.githubusercontent.com/92669932/209095725-b5325b6e-9c95-4a51-9f80-719d9c89a5e3.png)      
</details>   




<details>
  <summary>Eclipse Project</summary>
  
  ### Eclipse Project → Create | pom.xml | Edit Script |  run a script. 
  1. Create a maven project     
  It is a simple 5 steps process - it may take a maximum of 1 min to complete
     - Step 1: Click on the new Project option   
       ![image](https://user-images.githubusercontent.com/92669932/209099370-1229680c-17a2-4b7c-999e-64ddc292a4e8.png)    
     - Step 2: Select project type as a Maven Project and click next             
       ![image](https://user-images.githubusercontent.com/92669932/209099473-d2490445-8868-40b9-9fdd-432da976d30a.png)   
     - Step 3: Select your Project local repository - where you wanna save it     
       ![image](https://user-images.githubusercontent.com/92669932/209099604-4e0d6bff-d561-46c5-9266-515ad3e6911d.png)     
     - Step 4: Select Maven Archetype as a quickstart version 1.1 and click next      
       ![image](https://user-images.githubusercontent.com/92669932/209099710-c8b8a5b6-5d6f-4b13-b947-945117ea2f57.png)    
     - Step 5: Give your new Project a Name click finish —-Done!     
       ![image](https://user-images.githubusercontent.com/92669932/209099808-fd43374b-4e02-4db0-9ede-fa2b47918806.png)    
       
       
   2. Edit pom.xml     
   ```xml
   <project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>arfoysal.com</groupId>
	<artifactId>webautomation</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>webautomation</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.5</version>
			<!--<scope>test</scope> -->
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.1.1</version>
		</dependency>
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.0.3</version>
		</dependency>
	</dependencies>
</project>
```
      
   3. Edit test script     
   ```java   
   package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest {
 // TestNG annotation to run our script through TestNG
	@Test
	public void muFirstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();

		// go to google web page
		driver.get("https://www.google.com");
		// Maximize the browser window
		driver.manage().window().maximize();

		// wait for 5 seconds
		Thread.sleep(5000);

		// close the browser all active window
		driver.quit();
	}

}
```  
      
   4. Run test script       
   Simply Run By clicking Ran as “TestNG Test”   
  
</details> 






