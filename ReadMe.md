Selenium Project
Selenium is an open source java library for automating browser.

Selenium automates browsers. That's it! What you do with that power is entirely up to you.

Selenium Consists of 3 part

Selenium IDE (browser plugin for record playback)
Selenium WebDriver (programmatic access)
Selenium Grid (running distributed test in multiple machines)
Selenium Clients and WebDriver Language Bindings In order to create scripts that interact with browser, you need to make use of language-specific client drivers.

Selenium has support for Java , C# , Ruby , Python and JavaScript...

We will be working with Java, so we need Selenium Java (current version 3.141.59)

Selenium works on all major operating systems like mac , windows and linux.

Selenium support automation of all major browsers by communicating the browser specific driver to automate browser actions. Each browser vendors like chrome , firefox , safari and edge so on have their own specific driver.

For example :

chrome has ChromeDriver ,
firefox has GeckoDriver ,
Microsoft Edge has EdgeDriver
At its minimum, WebDriver talks to a browser through a driver. Communication is two-way:

WebDriver passes commands to the browser through the driver, and receives information back via the same route.

We will be using it to automate browser
Additionally, we will use testing framework like Junit to make assertions
Apache Maven
Apache Maven is a tool for Java Project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.

It has a lot of features that developer heavily rely on.

We will focus on one of few core feature that relevant to us to get start easily with selenium.

Simple project setup that follows best practices
├── pom.xml
└── src
    ├── main
    │ ├── java
    │ └── resources
    └── test
        ├── java
        └── resources (optionally)
Dependency management: Maven encourages the use of a central repository of JARs and other dependencies. Maven comes with a mechanism that your project's clients can use to download any JARs required for building your project from a central JAR repository.
In Maven, dependency is another archive—JAR, ZIP, and so on—which your current project needs in order to compile, build, test, and/or to run. The dependencies are gathered in the pom. ... If they are not present there, then Maven will download them from a remote repository and store them in the local repository

In order to work with selenium we will need selenium-java dependency. In order to easy manage browser specific drivers we need WebDriverManager dependency. These dependencies can be added into pom.xml file in the project we are about to create so it can download it from maven central repository.

Setting up Maven Project in IntelliJ
IntelliJ already come with maven bundled so no separate download or set up needed at this moment for easy start.

From top menu , File--> New --> Project
Select Maven from left tab and select Java 8 Select Maven
Provide project name and select default project location
Provide group id, usually reverse domain name
in this case com.cybertek and it will also be base package we create later.
Provide artifact id , same as project name and keep the version tab as is Project Detail
Click Finish to create project , you will be present with pom.xml file
You will see content below
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

    <groupId>com.cybertek</groupId>
    <artifactId>SeleniumProject</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>




</project>
Now it's time to add dependencies for selenium-java and WebDriver manager.
Open a section right under </properties> and right before </project>
   <dependencies>

   <dependencies>
Copy and paste the selenium dependency and the WebDriverManager Dependency in between.
Here is the full pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.cybertek</groupId>
    <artifactId>SeleniumProject</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
    </properties>

    <dependencies>

<!--        This is the dependency for selenium java binding -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

<!--        This is WebDriverManager dependency to help us set up Browser driver automatically-->
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.3</version>
        </dependency>


    </dependencies>


</project>
Create a package under src/test/java with name com.cybertek to match group id you added when creating project.
Create a class called SeleniumDryRun and add a main method to test things out. Folder Structure
Add below code and run , chrome browser should open and navigate to google.com
package com.cybertek;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {
    public static void main(String[] args) {
        //1. setup chrome driver using webdriver manager
            // so selenium can send interaction request
        WebDriverManager.chromedriver().setup();
        //2. create webdriver instance using Chrome Driver object
        WebDriver driver = new ChromeDriver();
        //3. navigate to https://google.com
        driver.get("https://google.com");
    }
}
You are all set