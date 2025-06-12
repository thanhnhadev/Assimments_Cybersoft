package AutomationTest.CyberSoft.Selenium.ASM_Amazone.Locator;

public class Locator_CMS {
    public static String base_Url="https://www.amazon.fr/v?k";
    public static String ip_searching="//input[@type='text']";
    public static String ic_search="(//input[@type='submit'])[1]";
    //static Logger logger = LogManager.getLogger("Find Locators of Amazon Search Page");
    public static String logger = "Find Locators of Amazon Search Page";
    public static String adidasImg="//img[contains(@src,\"613wTu5YLOL\")]";
    //2
    public static String  unSalePrice = "//span[@class=\"a-price a-text-price\"]//span[@class=\"a-offscreen\" and contains(text(), '$75.00')]\n";
    //3
    public static String  salePrice = "//span[@class=\"a-price\" and @data-a-size=\"xl\"]//span[@class=\"a-offscreen\" and contains(text(),\"$19.99\")]";
    //4
    public static String  search = "//input[@id=\"twotabsearchtextbox\"]";
    //5
    public static String  shoppingCart ="//a[@href=\"/gp/cart/view.html?ref_=nav_cart\"]";
    //6
    public static String  categories = "//img[@alt=\"Women's Footwear\"]/ancestor::a";
    //7
    public static String  checkboxSpecialClothingSize = "//div[contains(@class,'col-span-3 flex-1 p-3 flex justify-center items-center cursor-pointer relative gap-3')]";

    //8
    public static String titleProduct ="//h2[@aria-label=\"Women's VL Court 3.0 Sneaker\"]";
    //9
    public static String  estimateddeliverytime ="//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-5\"]//span[@aria-label=\"Delivery Fri, Jun 27 \"]";
    //10
    public static String  brandTitle = "//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-7\"]//span[@class=\"a-size-base-plus a-color-base\" and contains(text(),adidas)]";
    //11
    public static String  shoptopCollection = "//h2[@id=\"loom-desktop-top-slot_us-slds-sp-2-t1-a2-heading\"]";
    //12
    public static String  menGender = "//div[@id=\"gender\"]//a[@aria-label='Apply Men filter to narrow results']//input[@type='checkbox']";
    //13
    public static String  result = "(//span[@data-component-type=\"s-result-info-bar\"]//h2//span)[1]";
    //14
    public static String  collection = "//li[@class=\"a-carousel-card s-visual-card-navigation-carousel-card\" and @aria-label=\"3 of 6\"]//a[contains(text(),\"Fleece\")]";
}
