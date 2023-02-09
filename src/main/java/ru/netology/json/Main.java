package ru.netology.json;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();
        post.surname = "Разумов";
        post.name = "Александр";
        post.patronymic = "Викторович";
        post.birthday.day = 13;
        post.birthday.month = 12;
        post.birthday.year = 1981;
        post.passport = "1414 № 688446";
        post.phone = "+7 (999)-244-14-14";
        post.subscription = true;

    }
}
