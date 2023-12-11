## Project VARLE.LT

### SetUp

### Site used for testing

[VARLE.LT](https://www.varle.lt/)

### Packages used for testing

- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

### T.S. 1. Login

#### T.C. 1.1. Login with valid email.

1. Open the site.
2. Click on "Prisijungimas".
3. Into email field enter your email "artiom.fomichiovqa@gmail.com".
4. Into password field enter your password "abcd12321".
5. Press the button "prisijungti".
6. Check if "artiom.fomichiovqa@gmail.com" appears.

#### Expected result:

User are able to log in with valid credentials, "artiom.fomichiovqa@gmail.com" appears at the site.

#### T.C. 1.2. Login with invalid email.

1. Open the site.
2. Click on "Prisijungimas".
3. Into email field enter your email "artiom.fomichiovqa@gmail.com".
4. Into password field enter your password "abcd123".
5. Press the button "prisijungti".
6. Check if error message appears.

#### Expected result:

User aren't able to log in with invalid email, "Pateiktas el. pašto adresas ir/arba slaptažodis yra neteisingi."
appears at the site.

### T.S. 2. Item search

#### T.C.2.1. Searching for item.

1. Click on the "Paieška" field and enter the "jaguar kvepalai vyrams".
2. Click on the arrow.
3. Check if the items which is returned has at least one of the following words "jaguar", "kvepalai" or "vyrams" in the
   title.

#### Expected result:

All the following items which is returned has at least one of the words "jaguar", "kvepalai" or "vyrams" in the title.

### T.S. 3. Changing item sizes

#### T.C.3.1. Adding item to cart

1. Click on the "Paieška" field.
2. Enter the "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml" into "Paieška" field.
3. Click on the arrow.
4. Click on the item.
5. Add single item into cart, by clicking button "Į krepšelį"".
6. When alert "Prekė įtraukta į krepšelį" appears click button "Prekintis toliau".
7. Check if cart status changes from "Krepšelis Tuščias" to "1".

#### Expected result:

Cart status changes from "Krepšelis Tuščias" to "1".

#### T.C.3.2. Adding item to favorites

1. Click on the "Paieška" field and enter "Jaguar Stance EDT tualetinis vanduo vyrams, 100 ml".
2. Click on the arrow.
3. Click on button accept cookies.
4. Click on image.
5. Click button add item to favourites.
6. Click on the favourites.
7. Check if favourites size changed.

#### Expected result:

Favourites status changes from "0" to "1".

### T.S. 4. Register

#### T.C. 4.1. Register with existing user email.

1. Open the site.
2. Click on "Prisijungimas".
3. Click on "Registruotis".
3. Into email field enter your email "mokinys90123@gmail.com".
4. Into password field enter your password "M@kinys123*".
5. Into second password field enter your password "M@kinys123*" to confirm it.
6. Click on check box to confirm that you agree with privacy policy.
5. Press the button "Registruotis".
6. Check if error message appears.

#### Expected result:

User aren't able to register with existing user email, error message appears
"A user is already registered with this e-mail address.".




