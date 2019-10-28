import java.net.Socket;

public class Lab2Main {
    public static void main(String [] args){
    Lab2Main mainOb=new Lab2Main();
    //mainOb.task1();
    //mainOb.task2();
    //mainOb.task3();
    //mainOb.task4();
    //mainOb.task5();
    //mainOb.task6();
    //mainOb.task7();
    //mainOb.task8();
        }

    public void task1(){

        System.out.println("Student");
        Student[] student=Student.studentsArrayCreation(4);
        Student.list(student);
        Student.facultyStudentList(student);
        Student.facultyCourseStudentList(student);
        Student.studentWasBornAfterYear(student);
        Student.groupList(student);

        System.out.println("Patient");
        Patient[] patient=Patient.patientsArrayCreation(2);
        Patient.list(patient);
        Patient.diagnosisList(patient);
        Patient.CardList(patient);


        System.out.println("Abiturient");
        Abiturient[] abit=Abiturient.abiturientArrayCreate(3);
        Abiturient.list(abit);
        Abiturient.listBadRating(abit);
        Abiturient.listAvgRating(abit,6);
        Abiturient.listOfN(abit,1);

        System.out.println("House");
        House arr[]=House.createMas(3);
        House.showMas(arr);
        House.spisA(arr);
        House.spisB(arr);
        House.spisC(arr);

        System.out.println("Car");
        Car mas[]=Car.createMas(2);
        Car.showMas(mas);
        Car.spisA(mas);
        Car.spisB(mas);
        Car.spisC(mas);

    }

    public void task2(){
        Circle ob = new Circle(1,2,3);
        ob.show();

        ob.changeCentre(2,3);
        System.out.println("Изменённая координата х: " + ob.x);
        System.out.println("Изменённая координата у: " + ob.y);

        ob.changeRadius(2);
        System.out.println("Изменённый радиус: " + ob.r);
        ob.S();
        ob.L();
    }
    public void task3(){
        Storage arr[]=Storage.createArr(3);
        Storage.showArr(arr);
        Storage.spisDiff(arr, 5, "Cap");
        Storage.spisCost(arr, 4, "Table");
        Storage.spisB(arr);
        Storage.spisC(arr);
        Storage.spisD(11,22,33);
        arr[0].show();
        arr[0].setCost(10);
        arr[0].show();
    }
    public void task4(){
        Book mas[] = Book.createMas(2);
        Book.showMas(mas);
        String x = "", t = "";
        int p = 0;
        Book.spisA1(mas);
        Book.spisA2(mas);
        Book.spisA3(mas,"Star","Fandeev",2001);
        Book.spisA4(mas, "Star","Fandeev",600);
        Book.spisB(mas);
        Book.spisA1(mas, x, t);
        Book.spisA2(mas, x, t);
        Book.spisA3(mas, x, p);
        Book.spisA4(mas, x, p);
        Book.showMas(mas);
    }
    public void task5(){
        Fraction dr1 = new Fraction(6, 8);
        Fraction dr2 = new Fraction(3, 4);
        Fraction dr3 = new Fraction(6, 8);
        Fraction dr4 = new Fraction(7, 8);
        Fraction.sum(dr1, dr2);
        Fraction.dif(dr1, dr2);
        Fraction.mult(dr1, dr2);
        Fraction.div(dr1, dr2);
        Fraction.red(dr1);
        Fraction mas[] = Fraction.createMas(3);
        Fraction.showMas(mas);
        Fraction arr[] = Fraction.createArr(4, dr1, dr2, dr3, dr4);
        Fraction.showArr(arr);
        Fraction.change(arr);
    }
    public void task6(){
        Vector ob1 = new Vector(1, 1, 4);
        Vector ob2 = new Vector(1, 1, 3);
        Vector.sumV(ob1, ob2);
        Vector.difV(ob1, ob2);
        Vector.multV(ob1, ob2);
        Vector.inc(ob1);
        Vector.dec(ob1);
        Vector arr[] = Vector.createArr(2, ob1, ob2);
        Vector.showArr(arr);
        Vector.corner(arr);
    }
    public void task7(){
        Array el1 = new Array("QWERTY123");
        Array el2 = new Array("QanRTkj32p1Y");
        Array el3 = new Array("asdfg0");
        Array el4 = new Array("stringOne");
        Array el5 = new Array("stringTwo");
        Array elem[] = new Array[3];
        elem[0] = new Array("ABC");
        elem[1] = new Array("19B");
        elem[2] = new Array("qwert91");
        Array.useSymbol(el3, 'b');
        Array.intersection(el1, el2);
        Array.grouping(el2, el3);
        Array.difference(el1, el2);
        Array.addition(el4, el5);
        Array.getNewSymbol(el4, 'I');
        Array.oneOfCouple(elem);
    }
    public void task8(){
        Equation ob = new Equation(2, 2, -6);
        ob.root(ob);
        ob.extremum(ob);
        ob.gap(ob);
        Equation mas[] = Equation.createMas(2);
        Equation.showMas(mas);
        Equation.masSort(mas);
    }


}
