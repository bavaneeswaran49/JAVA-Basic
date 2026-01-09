abstract class Table {
    abstract void printTable(int[] arr);
}
class MultiplicationTable extends Table {
    void printTable(int[] arr) {
        for (int num : arr) {
            System.out.println("Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2,5};

        Table obj = new MultiplicationTable();
        obj.printTable(numbers);
    }
}
