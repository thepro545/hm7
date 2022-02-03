package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

// Task 2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);
// Task 3
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
// Task 4
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

// Task 5
        String fullName1 = "Ivanov Ivan Ivanovich";
        String firstName1 = fullName1.substring(fullName1.indexOf(" ") + 1, fullName1.lastIndexOf(" "));
        String middleName1 = fullName1.substring(fullName1.lastIndexOf(" ") + 1);
        String lastName1 = fullName1.substring(0, fullName1.indexOf(" "));
        System.out.println("Имя сотрудника - " + firstName1);
        System.out.println("Отчество сотрудника - " + middleName1);
        System.out.println("Фамилия сотрудника - " + lastName1);

// Task 6
        String fullName2 = "ivanov ivan ivanovich";
        String[] words = fullName2.split(" ");
        String fullNameNew = "";
        for (String i : words) {
            String first = i.substring(0, 1).toUpperCase();
            String other = i.substring(1);
            fullNameNew += first + other + " ";
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameNew);

// Task 7
        String a1 = "135";
        String a2 = "246";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a1.length(); i++){
            sb.append(a1.charAt(i));
            sb.append(a2.charAt(i));
        }
        String result = sb.toString();
        System.out.println(result);

// Task 8
        String abc = "aabccddefgghiijjkk";
        int check = 0;
        for (int i = 0; i < abc.length() - 1; i++) {
            if (abc.charAt(i) == abc.charAt(i + 1)) {
                System.out.print(abc.charAt(i));
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Дублей нет");
        }

    }
}
