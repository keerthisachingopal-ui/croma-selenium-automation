# Selenium TestNG Automation Framework – Croma Website

## 📌 Project Overview
This project is an end-to-end test automation framework developed using Selenium WebDriver, TestNG, Maven, and Page Object Model (POM).  
The automation is implemented on a real-time e-commerce website (Croma) to gain practical experience handling real-world challenges like popups, OTP-based login, dynamic elements, and synchronization issues.

---

## 🎯 Purpose of Automation
- Reduce manual regression effort
- Ensure application stability after changes
- Validate critical user journeys
- Improve test execution speed and reliability

---

## 🧪 Test Scenarios Automated
- Home page validation
- Login popup validation using dummy phone number (OTP limitation)
- Search product flow
- Product selection
- Add to cart
- Cart page validation

---

## 🏗️ Framework Design
- Design Pattern: Page Object Model (POM)
- Test Framework: TestNG
-     Build Tool: Maven
-      Reporting: Extent Reports
-      Utilities: Explicit waits, screenshots,window handles,Extent Reports & config reader

---

## 📂 Project Structure
src/main/java
├── basepkg → Base classes (WebDriver setup)
├── pagespkg → Page Object classes
├── utilspkg → Utilities (waits, screenshots, config reader)

src/main/resources
├── config.properties → Environment & browser configuration

src/test/java
├── testspkg → TestNG test classes

testng.xml → Test suite runner
pom.xml → Maven dependencies
reports/ → Extent reports
screenshots/ → Failure & step screenshots


---

## ⚙️ Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Factory
- Extent Reports
- Git & GitHub

---

## ⏳ Synchronization & Exception Handling
- Explicit Waits (`WebDriverWait`)
- Handling:
  - `ElementNotInteractableException`
  - `TimeoutException`
  - Dynamic popups & overlays

---

## 🔐 Login Handling Strategy
Due to OTP-based authentication:
- Used "dummy phone number" for login UI validation
- Validated popup visibility and navigation flow
- Closed login popup to continue test execution

---

## 📸 Screenshots & Reports
- Screenshots captured for test steps and failures
- Extent Reports used for:
  - Pass/Fail status
  - Step-level logging
  - Screenshot attachment

---

## 🧠 Key Learnings
- Real-time site automation challenges
- Advanced locator strategies
- Page Factory usage
- Explicit waits importance
- TestNG advantages over JUnit
- Maven dependency management
- GitHub version control workflow

---

## 🚧 Challenges Faced
- OTP & captcha limitations
- Dynamic DOM changes
- Element interaction issues
- Synchronization problems

---

## ✅ Conclusion
This project enhanced my understanding of automation framework design, real-time application testing, and industry-standard best practices.  
It demonstrates my ability to build scalable and maintainable automation solutions.

---

## 👤 Author
Keerthi R Lekshmi 
Selenium Automation Tester
