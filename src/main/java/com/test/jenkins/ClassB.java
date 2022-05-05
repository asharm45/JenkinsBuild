package com.test.jenkins;

import java.util.ArrayList;
import java.util.List;

public class ClassB {

    public static void main(String[] args) {

        //Create xapth runtime

        // get all the input text box in a List

        /*List<WebElement> list = this.content.driver().(get all text fields);

        for (WebElement ele: list) {
            if(ele.getAttribute("value") == ""){

            }
        }*/

        //Alert present
        /*Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
        if(a!=null){
            System.out.println("Alert is present");
            driver.switchTo().alert().accept();
            return true;
        }else{
            throw new Throwable();
        }*/

        //or

        /*
        public boolean isAlertPresent(){
            try{
                Alert a=this.content.driver().switchTo().alert();
                return true;
            }
            catch (NoAlertPresentException e) {
                return false;
            }
        }
        */


    }
}
