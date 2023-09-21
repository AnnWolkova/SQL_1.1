package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    public final SelenideElement heading = $("[data-test-id=dashboard]");
    public DashboardPage() {
        heading.shouldBe(Condition.visible);
    }
}