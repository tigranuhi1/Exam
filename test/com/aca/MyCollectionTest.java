package com.aca;

public class MyCollectionTest {
    static MyCollection<Integer> values = new MyCollection<>();
    public static void main(String[] args) {

        MyCollectionTest test = new MyCollectionTest();
        test.testAddValue(10);
        test.testAddValue(2);
        test.testAddValue(-1);
        test.testAddAtIndex(2,4);
        test.testAddValue(10);
        test.testAddValue(11);

        test.testGet(0,10);
        test.testGet(4,11);

        test.testContains(-1);
        test.testContains(4);

        test.testRemove(10);
        test.testRemoveAtIndex(0, 2);

        test.testToString();
    }

    private void testAddValue(Integer value) {
        values.add(value);
        assert values.contains(value);
    }

    private void testAddAtIndex(Integer index, Integer value) {
        values.add(index, value);
        assert values.get(index).equals(value);
    }

    private void testGet(Integer index, Integer expected) {
        assert values.get(index).equals(expected);
    }

    public void testContains(Integer value) {
        assert values.contains(value);
    }

    public void testRemove(Integer value) {
        values.remove(value);
        assert !values.contains(value);
    }

    public void testRemoveAtIndex(int index, Integer expected) {
        values.remove(index);
        assert values.size()<index || !values.get(index).equals(expected);
    }

    private void testToString(){
        assert values.toString().equals("4, -1, 11");
    }
}
