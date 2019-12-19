package core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNonUnique {

    private Map<Integer, Integer> counter = new HashMap<>();


    public Integer run(List<Integer> list){
        Integer totalAmountOfNonUnique = 0;

        for(Integer item : list){
            Integer count = 1;
            Integer valueItem = this.counter.get(item);
            if( valueItem != null){
                count = valueItem + 1;
            }

            if(count.equals(2)){
                totalAmountOfNonUnique++;
            }

            this.counter.put(item, count);
        }
        return totalAmountOfNonUnique;
    }
}
