public static void main(String[] args) {
    TwoSum solution = new TwoSum();

    // Test case 1
    int[] nums1 = {2, 7, 11, 15};
    int target1 = 9;
    int[] result1 = solution.twoSum(nums1, target1);
    System.out.println("Test 1 - Input: [2, 7, 11, 15], Target: 9");
    System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    System.out.println("Values: " + nums1[result1[0]] + " + " + nums1[result1[1]] + " = " + target1);
    System.out.println();

    // Test case 2
    int[] nums2 = {3, 2, 4};
    int target2 = 6;
    int[] result2 = solution.twoSum(nums2, target2);
    System.out.println("Test 2 - Input: [3, 2, 4], Target: 6");
    System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
    System.out.println("Values: " + nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + target2);
    System.out.println();

    // Test case 3
    int[] nums3 = {3, 3};
    int target3 = 6;
    int[] result3 = solution.twoSum(nums3, target3);
    System.out.println("Test 3 - Input: [3, 3], Target: 6");
    System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    System.out.println("Values: " + nums3[result3[0]] + " + " + nums3[result3[1]] + " = " + target3);
}
