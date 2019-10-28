import java.util.Scanner;
public class Book {
    private String author, name;
    private int year, kol;
    public Book() {}
    public Book(String author, String name, int year, int kol) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.kol = kol;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getKol() {
        return kol;
    }
    public void setKol(int kol) {
        this.kol = kol;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", year=" + year + ", kol=" + kol + "]";
    }

    public void show() {
        System.out.println("author: " + author + ", name: " + name + ", year: " + year + ", kol: " + kol);
    }

    public static Book[] createMas(int n) {
        Book mas[] = new Book[n];
        mas[0] = new Book("Fastovec", "Praktic", 1999, 200);
        mas[1] = new Book("Podgornaya", "English", 2000, 50);
        return mas;
    }
    public static void showMas(Book[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }
    //replaceAll класс String. Первый параметр- поле(строка), второй - то чем строка, которой заменят предыдущую
    //другими словами — метод позволяет заменить слово в строке.
    public static void spisA1(Book[] mas) {
        System.out.println("Изменение автора");
        for (int i = 0; i < mas.length; i++) {
            mas[i].author = mas[i].author.replaceAll(mas[i].author, "Fandeev");
            mas[i].show();
        }
        System.out.println();
    }
    public static void spisA2(Book[] mas) {
        System.out.println("Изменение названия");
        for (int i = 0; i < mas.length; i++) {
            mas[i].name = mas[i].name.replaceAll(mas[i].name, "Star");
            mas[i].show();
        }
        System.out.println();
    }
    public static void spisA3(Book[] mas, String name, String author, int newYear) {
        System.out.println("Замена года");
        for (int i = 0; i < mas.length; i++) {
            if(name.equals(mas[i].name)){
                if(author.equals(mas[i].author)){
                    mas[i].year = newYear;
                    mas[i].show();
                }
            }
            System.out.println();
        }
    }
    public static void spisA4(Book[] mas, String name, String author, int newKolPage) {
        System.out.println("Замена количества страниц");
        for (int i = 0; i < mas.length; i++) {
            if (name.equals(mas[i].name)) {
                if (author.equals(mas[i].author)) {
                    mas[i].kol = newKolPage;
                    mas[i].show();
                }
            }
            System.out.println();
        }
    }

    public static void spisB(Book[] mas) {
        String a;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        if (sc.hasNextLine()) {
            a = sc.nextLine();
            for (int i = 0; i < mas.length; i++) {
                if (a.equals(mas[i].name)) {
                    mas[i].show();
                    b++;
                }
            }
            if (b == 0) {
                System.out.println("Данной книги нет");
            }
        }

    }

    public static void spisA1(Book[] mas, String x, String t) {
        int b = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите книгу,автора которой хотите изменить: ");
        if (sc.hasNextLine()) {
            x = sc.nextLine();
            for (int i = 0; i < mas.length; i++) {
                if (x.equals(mas[i].name)) {
                    System.out.print("Введите нового автора книги: ");
                    if (sc.hasNextLine()) {
                        t = sc.nextLine();
                        mas[i].author = mas[i].author.replaceAll(mas[i].author, t);
                        mas[i].show();
                        b++;
                        break;
                    }
                }
            }
            if (b == 0) {
                System.out.println("Данной книги нет");
            }
        }
    }

    public static void spisA2(Book[] mas, String x, String t) {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите книгу,название которой хотите изменить: ");
        if (sc.hasNextLine()) {
            x = sc.nextLine();
            for (int i = 0; i < mas.length; i++) {
                if (x.equals(mas[i].getName())) {
                    System.out.print("Введите новое название книги: ");
                    if (sc.hasNextLine()) {
                        t = sc.nextLine();
                        mas[i].name = mas[i].name.replaceAll(mas[i].name, t);
                        mas[i].show();
                        b++;
                        break;
                    }

                }
            }
            if (b == 0) {
                System.out.println("Данной книги нет");
            }
        }
    }
    public static void spisA3(Book[] mas, String x, int p) {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите книгу,год издание которой хотите изменить: ");
        if (sc.hasNextLine()) {
            x = sc.nextLine();
            for (int i = 0; i < mas.length; i++) {
                if (x.equals(mas[i].getName())) {
                    System.out.print("Введите новый год издания книги: ");
                    if (sc.hasNextInt()) {
                        p = sc.nextInt();
                        mas[i].year = p;
                        mas[i].show();
                        b++;
                        break;
                    }

                }
            }
            if (b == 0) {
                System.out.println("Данной книги нет");
            }
        }
    }
    public static void spisA4(Book[] mas, String x, int p) {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите книгу,количество страниц которой хотите изменить: ");
        if (sc.hasNextLine()) {
            x = sc.nextLine();
            for (int i = 0; i < mas.length; i++) {
                if (x.equals(mas[i].getName())) {
                    System.out.print("Введите новое количество страниц книги: ");
                    if (sc.hasNextInt()) {
                        p = sc.nextInt();
                        mas[i].kol = p;
                        mas[i].show();
                        b++;
                        break;
                    }
                }
            }
            if (b == 0) {
                System.out.println("Данной книги нет");
            }
        }
    }

    protected void finalize (){
        System.out.println("i work");
    }
}
