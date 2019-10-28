import java.util.Scanner;
public class Fraction {
    public int m, n;

    public Fraction() {}
    public Fraction(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public static int nod(Fraction dr1, Fraction dr2) {
        int q = dr1.n, w = dr2.n;
        if (q == 0) {
            return w;
        }
        while (w != 0) {
            if (q > w)
                q = q - w;
            else
                w = w - q;
        }
        return q;
    }
    public static int nod(Fraction dr1) {
        int q = dr1.m, w = dr1.n;
        if (q == 0)
            return w;

        while (w != 0) {
            if (q > w)
                q = q - w;
            else
                w = w - q;
        }
        return q;
    }

    public static int nok(Fraction dr1, Fraction dr2) {
        int z = (dr1.n * dr2.n) / (Fraction.nod(dr1, dr2));
        return z;
    }
    public static void sum(Fraction dr1, Fraction dr2) {
        int s = dr1.m * Fraction.nok(dr1, dr2) / dr1.n + dr2.m * Fraction.nok(dr1, dr2) / dr2.n;
        System.out.println("sum: " + s + "/" + Fraction.nok(dr1, dr2));
    }
    public static void dif(Fraction dr1, Fraction dr2) {
        int d = dr1.m * Fraction.nok(dr1, dr2) / dr1.n - dr2.m * Fraction.nok(dr1, dr2) / dr2.n;
        System.out.println("difference: " + d + "/" + Fraction.nok(dr1, dr2));
    }
    public static void mult(Fraction dr1, Fraction dr2) {
        int m1 = dr1.m * dr2.m;
        int m2 = dr1.n * dr2.n;
        System.out.println("multiplication: " + m1 + "/" + m2);
    }
    public static void div(Fraction dr1, Fraction dr2) {
        int d1 = dr1.m * dr2.n;
        int d2 = dr1.n * dr2.m;
        System.out.println("division: " + d1 + "/" + d2);
    }
    public static void red(Fraction dr1) {
        if (Fraction.nod(dr1) != 1) {
            int q, w;
            q = dr1.m / Fraction.nod(dr1);
            w = dr1.n / Fraction.nod(dr1);
            System.out.println("reduction: " + q + "/" + w);
        } else {
            System.out.println("reduction: дробь несокращаемая");
        }
    }
    public void show() {
        System.out.print(m + "/" + n + ", ");
    }
    public void create() {
        System.out.print("введите числитель: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            System.out.print("введите знаменатель: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }
        }

    }
    public static Fraction[] createMas(int t) {
        Fraction mas[] = new Fraction[t];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Fraction();
            mas[i].create();
        }
        return mas;
    }
    public static void showMas(Fraction[] mas) {
        System.out.println("Array");
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }
    //перестановка в массиве
    public static Fraction[] createArr(int t, Fraction dr1, Fraction dr2, Fraction dr3, Fraction dr4) {
        Fraction arr[] = new Fraction[t];
        arr[0] = dr1;
        arr[1] = dr2;
        arr[2] = dr3;
        arr[3] = dr4;
        return arr;
    }
    public static void showArr(Fraction[] arr) {
        System.out.println("Замена");
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
        System.out.println();
    }
    public static int nod(Fraction[] arr) {
        int nod, q, w;
        q = arr[1].n;
        w = arr[2].n;
        if (q == 0)
            nod = w;

        while (w != 0) {
            if (q > w)
                q = q - w;
            else
                w = w - q;
        }
        nod = q;
        return nod;
    }
    public static int nok(Fraction[] arr) {
        int z = (arr[1].n * arr[2].n) / (Fraction.nod(arr[1], arr[2]));
        return z;
    }

    public static void change(Fraction[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (i % 2 == 0 && i!=0) {
                arr[i].m = arr[i].m * Fraction.nok(arr[i], arr[i+1]) / arr[i].n + arr[i+1].m * Fraction.nok(arr[i], arr[i+1]) / arr[i+1].n;
                arr[i].n = Fraction.nok(arr[i], arr[i+1]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }

    }
    protected void finalize (){
        System.out.println("i work");
    }

}
