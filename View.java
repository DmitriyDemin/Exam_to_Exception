package Exam_to_Eception;

import java.util.Scanner;

public class View {



    StringService service;
    String[] subStringArr;

    public String enterStringData() {
        System.out.println("Введите через пробел: Фамилию, Имя, Отчество, дату_рождения, номер_телефона и пол");
        Scanner scanner = new Scanner(System.in);
        String StringData = scanner.nextLine();
//        String[] subStringArr;
//        service = new StringService(strDate);
//        subStringArr = service.conversionStringData();
        return StringData;
    }

    public void repeatInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Повторить ввод данных?... (y/n)");
        String action = in.nextLine();
        if (!action.equalsIgnoreCase("y")) {
            System.exit(0);
        }
    }


    public StringService getService() {
        return service;
    }

}
