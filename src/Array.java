public class Array {
    private String arr;

    public Array(String arr) {
        this.arr = arr;
    }

    public Array() {

    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Множество: " + arr;
    }

    public static void useSymbol(Array m, char v) {
        System.out.println();
        int t = 0;
        for (int i = 0; i < m.arr.length(); i++) {
            if (m.arr.indexOf(v) !=-1) {
                System.out.println("Символ " + v + " присутствует в строке.");
                t++;
                break;
            }
        }
        if (t == 0) {
            System.out.println("В строке нет такого символа.");
        }
    }

    public static void intersection(Array m, Array v) {
        System.out.println();
        int t = 0;
        char o = ' ';
        String one = "";
        for (int i = 0; i < m.arr.length(); i++) {
            for (int j = 0; j < v.arr.length(); j++) {
                if (m.arr.charAt(i) == v.arr.charAt(j)) {
                    o = m.arr.charAt(i);
                    one = one + o;
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        } else if (t > 0) {
            System.out.println("Общие символы множеств: \n"+one);
        }
        System.out.println();
    }

    public static void grouping(Array m, Array v) {
        System.out.println();
        String t1 = m.arr;
        String t2 = v.arr;
        m.arr=(t1 + t2);
        v.arr=(t1 + t2);
        System.out.println("Первое множество после объединения: " + m.arr);
        System.out.println("Второе множество после объединения: " + v.arr);
    }

    public static void difference(Array m, Array v) {
        System.out.println();
        int t = 0, ind = 0;
        String one = m.arr;
        for (int i = 0; i < m.arr.length(); i++) {
            for (int j = 0; j < v.arr.length(); j++) {
                if (m.arr.charAt(i) == v.arr.charAt(j)) {
                    ind = i - t;
                    one = removeCharAt(one, ind);
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("Пересечения в данных множествах отсутствуют.");
        } else if (t > 0) {
            m.arr=one;
            System.out.println("Разность двух множеств: " + m.arr);
        }
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }//substring возвр строку от 0(индекс начала) до pos(индекс конца)

    public static void addition(Array m, Array v) {
        System.out.println();
        System.out.println("Результат сложения множеств: " + m.arr + v.arr);
    }

    public static void getNewSymbol(Array m, char v) {
        System.out.println();
        m.setArr(m.arr + v);
        System.out.println("Множество после добавление символа: " + m.arr);
    }

    public static void oneOfCouple(Array m[]) {
        System.out.println();
        String all = "";
        int t = 0, x = 0, ind = 0;
        for (int i = 0; i < m.length; i++) {
            all = all + m[i].arr;
        }
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m[i].arr.length(); j++) {
                for (int k = 0; k < m[i + 1].arr.length(); k++) {
                    if (m[i].arr.charAt(j) == m[i + 1].arr.charAt(k)) {
                        ind = x - t;
                        all = removeCharAt(all, ind);
                        t++;
                    }
                }
                x++;
            }
        }
        System.out.println("Сортировка множество попарно: " + all);
    }
    protected void finalize (){
        System.out.println("i work");
    }
}
