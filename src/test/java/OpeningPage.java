import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;


public class OpeningPage {

    public void openURL(String url) {
        Configuration.startMaximized = true;
        open(url);
    }
}
