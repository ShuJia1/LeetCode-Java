public class hammingDistanceSolution {
    public int hammingDistance(int x, int y) {
        int d = 0;
        // 当 x 和 y 都变成 0 时结束循环
        while (x != 0 || y != 0) {
            // 判断当前最低位是否不同
            if ((x & 1) != (y & 1)) {
                ++d;
            }
            // 使用无符号右移，避免负数死循环
            x >>>= 1;
            y >>>= 1;
        }
        return d;
    }
}
