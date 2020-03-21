class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (null == arr || k <= 0) {
            return new int[0];
        }

        int len = arr.length;
        if (k >= len) {
            return arr;
        }

        int[] mins = new int[k];

        int index = 0;
        int start = 0;
        int end = len - 1;
        while (true) {
            index = partition(arr, start, end);
            if (index == k) {
                System.arraycopy(arr, 0, mins, 0, k);
                break;
            } else if (index < k) {
                start = index + 1;
            } else {
                end = index - 1;
            }
        }

        return mins;
    }

    private int partition(int[] arr, int start, int end) {
        if (start >= end) {
            return start;
        }
        int v = arr[start];
        int front = start;
        int back = end;

        while (true) {
            while (front < end && arr[front] <= v) {
                front += 1;
            }

            while (back > start && arr[back] >= v) {
                back -= 1;
            }

            if (front >= back) {
                break;
            }

            swap(arr, front, back);
        }

        swap(arr, start, back);
        return back;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}