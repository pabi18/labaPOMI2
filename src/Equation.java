public class Equation {
    public int a, b, c;

    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Equation() {
    }

    public double root(Equation ob) {
        double d = Math.pow(2, b) - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень уравнения: " + x1 + ", второй корень уравнения: " + x2);
            if (x1 > x2) {
                return x1;
            } else {
                return x2;
            }
        } else {
            if (d == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Корень уравнения: " + x);
                return x;
            } else {
                System.out.println("Корни отсутствуют");
                return 0;
            }
        }
    }
    public double extremum(Equation ob) {
        if (a > 0) {
            double minx = -b / (2 * a);
            double miny = a * Math.pow(minx,2) + b * minx + c;
            System.out.println("Координаты минимума уравнения: (" + minx + "," + miny + ")");
            return minx;
        } else {
            if (a < 0) {
                double maxx = -b / (2 * a);
                double maxy = a * Math.pow(maxx,2) + b * maxx + c;
                System.out.println("Координаты максимума уравнения: (" + maxx + "," + maxy + ")");
                return maxx;
            } else {
                System.out.println("У уравнения нет экстремумов");
                return 0;
            }
        }

    }
    public void gap(Equation ob) {
        if (a > 0) {
            System.out.println("Промежуток убывания: (-~," + ob.extremum(ob) + "), промежуток возрастания: (" + ob.extremum(ob) + ",+~)");
        } else {
            if (a < 0) {
                System.out.println("Промежуток возрастания: (-~," + ob.extremum(ob) + "), промежуток убывания: (" + ob.extremum(ob) + ", +~)");
            }
        }
    }
    public static Equation[] createMas(int n) {
        Equation mas[] = new Equation[n];
        mas[0] = new Equation(2, 2, -12);
        mas[1] = new Equation(3, 4, 5);
        return mas;
    }
    public static void showMas(Equation[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
        System.out.println();
    }
    public void show() {
        System.out.println(a + "x^2+" + b + "x+" + c + " = 0");
    }
    public static void masSort(Equation[] mas) {
        double max = mas[0].root(mas[0]);
        int indexi = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i].root(mas[i]) < mas[j].root(mas[j])) {
                    max = mas[j].root(mas[j]);
                    indexi = j;
                }
            }
        }
        System.out.print("Наибольший корень: " + max + " у уравнения: ");
        mas[indexi].show();
    }

    protected void finalize (){
        System.out.println("i work");
    }
}
