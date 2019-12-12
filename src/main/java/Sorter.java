import java.time.Duration;
import java.time.Instant;

public abstract class Sorter  {

    private int[] unsorted;
    private int[] sorted;

    private Duration duration;
    private Instant startTime;

    public Sorter(int[] arr) {
        this.unsorted = copyArray(arr);
    }

    /**
     * print arr to terminal
     * @param arr given arr
     */
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

    /**
     * copy given array
     * @param arr to copy
     * @return new int[] duplicate
     */
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

    /**
     * mainly used to replace
     * @param arr to replace sorted array
     */
    public void setSorted(int[] arr) {
        this.sorted = arr;
    }

    public void setStartTime() {
        startTime = Instant.now();
    }

    /** initialize duration by comparing startTime to now */
    public void setDuration() {
        duration = Duration.between(startTime, Instant.now());
    }

    /**
     * get duration after setDuration() in nanoseconds
     * @return long nanoseconds
     */
    public long getDuration() {
        if (duration == null) {
            return 0;
        }
        return duration.toNanos();
    }

    /** print duration to terminal */
    public void printDuration() {
        System.out.println(getDuration() + " nanoseconds");
    }

    /** print to terminal both arrays (sorted and unsorted) */
    public void printArrays() {
        printArray(unsorted);
        printArray(sorted);
    }

    /** print to terminal data concerning the sorting */
    public void printInfo() {
        System.out.println("Array size: " + getUnsorted().length);
        printArrays();
        printDuration();
        System.out.println();
    }
}
