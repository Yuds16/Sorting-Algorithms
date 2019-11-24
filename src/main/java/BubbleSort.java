import java.time.Duration;
import java.time.Instant;

public class BubbleSort extends Sorter {

    private Duration duration;
    private Instant startTime;

    public BubbleSort(int[] arr) {
        super(arr);
        startTime = Instant.now();
        sort(copyArray(arr));
    }

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        duration = Duration.between(startTime, Instant.now());
        setSorted(arr);
    }

    public long getDuration() {
        if (duration == null) {
            return 0;
        }
        return duration.toNanos();
    }

    public void printDuration() {
        System.out.println(getDuration() + " nanoseconds");
    }

    public void printInfo() {
        System.out.println("BubbleSort size: " + getUnsorted().length);
        printArrays();
        printDuration();
        System.out.println();
    }
}
