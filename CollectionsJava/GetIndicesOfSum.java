package CollectionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetIndicesOfSum {
    public static void main(String[] args) {

        System.out.println(getIndices(Arrays.asList(1,2,3),3));
    }

    private static List<Integer> getIndices(List<Integer> asList, int target) {

        Map<Integer, Integer> srcMp = new HashMap<>();

        for (int j = 0; j < asList.size(); j++) {
            srcMp.put(asList.get(j),j);
            
        }
        for (int j = 0; j < asList.size(); j++) {
            // srcMp.put(asList.get(i),i);
            int solutionNumber = target - srcMp.get(j);
            if(srcMp.containsKey(solutionNumber) && srcMp.get(solutionNumber)!=j){
                return Arrays.asList(j,srcMp.get(solutionNumber));

            }
            
        }
        return Arrays.asList(-1,-1);


    }
}
