package AutomationTest.CyberSoft.Selenium.ASM_SwagLabs.Locator;

public class Locator_CMS {
    //Acount
    public static final String UserNameUser="standard_user";
    public static final String UserNameUser1="locked_out_user";
    public static final String UserNameUser2="problem_user";
    public static final String UserNameUser3="performance_glitch_user";
    public static final String UserNameUser4="error_user";
    public static final String UserNameUser5="visual_user";
    public static final String PassWordUser="secret_sauce";
    //cms login page
    public static final String base_URL = "https://www.saucedemo.com/";
    //Login Page
    public static final String  inputUserName="//*[@data-test='username']";
    public static final String inputPassWord="//*[@data-test='password']";
    public static final String btnLogin="//*[@data-test='login-button']";
    //Home Page
    public static final String lblFirstProductXpath="//*[contains(@class,'inventory_item_name')][1]";
    public static final String btnFirstProductXpath="//*[contains(@id,'add-to-cart')]";
    public static final String btnShoppingCardXpath="//*[contains(@class,'shopping_cart_container')]";
    public static final String btnRemove="//*[@data-test='remove-sauce-labs-backpack']";
    public static final String btnContinueShopping="//*[@data-test='continue-shopping']";
    public static final String btnCheckout="//*[@data-test='checkout']";
    //Hamburger Page
    public static final String btnHbOpenMenu="//*[@class='bm-burger-button']";
    public static final String btnHbCloseMenu="//*[@class='bm-cross-button']";
    //Menu Item
    public static final String iTemAll="//*[@class='bm-item-list']//a[@class='bm-item menu-item'][1]";
    public static final String iTemAbout="//*[@class='bm-item-list']//a[@class='bm-item menu-item'][2]";
    public static final String iTemLogout="//*[@class='bm-item-list']//a[@class='bm-item menu-item'][3]";
    public static final String iTemReset="//*[@class='bm-item-list']//a[@class='bm-item menu-item'][4]";
    //Information Page
    public static final String inputFirsName="//*[@data-test='firstName']";
    public static final String inputLastName="//*[@data-test='lastName']";
    public static final String inputPostalCode="//*[@data-test='postalCode']";
    public static final String btnContinue="//*[@data-test='continue']";
    public static final String btnCancel="//*[@data-test='cancel']";
    //Input Information Page
    public static final String nameFirsName="thanhnha";
    public static final String nameLastName="Nguyen Truong";
    public static final String namePostalCode="70000";
    //Overview Page
    public static final String btnCancelOv="//*[@data-test='cancel']";
    public static final String btnFinish="//*[@data-test='finish']";
    //Complete Page
    public static final String btnBackHome="//*[@data-test='back-to-products']";


}
