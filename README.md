# ForeksChallenge
The challenge of Foreks before hiring the tester employees to the company.

# Getting Started

# Prerequisites
Selenium Web Driver, JUnit 4.0 or higher and Eclipse IDE for Java EE Developers is required.

# Installing
1. Download Eclipse IDE for Java EE Developers from Eclipse web site.
2. Your JRE or JDK should be inside of IDE's folder to run the application.
3. Run the IDE.
4. Right after determining the name of the project, click right on your class.
5. Click Build Path / Configure Build Path...
6. Click Libraries on the top.
7. Click External JARs at the right of the window.
8. Select Selenium Web Driver and JUnit which you downloaded before.
9. You're ready to go.

# Running the Tests
The scenario of the challenge was followed. The test was executed automatically via the program. I decided to use hepsiburada.com instead of n11 because I was told that it was the other alternative.
I used "id, xpath and cssselector" to catch the elements of the website. Google Chrome web browser was used while testing the website. 2 assert methods was used; detecting if the main website is true and clarifying if the first clicked element is the one we desire to see. In the log in page, ID and password parts was caught wih these element's ID values. The submit button didn't have an ID value or name value, so i used xpath to reach the button. I commanded the program to stop for 3 seconds before processing through to detect the elements easier. After finding the product search bar, i used sendKeys method to type a word on it. After typing the required word, the program submits the search. The most challenging part of the scenario was clicking the first element of the results page. I tried to fix it more than 15 times to make it work properly. When the program progresses to the mentioned part, it was just stopping and on the console, "the element could not be detected" prompt was shown. I put another stopping period before this step, tried it with xpath but didn't work as well. Finally, i used css selector and BugBuster to get the selector of the required field. Now the program works smoothly. The crucial part of the project was the try catch structure. This part is the main part where the real test is done. The program checks if the first clicked website is the same with the first element of the results page or not. Selenium's TakesScreenshot feature was used to get the screenshots in both conditions. Finally, the program logs out from the website after the test is complete.

# Scenario
Initially, the program opens the website of hepsiburada. The program makes the window full screen before the test starts. At first it checks whether the website is true or not and shows it on console. 
After these events, the program opens the login page of the website, enters the ID and password and logs in to the system. Originally, i was asked to log in to the site via a Facebook log in button, but i wanted to make it a little more challenging. After logging in, the program searches the word which is iphone7. The program 
clicks on the first element of the results page, controls if it is the first page or not from the title. Console shows if the clicked product is the same with the required one or not. The program takes a screenshot for troubleshooting in both conditions.
The programs logs out from the web site after these progresses.

# Author
Berkay Kocatürk
