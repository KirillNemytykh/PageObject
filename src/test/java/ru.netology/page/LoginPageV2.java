package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageV2 {
  private static SelenideElement loginField = $("[data-test-id=login] input");
  private static SelenideElement passwordField = $("[data-test-id=password] input");
  private static SelenideElement loginButton = $("[data-test-id=action-login]");

  public static ru.netology.page.VerificationPage validLogin(DataHelper.AuthInfo info) {
    loginField.setValue(info.getLogin());
    passwordField.setValue(info.getPassword());
    loginButton.click();
    return new ru.netology.page.VerificationPage();
  }
}
