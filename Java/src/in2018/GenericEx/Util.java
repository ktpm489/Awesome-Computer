package in2018.GenericEx;

class Util {
    static <T> Box2<T> boxing(T t) {
        Box2<T> box = new Box2<>();
        box.setT(t);
        return box;
    }

    static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
