package manager;

import models.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StudentHelper extends HelperBase{
    public StudentHelper(WebDriver wd) {
        super(wd);
    }

    public void selectItemForms() {
        if(isElementPresent(By.id("close-fixedban"))) {
            click(By.id("close-fixedban"));
        }
        click(By.xpath("//div[@class='category-cards']/div[2]"));
        pause(500);
    }

    public void selectPracticeForm() {
        click(By.xpath("//span[.='Practice Form']"));
    }
    public void uploadPicture() {
        wd.findElement(By.id("uploadPicture")).sendKeys("/Users/tayahatum/Qa30/Qa30_DemoQa/boy.jpeg");
    }
    public void submit() {
        click(By.id("submit"));
    }

    public void closeSuccessDialog() {
        click(By.id("closeLargeModal"));
    }

    public void fillForm(Student model) {
        type(By.id("firstName"),model.getFirstName());
        type(By.id("lastName"),model.getLastName());
        type(By.id("userEmail"),model.getEmail());
        //selectGender(model.getGender());
        type(By.id("userNumber"),model.getPhone());
        //typeBDay(model.getBirthday());
        //addSubjectByClick(model.getSubject());
        //selectHobby(model.getHobbies());
        type(By.id("currentAddress"), model.getAddress());
        //typeState(model.getState());
        //typeCity(model.getCity());
    }
}
