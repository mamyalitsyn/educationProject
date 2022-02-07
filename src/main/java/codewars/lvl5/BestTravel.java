package codewars.lvl5;

import java.util.List;

/**
 * Best travel
 * @see <a href="https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa/">Kata link</a>
 * <p>
 * Which distances, hence which towns,
 * they will choose so that the sum of the distances is the biggest possible to please Mary and John?
 */
public class BestTravel {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int result = -1;
        for (int i = 0; i < ls.size(); ++i) {
            if (ls.get(i) <= t){
                if(k == 1){
                    result = Math.max(result, ls.get(i));
                }
                else{
                    Integer temp = chooseBestSum(t-ls.get(i),k-1,ls.subList(i+1, ls.size()));
                    if (temp!=null){
                        result=Math.max(result, ls.get(i)+temp);
                    }
                }
            }
        }
        return result < 0 ? null : result;
    }
}