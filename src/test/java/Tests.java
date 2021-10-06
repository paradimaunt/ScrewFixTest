import org.junit.Assert;
import org.junit.Test;

public class Tests extends OpeningPage {

    @Test
    public void searchProduct() {
        openURL("https://www.screwfix.com/");
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        homePage.clickAcceptCookiesButton();
        homePage.searchProduct();
        Assert.assertEquals("Bath Waste with Plug & Chain 16\"",
                productPage.getProductDescription1());
    }

    @Test
    public void addItemToCart() {
        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        RegisterPage registerPage = new RegisterPage();
        SecureCheckoutPage secureCheckoutPage = new SecureCheckoutPage();
        PaymentCardsPage paymentCardsPage = new PaymentCardsPage();
        openURL("https://www.screwfix.com/login/");
        homePage.clickAcceptCookiesButton();
        registerPage.fillRequiredFieldDuringRegistration();
        Assert.assertEquals("THANK YOU", registerPage.registerCompleteText1());
        registerPage.clickContinueShoppingButton();
        homePage.searchProduct();
        Assert.assertEquals("BATH WASTE WITH PLUG & CHAIN 16\" (91024)", productPage.getProductDescription1());
        productPage.clickDeliverButton();
        productPage.clickCheckoutNowButton();
        productPage.clickContinueToPayment();
        secureCheckoutPage.clickDeliveryAddress();
        secureCheckoutPage.chooseTomorrowDate();
        secureCheckoutPage.clickDeliveryOptionsForThisDayButton();
        secureCheckoutPage.clickPayWithCardRadioButton();
        secureCheckoutPage.clickTypeCardVisaButton();
        secureCheckoutPage.fillingInCardData();
        secureCheckoutPage.clickBillingAddress();
        secureCheckoutPage.clickCheckboxSaveCard();
        secureCheckoutPage.clickFirstContinueButton();
        secureCheckoutPage.clickSecondContinueButton();
        secureCheckoutPage.clickLogoScrewFix();
        homePage.clickAccountHeader();
        homePage.clickPaymentCardsField();
        Assert.assertEquals("**** **** **** 1111", paymentCardsPage.numberCardCheck());
    }
}
