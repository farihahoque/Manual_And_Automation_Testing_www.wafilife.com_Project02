# Manual_And_Automation_Testing_www.wafilife.com_Project02
This project showcases a comprehensive approach to software testing by integrating both automated and manual testing methodologies. It leverages Selenium, a powerful tool for web application automation, alongside Allure Reports for detailed test reporting. Additionally, the project includes manually executed test cases to complement the automation efforts, ensuring thorough validation of the application under test.

## Technology Used
- IntelliJ IDE
- Selenium
- Google sheet
## Project Structure
- Automation Testings: Contains the Selenium WebDriver test scripts.
- Manual Testing: Directory for manual test case documentation.
- Allure-results: Directory where Allure results are stored.
- Allure-report: Directory where the Allure report is stored.

## Running Automated Tests in CLI mode
```console
mvn test
```
## Running Automated Tests in CLI mode with Specific Browser
```console
mv test -Dbrowser="chrome"
```
## Running Automated Tests in CLI mode with Specific Browser and Suite File
```console
mv test -Dbrowser="chrome" -DxmlFileName="testng.xml"
```
## Allure-report File Generation
```console
allure generate ./allure-results --clean
```
## Allure-report File Display in Local Server
```console
allure open ./allure-report/
```
## Allure-report File
-https://wafilifereport.netlify.app/







