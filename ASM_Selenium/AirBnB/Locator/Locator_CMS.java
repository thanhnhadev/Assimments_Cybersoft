package AutomationTest.CyberSoft.Selenium.AirBnB.Locator;

public class Locator_CMS {
    //cms login page
    public static final String base_URL="https://demo4.cybersoft.edu.vn/";
    //header Page
    public static final String imgLogo="//*[@class='flex items-center space-x-3 rtl:space-x-reverse active']";
    public static final String itHome="//*[contains(text(),'Home')]";
    public static final String itAbout="//*[contains(text(),'About')]";
    public static final String itServices="//*[contains(text(),'Services')]";
    public static final String itPricing="//*[contains(text(),'Pricing')]";
    public static final String itContact="//*[contains(text(),'Contact')]";
    public static final String bticAvatar="//img[contains(@class,'h-10')]";
    public static final String btnLogin="//*[contains(text(),'Đăng nhập')]";
    public static final String btnRegister="//*[contains(text(),'Đăng ký')]";
    //Body Page
    public static final String pLocation="//div[contains(@class,'col-span-3')][1]";
    public static final String lbHCM="//div[contains(@class,'cursor-pointer')]//p[text()='Hồ Chí Minh']";
    public static final String openDatepicker="//div[contains(@class,'grid-cols-12')]/div[3]";
    public static final String lbDateGo="//div[contains(text(), 'Jun 2025')]/following::span[@class='rdrDayNumber']/span[text()='4']";
    public static final String lbDateBack="//div[contains(text(), 'Jun 2025')]/following::span[@class='rdrDayNumber']/span[text()='9']";
    public static final String lbCustomer="//div[contains(@class,'col-span-3 flex-1 p-3 flex')]";
    public static final String lbPush="//button/div[text()='+']";
    public static final String search="//span[@aria-label='search']";
    public static final String btnAdress="//*[contains(text(),'Loại nơi ở')]";
    public static final String btnPrice="//*[contains(text(),'Giá')]";
    public static final String btnBookingNow="//*[contains(text(),'Đặt ngay')]";
    public static final String btnRom="//*[contains(text(),'Phòng và phòng ngủ')]";
    public static final String btnFilter="//*[contains(text(),'Bộ lọc khác')]";


}
