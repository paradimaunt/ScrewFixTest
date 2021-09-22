import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;


public class OpeningPage {

    public void openMainURL() {
        Configuration.startMaximized = true;
        open("https://www.screwfix.com/");
    }
    public void openLoginPage(){
        Configuration.startMaximized = true;
        open("https://www.screwfix.com/login/");
    }
}
