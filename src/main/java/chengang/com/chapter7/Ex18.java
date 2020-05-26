package chengang.com.chapter7;

import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List noTypeEmptyList = Collections.EMPTY_LIST;
        List<Integer> typeEmptyList = Collections.emptyList();
        try {
            typeEmptyList.add(1);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}
