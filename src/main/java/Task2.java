public class Task2 {
    //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

    public String nonStart(String a, String b) {
        if (a.length()>= 1 && b.length() >= 1) {
        return (a.substring(1) + b.substring(1));
        }
        return "";
    }

    //Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1){
            if (nums[0] == nums[nums.length-1]) {
                return true;
            }
        }
        return false;
    }

    // Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    public boolean more20(int n) {
        if (n >= 0) {
        if (n%20 == 1 || n%20 == 2) {
            return true;
        }
        }
        return false;
    }

    //We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    // Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

    public int makeChocolate(int small, int big, int goal) {
        int maxBig = goal/5;
        if(maxBig <= big)
            goal -= maxBig*5;
        else
            goal -= big*5;
        if(goal <= small)
            return goal;
        return -1;
    }

    //We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
    // So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    // Return true if the given string is xy-balanced.

    public boolean xyBalance(String str) {
        char ch;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            ch = str.charAt(i);
            if(ch == 'x')
                return false;
            else if(ch == 'y')
                return true;
        }
        return true;
    }
}
