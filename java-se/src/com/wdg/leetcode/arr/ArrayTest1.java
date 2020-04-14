package com.wdg.leetcode.arr;

/**
 * User: wangdaogang
 * Date: 2020/4/14
 * Description: No Description
 */
public class ArrayTest1 {

    /**
     * 去掉重复数据
     *
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * 示例 1:
     *
     * 给定数组 nums = [1,1,2],
     *
     * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * 示例 2:
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     *
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     *
     * 你不需要考虑数组中超出新长度后面的元素。
     */
    /**
     * 官方题解：双指针法
     *
     * 数组完成排序后，我们可以放置两个指针i 和j，其中i 是慢指针，而j 是快指针。只要 nums[i] = nums[j]，我们就增加 j 以跳过重复项。
     * 当我们遇到 nums[j] != nums[i]，跳过重复项的运行已经结束，因此我们必须把它（nums[j]）的值复制到 nums[i + 1]。然后递增 i，接着我们将再次重复相同的过程，直到 j 到达数组的末尾为止。
     *
     * 复杂度分析
     * 时间复杂度：O(n)，假设数组的长度是 n，那么 i 和 j 分别最多遍历 n 步。
     * 空间复杂度：O(1)
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shan-chu-pai-xu-shu-zu-zhong-de-zhong-fu-xiang-by-/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     **/
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    /**
     *      移除元素
     *
     *      给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     *     不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     *     元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     *              
     *
     *     示例 1:
     *
     *     给定 nums = [3,2,2,3], val = 3,
     *
     *     函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
     *
     *     你不需要考虑数组中超出新长度后面的元素。
     *     示例 2:
     *
     *     给定 nums = [0,1,2,2,3,0,4,2], val = 2,
     *
     *     函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
     *
     *     注意这五个元素可为任意顺序。
     *
     *     你不需要考虑数组中超出新长度后面的元素。
     *
     *     来源：力扣（LeetCode）
     *     链接：https://leetcode-cn.com/problems/remove-element
     *     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     */
    public static int removeElement(int[] nums, int val) {
        int count =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;

            }
        }
        return count;
    }


    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0 || haystack == null || haystack.length() == 0){
            return 0;
        }
        char[] arr = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        int flag = -1;
        for(int j = 0;j < arr.length; j++){
            for(int i = 0;i<nee.length ;i++){
                if(arr[j] != nee[i]){
                    flag = -1;
                    break;
                }else{
                    flag = j;
                    if(i == nee.length -1){
                        return flag;
                    }
                }
            }
        }
        return flag;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,5,6};
        int count1 = removeDuplicates(arr);
        int count2 = removeElement(arr,1);
        System.out.println(strStr("hello","ll"));;
    }
}
