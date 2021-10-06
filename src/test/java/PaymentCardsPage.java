import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

public class PaymentCardsPage {

    private SelenideElement numberCard = $x("//span[@class='btn-saved-card__card-number']");


    public String numberCardCheck() {
        return numberCard.getText();

    }
}
