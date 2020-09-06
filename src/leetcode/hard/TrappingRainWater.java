package leetcode.hard;

public class TrappingRainWater {
    // url : https://leetcode.com/problems/trapping-rain-water/

    public int trap(int[] height) {
        int left = 0, right = height.length - 1, result = 0;

        if (right < 0)
            return result;

        int leftMax = height[left], rightMax = height[right];

        while (left < right) {
            if (height[left] > height[right]) {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    result += (rightMax - height[right]);
                --right;
            } else {
                if (height[left] >= leftMax)
                    leftMax = height[left];
                else
                    result += (leftMax - height[left]);
                ++left;
            }
        }

        return result;
    }
}
