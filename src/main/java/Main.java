import java.util.*;

public class Main {

    List<Sorter> sorter;
    int bound = 100;
    int size = 500;

    public Main() {
        sorter = new ArrayList<>();
    }

    public int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public void run() {
        int[] arr1 = createArray(35);
        int[] arr2 = createArray(size);

        BubbleSort bubbleSort1 = new BubbleSort(arr1);
        sorter.add(bubbleSort1);
        bubbleSort1.printInfo();

        HeapSort heapSort1 = new HeapSort(arr1);
        heapSort1.printInfo();

        RecurseSort recurseSort1 = new RecurseSort(arr1);
        recurseSort1.printInfo();

        BubbleSort bubbleSort2 = new BubbleSort(arr2);
        bubbleSort2.printInfo();

        HeapSort heapSort2 = new HeapSort(arr2);
        heapSort2.printInfo();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
