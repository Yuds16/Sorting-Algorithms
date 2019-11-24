public abstract class Sorter  {

    private int[] unsorted;
    private int[] sorted;

    public Sorter(int[] arr) {
        this.unsorted = copyArray(arr);
    }

    public void printArray(int[] arr) {
        if (arr != null) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("null");
        }
        System.out.println();
    }

    public int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public int[] getUnsorted() {
        return unsorted;
    }

    public int[] getSorted() {
        return sorted;
    }

    public void setSorted(int[] arr) {
        this.sorted = arr;
    }

    public void printArrays() {
        printArray(unsorted);
        printArray(sorted);
    }
}
