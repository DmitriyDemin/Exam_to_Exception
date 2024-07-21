package Exam_to_Eception;

import java.util.List;

public class StringService {

    public String stringData;
    public String[] arraySubStrings;
    public String[] birthdaySubString;

    public StringService(String dataString) {
        this.stringData = dataString;
    }

    public String[] convertStringData(){
        arraySubStrings = stringData.split(" ");
        return arraySubStrings;
    }

    public int checkDataSize(String[] subStringsArr){
        int error = 0;
        if (subStringsArr.length > 6){
            error = 1;
            System.out.printf("код ошибки : %s \n", error);
            System.out.println("Данные введены некорректно! Вы ввели больше данных, чем требуется");
        } else if (subStringsArr.length < 6){
            error = -1;
            System.out.printf("код ошибки : %s \n", error);
            System.out.println("Данные введены некорректно! Вы ввели меньше данных, чем требуется");
        }
        return error;
    }

    public void checkBirthdayFormat(String birthdayString) throws RuntimeException{
        birthdaySubString = birthdayString.split("\\.");
        if (birthdaySubString.length != 3) {
            throw new RuntimeException("Ошибка при вводе даты рождения! введети дату рождения в формате dd.mm.yyyy");
        }
        for (String element: birthdaySubString){
            try {
                Integer.parseInt(element);
            }catch (NumberFormatException e){
                System.out.println("Ошибка при вводе даты рождения!");
            }
        }
    }

    public void checkGenderValue(Character gender){
        List<Character> genderList = List.of('f', 'm');
        try {
             if (!genderList.contains(gender)){
                 throw new IllegalArgumentException();
             };
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка при вводе пола! Введите пол символом латиницы f или m.");
        }
    }

}
