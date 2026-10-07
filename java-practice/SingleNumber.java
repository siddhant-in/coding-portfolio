class SingleNumber
{
    public static void main(String x[]){
        SingleNumber sn = new SingleNumber();
        int arr[] = new int[]{1};
        System.out.println(sn.singleNumber(arr));
    }
    public int singleNumber(int[] nums) {
        int single_Element = 0;
        for(int arr : nums){
            single_Element = single_Element ^ arr;
        }
        return single_Element;
    }
}