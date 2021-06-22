# -BIPINPAUL--NHSBSA

Project Title : NhsTask

Motivation : Implement Automation framework in NHS Checker Tool

Programmig Language used: Java

Framework used: Cucumbe-JVM, JUnit

Build tool used: Maven

Framework method used: Page Object Model

Webdriver code distribution: All the webdriver codes are divided into different pages and separate classes which is sitting under the package com.pages under src/test/java

Runner class: CucumberRunner class is sitting under com.runner under src/test/java

BaseTest: A class created for driver code which extends to other classes using inheritance concept

Step Definitions: All the step defintions divided into separate classes and sitting under package com.stepDefinitions under src/test/java

Hooks: Using the annotations @Before and @After, block of codes are used to run before and after the scenario

Feature file: The BDD steps are created inside the cucumber file walesTestTicket.feature under the folder features under src/test/resources

Run the test: To run the test go to the package com.runner, right click on CucumberRunner.java class and Run as Junit Test





