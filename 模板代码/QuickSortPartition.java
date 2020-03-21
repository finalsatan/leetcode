class Solution{

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

}
