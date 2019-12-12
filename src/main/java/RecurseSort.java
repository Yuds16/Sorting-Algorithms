/**
 * This recurse sorting swaps only 2 numbers at a time before searching through again.
 * Breaks because of StackOverflowError if array size around 40 (less recursions needed if lucky).
 */
public class RecurseSort extends Sorter {

    public RecurseSort(int[] arr) {
        super(arr);
        setStartTime();
        sort(copyArray(arr), 0);
    }

    public void sort(int[] arr, int x) {
        if (x < arr.length - 1) {
            if (arr[x] > arr[x + 1]) {
                int j = arr[x];
                arr[x] = arr[x + 1];
                arr[x + 1] = j;
                sort(arr, 0);
            } else {
                sort(arr, x + 1);
            }
        } else {
            setSorted(arr);
            setDuration();
        }
    }
}
