public class singleNumberSolution {
    public int singleNumber(int[] nums) {
        int len=nums.length;
        int res=0;
        for(int i=0;i<len;i++){
            res^=nums[i];
        }
        return res;
    }
}
