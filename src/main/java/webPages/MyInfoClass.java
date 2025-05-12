package webPages;


import org.openqa.selenium.By;




import baseMethods.BaseClass;
import org.jsoup.Connection;
import org.openqa.selenium.By;

    public class MyInfoClass extends BaseClass
    {
        private static By contactDetailsButton = By.xpath(".//*[text()='Contact Details']");
        private static By savebutton = By.xpath("(.//*[@type='submit'])[1]");

        public void contactDetailsSection() {
            clickTheElement(contactDetailsButton);
            clickTheElement(savebutton);
        }


    }

