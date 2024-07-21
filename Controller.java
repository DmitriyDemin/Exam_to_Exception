package Exam_to_Eception;

public class Controller {

    private View view = new View();
    private StringService service;
    private String inputLine;
    private User user;
    private WriterFile writer;


    public void start() throws Exception {
        while (true) {
            inputLine = view.enterStringData();
            try {
                service = new StringService(inputLine);

                if (service.checkDataSize(service.convertStringData()) != 0) {
                    view.repeatInput();
                    start();
                }
                user = new User(service.convertStringData());
            }catch (NumberFormatException e){
                System.out.println("Ошибка при вводе номера телефона!");
                view.repeatInput();
                start();
            }
            try {
                    service.checkBirthdayFormat(user.getBirthday());
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    view.repeatInput();
                    start();
                }
                try {
                    service.checkGenderValue(user.getGender());
                } catch (IllegalArgumentException f) {
                    System.out.println(f.getMessage());
                    start();
                }
                System.out.println("данные ОК");
                writer = new WriterFile(user.getLastName());
                writer.writeDataOfUserToFile(user.toString());
                view.repeatInput();
                }
            }


        }






