import java.util.*;

public class Main {

    List<Sorter> sorter;

    public Main() {
        sorter = new ArrayList<>();
    }

    public int[] createArray(int size) {
        return createArray(size, 100);
    }

    public int[] createArray(int size, int bound) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public void run() {
        int[] arr1 = createArray(35);
        int[] arr2 = createArray(500, 1000);
        int[] arr3 = createArray(5000, 8000);
        int[] arr4 = createArray(10000, 12000);

        BubbleSort bubbleSort1 = new BubbleSort(arr1);
        sorter.add(bubbleSort1);

        HeapSort heapSort1 = new HeapSort(arr1);
        sorter.add(heapSort1);

        RecurseSort recurseSort1 = new RecurseSort(arr1);
        sorter.add(recurseSort1);

        QuickSort quickSort1 = new QuickSort(arr1);
        sorter.add(quickSort1);

        BubbleSort bubbleSort2 = new BubbleSort(arr2);
        sorter.add(bubbleSort2);

        HeapSort heapSort2 = new HeapSort(arr2);
        sorter.add(heapSort2);

        QuickSort quickSort2 = new QuickSort(arr2);
        sorter.add(quickSort2);

        BubbleSort bubbleSort3 = new BubbleSort(arr3);
        sorter.add(bubbleSort3);

        HeapSort heapSort3 = new HeapSort(arr3);
        sorter.add(heapSort3);

        QuickSort quickSort3 = new QuickSort(arr3);
        sorter.add(quickSort3);

        HeapSort heapSort4 = new HeapSort(arr4);
        sorter.add(heapSort4);

        for (Sorter i : sorter) {
            System.out.println(i.getClass());
            i.printInfo();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
