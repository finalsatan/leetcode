class Solution {
    /**
     * 问题可以转花为找到m和n使得mx + ny = k，其中m，n可以为正数或负数。
     * 对于这类问题，数学上可以证明只要x，y的最大公约数能整除k，就存在一对
     * m，n实现mx + ny = k。 因此问题就转化为寻找x,y的最大公约数是否能整除k。
     */
    public boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) {
            return true;
        }

        if (x + y < z) {
            return false;
        }

        if (x > y) {
            int min = y;
            y = x;
            x = min;
        }

        if (x == 0) {
            return y == z;
        }

        while (y % x != 0) {
            int v = x;
            x = y % x;
            y = v;
        }

        return z % x == 0;
    }
}