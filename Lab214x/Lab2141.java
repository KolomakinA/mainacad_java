public class Main {

    public static void main(String[] args) {
	// write your code here
        MyTuple <String, Integer, Long> firstTouple = new MyTuple<String, Integer, Long>("first",12,600000000L);
        MyTuple <Double, String, String> secondTouple = new MyTuple<>(3.14, "second","third");

        System.out.println(firstTouple.getType1field() + firstTouple.getType2field() + firstTouple.getType3field());
        System.out.println(secondTouple.getType1field() + secondTouple.getType2field() + secondTouple.getType3field());
    }
}

class MyTuple <T1, T2, T3> {
    private T1 type1field;
    private T2 type2field;
    private T3 type3field;

    public MyTuple(T1 type1field, T2 type2field, T3 type3field) {
        this.type1field = type1field;
        this.type2field = type2field;
        this.type3field = type3field;
    }

    public T1 getType1field() {
        return type1field;
    }

    public T2 getType2field() {
        return type2field;
    }

    public T3 getType3field() {
        return type3field;
    }
}
