package train.tcrn.c15;

public class GenericMethodRefDemo {
  static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
    return f.func(vals, v);
  }

  public static void main(String[] args) {
    Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
    String[] strs = { "One", "Two", "Three", "Two" };
    int count;
    count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
    System.out.println("vals contains " + count + " 4s");
    count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
    System.out.println("strs contains " + count + " Twos");
  }
}

interface MyFunc3<T> {
  int func(T[] vals, T v);
}

class MyArrayOps {
  static <T> int countMatching(T[] vals, T v) {
    int count = 0;
    for (T val : vals) {
      if (val == v) count++;
    }
    return count;
  }
}