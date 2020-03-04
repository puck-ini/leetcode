package leetcode.mid;


//75
public class M23 {

    /**
     * 三指针 p0指向0的边界，p2指向2的边界，curr指向当前扫描到的位置，一开始p0 = 0，p2 = len -1
     *简单说是将原数组分成三个小数组，一边扫描分别放入0，1，2
     */
    public void sortColors(int[] nums) {
        // 对于所有 idx < i : nums[idx < i] = 0
        // j是当前考虑元素的下标
        int p0 = 0, curr = 0;
        // 对于所有 idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 交换第 p0个和第curr个元素
                // i++，j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }
            else if (nums[curr] == 2) {
                // 交换第k个和第curr个元素
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2]; //curr不++的原因是，交换过后新的值curr没有扫描到
                nums[p2--] = tmp;
            }
            else {
                curr++;
            }
        }
    }
}
