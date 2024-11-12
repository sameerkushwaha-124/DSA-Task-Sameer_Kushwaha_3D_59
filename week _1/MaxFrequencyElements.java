class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        for(int n : nums){
            arr[n]++;
        }
        Arrays.sort(arr);
        int sum = 0;
        sum = sum + arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] == arr[i+1]){
                sum = sum + arr[i];
            }else{
                return sum;
            }
        }
        return -1;
    }
}
