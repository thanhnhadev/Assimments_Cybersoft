package AutomationTest.CyberSoft.Selenium.ASM_OrangHRM.Locator;

public class Locator_CMS {
    //Defaut-Acount-btnSearch-btnReset
    public static final String UserNameUser="Admin";
    public static final String PassWordUser="admin123";
    public static final String btnReset="//button[@type='reset']";
    public static final String btnSearch="//button[@type='submit']";
    //cms login page
    public static final String base_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    //Login Page
    public static final String logoLogin = "//img[@alt='company-branding']";
    public static final String  titleLogin="//*[contains(@class,'orangehrm-login-title')]";
    public static final String  inputUserName="//*[contains(@placeholder,'Username')]";
    public static final String inputPassWord="//*[contains(@placeholder,'Password')]";
    public static final String btnLogin="//*[@type='submit']";
    public static final String pForgotPassword="//*[contains(@class,'orangehrm-login-forgot-header')]";
    //Home Page

    //Menu Item
    public static final String tileHeader="(//*[text()='Dashboard'])[2]";
    public static final String avatarDdAbout="//*[contains(@class,'oxd-userdropdown')]/descendant::ul[contains(@class,'oxd-dropdown-menu')]/li[1]";
    public static final String avatarDdSupport="//*[contains(@class,'oxd-userdropdown')]/descendant::ul[contains(@class,'oxd-dropdown-menu')]/li[2]";
    public static final String avatarDdPassWord="//*[contains(@class,'oxd-userdropdown')]/descendant::ul[contains(@class,'oxd-dropdown-menu')]/li[1]";
    public static final String avatarDdLogout="//*[contains(@class,'oxd-userdropdown')]/descendant::ul[contains(@class,'oxd-dropdown-menu')]/li[4]";
    public static final String itemAdmin="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[1]";
    public static final String itemPim="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[2]";
    public static final String itemLeave="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[3]";
    public static final String itemTime="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[4]";
    public static final String itemRecruitment="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[5]";
    public static final String itemMyinfo="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[6]";
    public static final String itemPerformance="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[7]";
    public static final String itemDashboard="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[8]";
    public static final String itemDirectory="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[9]";
    public static final String itemMaintenance="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[10]";
    public static final String itemClaim="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[11]";
    public static final String itemBuzz="//*[contains(@class,'oxd-sidepanel-body')]/child::ul[contains(@class,'oxd-main-menu')]/li[12]";
    //Naviagation Admin

    //Navigation Pim
    public static final String emPloyeeList="//*[contains(text(),'Employee List')]";
    //Navigate Leave

    //Body Admin
    public static final String ad_userName="//*[text()='Username']/following::input[@class='oxd-input oxd-input--active'][1]";
    public static final String droDownUserRole="//*[text()='User Role']/following::div[@class='oxd-select-wrapper'][1]";
    public static final String sp_dDuerRole="//*[contains(text(),'Admin')]";
    public static final String ad_empName="//*[text()='Employee Name']/following::div[@class='oxd-autocomplete-wrapper'][1]//input";
    public static final String ad_sTatus="//*[text()='Status']/following::div[@class='oxd-select-wrapper'][1]";
    public static final String ad_enaBled="//*[contains(text(),'Enabled')]";
    public static final String btnAddAdmin="(//*[contains(@type,'button')])[6]";
    //Body Pim
    public static final String inputEmplyessName="(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]/child::input";
    public static final String inputEmplyessid="(//input[@class='oxd-input oxd-input--active'])[2]";
    public static final String dropDownEmplyessStatus="//*[text()='Employment Status']/following::div[@class='oxd-select-text-input'][1]";
    public static final String dropDownInclude="//*[contains(text(),'Current Employees Only')]";
    public static final String inputSupervisor="(//*[contains(@class,'oxd-autocomplete-text-input oxd-autocomplete-text-input--active')])[2]/input";
    public static final String dropDownJobTitle="//*[text()='Job Title']/following::div[@class='oxd-select-text-input'][1]";
    public static final String dropDownSubUnit="//*[text()='Sub Unit']/following::div[@class='oxd-select-text-input'][1]";
    public static final String lbFreelance="//*[contains(text(),'Freelance')]";
    public static final String lbCurrent="//*[contains(text(),'Current Employees Only')]";
    public static final String lbAutomation="//*[contains(text(),'Database Administrator')]";
    public static final String lbOHRM="//*[contains(text(),'Finance')]";
    //Body Leave

    //table
    public static final String ip_Checkbox="(//*[contains(@role,'columnheader')])[1]";
    public static final String lbUser="(//*[contains(@role,'columnheader')])[2]";
    public static final String lbUserRole="(//*[contains(@role,'columnheader')])[3]";
    public static final String lbEmployeeName="(//*[contains(@role,'columnheader')])[4]";
    public static final String lbStatus="(//*[contains(@role,'columnheader')])[5]";
    public static final String lbAction="(//*[contains(@role,'columnheader')])[6]";
    //data table
    public static final String ipCheckbox="(//*[contains(@role,'cell')])[1]";
    public static final String dataUser="(//*[contains(@role,'cell')])[2]";
    public static final String dataUserRole="(//*[contains(@role,'cell')])[3]";
    public static final String dataEmployeeName="(//*[contains(@role,'cell')])[4]";
    public static final String dataStatus="(//*[contains(@role,'cell')])[5]";
    public static final String btnTrash="((//*[contains(@class,'oxd-table-cell-actions')])[1]//following::button[contains(@class,'oxd-icon-button oxd-table-cell-action-space')][1])[1]";
    public static final String btnEdit="((//*[contains(@class,'oxd-table-cell-actions')])[1]//following::button[contains(@class,'oxd-icon-button oxd-table-cell-action-space')][1])[2]";

}
