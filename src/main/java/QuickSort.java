public class QuickSort extends Sorter {

    public QuickSort(int[] arr) {
        super(arr);
        setStartTime();
        sort(copyArray(arr), 0, arr.length - 1);
    }

    public void sort(int[] arr, int first, int last) {
        if (first < last) {
            int part = partition(arr, first, last);
            sort(arr, first, part - 1);
            sort(arr, part + 1, last);
            setDuration();
            setSorted(arr);
        }
    }

    public int partition(int[] arr, int first, int last) {
        int part = arr[last];
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (arr[j] <= part) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;

        return i+1;
    }
}
