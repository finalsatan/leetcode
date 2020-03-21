class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(null==arr || k<=0){
            return new int[0];
        }

        int[] mins = new int[k];
        int len = arr.length;
        for(int i=0;i<k;i++){
            int minIndex = i;
            for(int j=i;j<len;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            
            mins[i] = arr[minIndex];
            swap(arr,i,minIndex);
        }

        return mins;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}