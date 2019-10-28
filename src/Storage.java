public class Storage {
    private int kol;
    private double cost;
    private String item;
    public static int k;
    public static double c;

    public Storage() {}
    public Storage(String item, int kol, double cost) {
        this.item = item;
        this.kol = kol;
        this.cost = cost;
    }
    public int getKol() {
        return kol;
    }
    public void setKol(int kol) {
        this.kol = kol;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    @Override
    public String toString() {
        return "Storage [kol=" + kol + ", cost=" + cost + ", item=" + item + "]";
    }
    public void show() {
        System.out.println("item: " + this.item + ", kol: " + kol + ", cost: " + cost);
    }


    public static Storage[] createArr(int n) {
        Storage arr[] = new Storage[n];
        arr[0] = new Storage("Table", 11, 11);
        arr[1] = new Storage("Cap", 22, 22);
        arr[2] = new Storage("Computer", 33, 33);
        return arr;
    }
    public static void showArr(Storage[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
        System.out.println();
    }

    public static void spisDiff(Storage[] arr, int difference, String name) {
        int k;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].item.equals(name)){
                arr[i].kol += difference;
                System.out.print("Обновленные данные ");
                arr[i].show();
            }

        }
    }

    public static void spisCost(Storage[] arr, int difference, String name) {
        int k;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].item.equals(name)){
                arr[i].cost += difference;
                System.out.print("Обновленные данные ");
                arr[i].show();
            }

        }
    }

    public static void spisB(Storage[] arr) {
        for (int i = 0; i < arr.length; i++) {
            double allcost = arr[i].kol * arr[i].cost;
            System.out.println("item: " + arr[i].item + ", allcost: " + allcost);
        }
    }
    public static void spisC(Storage[] arr) {
        double max = arr[0].cost;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].cost> max) {
                max = arr[i].cost;
            }

        }
        System.out.println("Максимальная цена: " + max);
    }
    public static void spisD(int...v) {
        int sum = 0;
        for (int x: v) {
            sum += x;
        }
        System.out.println("Общее количество товара: " + sum);
    }
    protected void finalize (){
        System.out.println("i work");
    }

}
