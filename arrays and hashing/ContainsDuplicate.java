import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // create hashset to store element from array
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // iterate through each element in the array

        for (int num : nums) {
            // check if element is already in the hashset
            if (uniqueNumbers.contains(num)) {
                return true;
            }
            uniqueNumbers.add(num);
        }

        return false; // No duplicates found
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        ContainsDuplicate dc = new ContainsDuplicate();
        System.out.println(dc.containsDuplicate(nums));
    }

}