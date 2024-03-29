package codewars.lvl4;

/**
 * Snail Sort
 * @see <a href="https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/">Kata link</a>
 * <p>
 * Given an n x n array,
 * return the array elements arranged from outermost elements to the middle element, traveling clockwise.
 */
public class SnailSort {
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        int n = array.length;
        int[] answer = new int[n*n];
        int index = 0;
        for (int i = 0; i<n/2; i++){
            for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
            for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
            for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
        }
        if (n%2 != 0) answer[index++] = array[n/2][n/2];
        return answer;
    }
}
