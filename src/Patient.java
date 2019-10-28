import java.util.Scanner;
public class Patient {
    private int id, phoneNumber, numberOfCard;
    private String lastName, name, middleName, address, diagnosis;

    public Patient(int id,String name, String lastName, String middleName, String address, int phoneNumber, int numberOfCard, String diagnosis){
        this.id=id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.numberOfCard=numberOfCard;
        this.diagnosis=diagnosis;
    }
    public Patient(){
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override //Object суперкласс, все остальные классы — это его подклассы
    public String toString() {
        return "Patient [id=" + id + ", number=" + numberOfCard + ", name=" + name + ", lastName=" + lastName + ", middleName=" + middleName + ", address=" +
                address + ", phone=" + phoneNumber + ", diagnosis=" + diagnosis + "]";
    }
    public void show() {
        System.out.println("id: " + this.id + ", lastName: " + this.lastName + ", name: " + this.name + ", middleName:" + this.middleName + ", address:" + this.address + ", phone:" + this.phoneNumber + ", number: " + numberOfCard + ", diagnosis: " + diagnosis);
    }
    public static Patient[] patientsArrayCreation(int n) {
        Patient patientsArray[] = new Patient[n];
        patientsArray[0]=new Patient(1,"Петр","Петров","Петрович","Улица А,дом 2", 1234567, 26,"Геморрой");
        patientsArray[1]=new Patient(2,"Иван","Иванов","Иванович","Улица В дом 6",5553535,14,"Отит");
        return patientsArray;
    }

    public static void diagnosisList (Patient[] patientsArray){
        String a = "";
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите диагноз: ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();

            for (int i = 0; i < patientsArray.length; i++) {
                if (a.equals(patientsArray[i].getDiagnosis())) {
                    patientsArray[i].show();
                    b++;
                }
            }
        }
        if (b == 0) {
            System.out.println("Больных с данным диагнозом нет");
        }
        System.out.println();
    }

    public static void CardList (Patient[] patientsArray){
        int a=0, b=0, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите начальное значение: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
            System.out.print("Введите конечное значение: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
            }
                for (int i = 0; i < patientsArray.length; i++) {
                    if (patientsArray[i].numberOfCard >= a && patientsArray[i].numberOfCard <= b) {
                        patientsArray[i].show();
                        c++;
                    }
                }
        if (c == 0) {
            System.out.println("Больных с ведённым номером медицинской карты нет");
        }
        System.out.println();
    }

    public static void list(Patient[] patientsArray){
        for (int i=0;i<patientsArray.length;i++){
            System.out.println(patientsArray[i].toString());
        }
    }
    protected void finalize(){
        System.out.println("Я тут поубираю, если ты не против");
    }




}
