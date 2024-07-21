package Exam_to_Eception;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
    private Long phoneNumber;
    private Character gender;

    public User(String[] input){
        this.lastName = input[0];
        this.firstName = input[1];
        this.middleName = input[2];
        this.birthday = input[3];
        this.phoneNumber = Long.parseLong(input[4]);
        this.gender = input[5].charAt(0);
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>\n", lastName, firstName, middleName, birthday, phoneNumber, gender);
    }

    public String getBirthday() {
        return birthday;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Character getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }
}
