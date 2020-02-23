package leetcode.sort;


//TODO
public class HeapSort {

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,6,3,1,4};
        heapSort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }

    public static void heapSort(int[] nums){
        int len = nums.length;

        //构建堆
        buildHeap(nums, len);

        for (int i = len - 1; i > 0; i--){

            //将堆顶元素与末位元素调换
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            //数组长度-1 隐藏堆尾元素
            len--;
            //将堆顶元素下沉，目的是将最大的元素浮到堆顶
            sink(nums, 0, len);
        }
    }

    private static void buildHeap(int[] nums, int len){
        for (int i = len / 2; i >= 0; i--){
            sink(nums, i, len);
        }
    }

    /**
     * 下沉调整
     * @param nums 数组
     * @param index 调整位置
     * @param len 数组范围
     */
    private static void sink(int[] nums, int index, int len){
        //左子节点下标
        int leftChild = 2 * index + 1;
        //右子节点下标
        int rightChile = 2 * index + 2;
        //要调整的节点下标
        int present = index;

        //下沉左边
        if (leftChild < len && nums[leftChild] > nums[present]){
            present = leftChild;
        }

        //下沉右边
        if (rightChile < len && nums[rightChile] > nums[present]){
            present = rightChile;
        }

        //如果下标不相等 证明调换过
        if (present != index){
            //交换值
            int temp = nums[index];
            nums[index] = nums[present];
            nums[present] = temp;

            //继续下沉
            sink(nums, present, len);
        }

    }
}
