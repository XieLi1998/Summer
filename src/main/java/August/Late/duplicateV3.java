package August.Late;

/**
 * Created by xieli on 2020/8/15.
 */
public class duplicateV3 {

    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0)
            return false;

        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, numbers[i], i);
            }
        }
        return false;
    }

    private void swap(int numbers[], int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}
