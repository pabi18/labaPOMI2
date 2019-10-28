import java.util.Arrays;

public class Abiturient {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private String address;
    private String phone;
    private int[] rating;


    public Abiturient (int id, String surName, String name, String middleName, String address, String phone, int [] rating) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int [] getRating() {
        return rating;
    }

    public void setRating(int rating []) {
        this.rating = rating;
    }

    private String printArry(int [] rating){
        String str="";
        for(int i: rating){
            str+=i+" ";
        }
        return str;
    }

    @Override
    public String toString(){
            return id+" "+surName+" "+name+" "+middleName+" "+address+" "+phone+" "+printArry(rating);
    }

    public int avg(int [] rating){
        int result=0;
        for(int i: rating){
            result+=i;
        }
        return result/rating.length;
    }

    public static  int[] createArray(int ... X){
        return X;
    }

    public static Abiturient[] abiturientArrayCreate(int n){
        Abiturient[] abitArray=new Abiturient[n];
        abitArray[0]=new Abiturient(5,"Ivanov","Ivan","Ivanovich","address a", "2281488",createArray(3,4,5));
        abitArray[1]=new Abiturient(6,"Petrov","Petr","Petrovich","address b","1234567",createArray(8,7,9));
        abitArray[2]=new Abiturient(7,"Pavlov","Pavel","Pavlovich","address c", "01091939",createArray(9,9,10));
        return abitArray;
    }

    public static void listBadRating(Abiturient[] abitArray){
        for (int i=0; i<abitArray.length;i++){
            for (int j : abitArray[i].rating){
                if (j<4){
                    System.out.println("Bad gay:"+abitArray[i].toString());
                    break;
                }
            }
        }
    }

    public static void listAvgRating(Abiturient[] abitArray, int rating){
        for (int i=0; i<abitArray.length;i++) {
        int avg=abitArray[i].avg(abitArray[i].rating);
            if (avg>=rating){
                System.out.println("Средний балл "+avg+". Абитуриент:"+abitArray[i].toString());
            }
        }
    }

    public static void listOfN (Abiturient[] abitArray, int n) {
        int avg[] = new int[abitArray.length];
        for (int i = 0; i < abitArray.length; i++) {
            avg[i] = abitArray[i].avg(abitArray[i].rating);
        }

        boolean isSorted = false;
        int buf;
        Abiturient bufob;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < abitArray.length - 1; i++) {
                if (avg[i] > avg[i + 1]) {
                    isSorted = false;

                    bufob = abitArray[i];
                    abitArray[i] = abitArray[i + 1];
                    abitArray[i + 1] = bufob;

                    buf = avg[i];
                    avg[i] = avg[i + 1];
                    avg[i + 1] = buf;
                }
            }
        }
        System.out.println("С высокими баллами ("+n+") студентов");
        for (int i=abitArray.length-1;i>=0;i--){
            if (n==0){break;}
            else {
                System.out.println(abitArray[i].toString());
                n--;
            }
        }
    }

    public static void list(Abiturient[] abitArray){
        for(int i=0; i<abitArray.length;i++){
            System.out.println(abitArray[i].toString());
        }
    }
    protected void finalize (){
        System.out.println("i work");
    }
}
