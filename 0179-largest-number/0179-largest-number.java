class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){

                if((arr[j] + arr[j+1]).compareTo(arr[j+1] + arr[j]) < 0){

                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        if(arr[0].equals("0"))
            return "0";
            
        StringBuilder sb = new StringBuilder();

        for(String s : arr){
            sb.append(s);
        }

        return sb.toString();
    }
}