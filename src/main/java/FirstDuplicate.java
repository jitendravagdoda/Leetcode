public class FirstDuplicate {
    public static void main(String args[]){
        int nums[]={2,3,5,3,2};
        System.out.println(new FirstDuplicate().helper(nums));
    }
    public int helper(int nums[]){

        for(int i=0; i<nums.length; i++){
            if(nums[Math.abs(nums[i])-1]<0)
                return Math.abs(nums[i]);
            else
                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        }
        return -1;
    }
}