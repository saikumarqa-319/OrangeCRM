package webPages;


import org.openqa.selenium.By;




import baseMethods.BaseClass;
import org.jsoup.Connection;
import org.openqa.selenium.By;

    public class MyInfoClass extends BaseClass
    {
        private static By contactDetailsButton = By.xpath(".//*[text()='Contact Details']");
        private static By savebutton = By.xpath("(.//*[@type='submit'])[1]");
        private static By streetNameField = By.xpath("(.//*[@class='oxd-input oxd-input--active'])[2]");
        private static By  cityNameField  = By.xpath("(.//*[@class='oxd-input oxd-input--active'])[4]");
        public void contactDetailsSection() {
            clickTheElement(contactDetailsButton);

            enterInput(streetNameField, "8BJBDUU88-Parkstreet");
            clickTheElement(savebutton);
        }


    }

