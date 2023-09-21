package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;

public class DataHelper {

    public static final Faker faker = new Faker(new Locale("en"));

    public DataHelper() {
    }

    @Value
    public static class AuthInfo {
         String login;
         String password;
    }

    public static AuthInfo getAuthInfoFromTestData() {

        return new AuthInfo("vasya", "qwerty123");
    }

    public static String generateLogin() {

        return faker.name().username();
    }

    public static String generatePassword() {

        return faker.internet().password();
    }

    public static AuthInfo generateUser() {

        return new AuthInfo(generateLogin(), generatePassword());
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    public static VerificationCode getRandomVerificationCode() {

        return new VerificationCode(faker.numerify("######"));
    }
}