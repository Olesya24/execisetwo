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

    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
    So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.*/

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

    /*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     In other words, zero or more characters at the very begining of the given string, and at the very end of the string
     in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".*/

    public String mirrorEnds(String string) {
        int p = string.length() - 1;
        for(int i = 0; i < string.length(); i++, p--)
        {
            if(string.charAt(i) != string.charAt(p))
                return string.substring(0, i);
        }
        return string;
    }

    /*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.*/

    public int[] shiftLeft(int[] nums) {
        if(nums.length >= 2)
        {
            int temp = nums[0];
            for(int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i+1];
            nums[nums.length-1] = temp;
        }
        return nums;
    }

    /*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one
    side is equal to the sum of the numbers on the other side.
     */
    public boolean canBalance(int[] nums) {
        int left = 0;
        int right;
        for(int i = 0; i < nums.length - 1; i++)
            left += nums[i];
        right = nums[nums.length-1];
        for(int i = nums.length - 2; i > 0; i--)
        {
            if(left == right)
                return true;
            left -= nums[i];
            right += nums[i];
        }
        return (left == right);
    }

    /*Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    Return the changed array.
     */

    public int[] fix23(int[] nums) {
        for (int i=0; i<nums.length-1;i++){
            if (nums[i]==2 && nums[i+1]==3) {
                nums[i+1]=0;
            }
        }
        return nums;
    }


    /*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    Return true if all the g's in the given string are happy.
     */
    public boolean gHappy(String str) {
        int check = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'g')
            {
                check = 0;
                if(i > 0)
                {
                    if(str.charAt(i-1) != 'g')
                        check++;
                }
                else
                    check++;
                if(i < str.length()-1)
                {
                    if(str.charAt(i+1) != 'g')
                        check++;
                }
                else
                    check++;
                if(check == 2)
                    return false;
            }
        }
        return true;
    }
}
