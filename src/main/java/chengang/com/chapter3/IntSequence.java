package chengang.com.chapter3;


public interface IntSequence {
    int next();

    boolean hasNext();

    static IntSequence of(int... x) {
        return new IntSequence() {
            private int index = 0;


            @Override
            public int next() {
                int result;
                if (x == null) {
                    return 0;
                }
                result = x[index];
                index++;
                return result;
            }

            @Override
            public boolean hasNext() {

                // System.out.println(index);
                return x != null && index < x.length;
            }
        };

    }

    static IntSequence constant(int i) {
        return new IntSequence() {
            @Override
            public int next() {
                return i;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }

}
