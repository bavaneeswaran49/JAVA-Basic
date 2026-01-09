abstract class Search {
    abstract void linearSearch(int arr[], int key);
}
class LinearSearch extends Search {
    void linearSearch(int arr[], int key) {
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                int ab=i+1;
                System.out.println("Element found at index: " + ab);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found");
        }
    }
}
public class Linear {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int key = 10;
        Search s = new LinearSearch(); 
        s.linearSearch(arr, key);
    }
}
