### **1\. BaseClass**

The `BaseClass` handles the initialization and setup of the WebDriver (ChromeDriver) as well as closing the browser after the test. It also provides a method to return the WebDriver instance for use in test classes.

#### **Key Methods:**

* **`setup()`**:

  * Launches the Chrome browser using `ChromeDriver()`.

  * Maximizes the browser window.

  * Sets an implicit wait of 30 seconds for all elements.

  * Opens the URL `https://www.saucedemo.com/`.

  * **Hard Assertion**: Verifies that the text "Swag Labs" appears on the login page.

  * Prints a success message after loading the login page.

* **`closeDown()`**:

  * Closes the browser using `driver.quit()` to end the session.

* **`getDriver()`**:

  * Returns the `driver` instance for use in other classes or test methods.

---

### **2\. TestExecution**

This class is used to execute various tests using TestNG annotations, running the login, logout, and other functionalities on the application.

#### **Key Methods:**

* **`login()`**:

  * Logs in using valid credentials (`standard_user` and `secret_sauce`).

* **`loginNegativeTestCase()`**:

  * Attempts to log in with invalid credentials (such as a locked-out user) and asserts the error message that appears, confirming the failure.

* **`ProductPage()`**:

  * Tests buying multiple products from the product page and verifies the URL.

* **`CheckoutPage()`**:

  * Completes the checkout process by providing necessary details and verifying each step with assertions.

* **`SortingProductsValidation()`**:

  * Validates different sorting options (low to high, high to low, name A-Z, and name Z-A) on the product page.

* **`LogoutFunctionalityTest()`**:

  * Tests logging out from the application and verifies if the user is redirected to the login page.

* **`LockedOutUserValidation()`**:

  * Tests logging in with a locked-out user and asserts the appropriate error message.

* **`CartBadgeCountValidation()`**:

  * Verifies the correct count of items in the cart by adding/removing products and checking the cart badge number.

---

### **3\. LoginPage**

This class handles interactions with the login page, such as entering the username, password, and clicking the login button.

#### **Key Methods:**

* **`enterUser(String username)`**:

  * Enters the given username in the username field on the login page.

* **`enterPassword(String password)`**:

  * Enters the given password in the password field on the login page.

* **`clickLogin()`**:

  * Clicks the login button to attempt the login.

---

### **4\. NegativeTestCase (Login Negative Test)**

This class tests the login functionality with invalid credentials, specifically testing for locked-out users.

#### **Key Methods:**

* **`loginNegativeTestCase()`**:

  * Tries logging in with invalid credentials (such as a locked-out user).

  * Asserts that the error message **"Epic sadface: Sorry, this user has been locked out."** appears.

---

### **5\. ProductPage**

This class handles actions related to the product page, such as adding products to the cart and navigating between pages.

#### **Key Methods:**

* **`BuyFristProduct()`**:

  * Verifies the URL of the product page using **Hard Assertion**.

  * Adds the first product (`sauce-labs-backpack`) to the cart.

  * Waits for a few seconds before completing the action.

* **`BuySecondProduct()`**:

  * Adds the second product (`sauce-labs-bike-light`) to the cart.

  * Navigates to the cart page and verifies the URL.

  * Removes one product and continues shopping.

  * Verifies the URL after navigating back to the product page and adds the product again.

* **Cart Badge Check**:

  * Fetches the number of products in the cart (using the cart badge) and verifies the number of items.

---

### **6\. CheckoutPage**

The `CheckoutPage` class handles interactions related to the checkout process, such as filling out user details and completing the order.

#### **Key Methods:**

* **`CheckOut()`**:

  * Clicks the cart icon and verifies the URL of the cart page.

  * Navigates to the checkout page and verifies the URL.

  * Fills out the checkout form with the first name, last name, and postal code, then clicks "Continue".

  * Verifies the URL of the overview page.

  * Clicks the finish button and verifies the completion URL.

  * Asserts that the "Thank you for your order\!" message appears.

  * Clicks the back-to-products button and verifies the URL of the product page.

---

### **7\. SortingProductsValidation**

This class tests the sorting functionality of the products on the product page. It validates if the sorting options work as expected.

#### **Key Methods:**

* **`LowToHigh()`**:

  * Sorts the products by price, from low to high, and prints them in ascending order.

* **`HighToLow()`**:

  * Sorts the products by price, from high to low, and prints them in descending order.

* **`NameAtoZ()`**:

  * Sorts the products by name, from A to Z, and prints them in alphabetical order.

* **`NameZtoA()`**:

  * Sorts the products by name, from Z to A, and prints them in reverse alphabetical order.

---

### **8\. LockedOutUserValidation**

This class is used to test the behavior of the application when trying to log in with a locked-out user.

#### **Key Methods:**

* **`Lockedoutuser()`**:

  * Attempts to log in with a locked-out user's credentials and asserts that the appropriate error message appears.

---

### **9\. LogoutFunctionalityTest**

This class tests the logout functionality to ensure the user can log out successfully.

#### **Key Methods:**

* **`LogOutFunctionalityTest()`**:

  * Logs in as a user and clicks the hamburger menu to select the logout option.

  * Verifies that after logging out, the user is redirected to the login page.

---

### **10\. CartBadgeCountValidation**

This class tests the functionality of the cart badge count, ensuring the number of items in the cart is updated correctly when products are added or removed.

#### **Key Methods:**

* **`BuyMultipleProduct()`**:

  * Adds multiple products to the cart.

  * Verifies the cart page URL.

  * Checks the badge count to confirm the number of items in the cart.

  * Removes one item from the cart and verifies the updated badge count.

---

### **Summary**

* The **BaseClass** initializes the WebDriver and provides methods for setup and teardown.

* The **TestExecution** class runs the test scenarios for login, logout, product page, checkout, sorting validation, locked-out user validation, and cart badge count validation.

* The **LoginPage**, **ProductPage**, **CheckoutPage**, **SortingProductsValidation**, **LockedOutUserValidation**, and **LogoutFunctionalityTest** classes contain methods for interacting with specific parts of the application.

* Each test class is designed to validate specific functionalities of the application to ensure proper behavior.

