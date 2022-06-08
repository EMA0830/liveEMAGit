package com.demo.ocjp;

public class Master {
   public static void main(String[] args) {
      primitiveIntAssignedToZero();
      arrayDeclarations();
   }

   private static void arrayDeclarations() {
      // Variable must provide either dimension expressions or an array initializer
      // int arr[] = new int[];
      // no dimension size in declaring
      // float arr[10] = new float[10];
      double[] arr = new double[10];
      double arr1[] = new double[10];
   }

   private static void primitiveIntAssignedToZero() {
      int arr[] = new int[3];
      // primitives are assigned to 0
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
   }
}

class Test3 {
   public void instanceMethod() {
      System.out.println("Called");
   }

   public static void main(String[] args) {
      // Cannot make a static reference to the non-static method instanceMethod()
      // instanceMethod();
      Test3 test3 = new Test3();
      test3.instanceMethod();
   }
}

class Test5 {
   public void Test5() {
      System.out.println("Constructor1");
   }

   public Test5() {
      System.out.println("Constructor2");
   }

   public static void main(String[] args) {
      // constructor
      Test5 t5 = new Test5();
      // method
      t5.Test5();
   }
}

class Test6 {
   public Test6() {
      // 4 = int
      // The constructor Test6(int) is undefined
      // this(4);
      // 4.5 = double
      // Constructor call must be the first statement in a constructor
      // this(4.5);

      // byte b = 4;
      // Constructor call must be the first statement in a constructor
      // this(b);
      // this((byte)4);
   }

   public Test6(byte var) {
      System.out.println(var);
   }

   public static void main(String[] args) {
      Test6 t6 = new Test6();
   }
}

class Test7 {
   public Test7() {
   }

   public Test7(Test7 ref) {
      this(ref, "Hai");
   }

   public Test7(Test7 ref, String str) {
      ref.Test7(str);
      System.out.println("Hi");
   }

   public void Test7(String str) {
      System.out.println(str);
   }

   public static void main(String[] args) {
      Test7 t = new Test7();
      Test7 t7 = new Test7(t);
   }
}

class Test8 {
   public static void main(String[] args) {
      Test8 test8 = new Test8();

   }
   // public Test8() {
   // }

   // method
   private void Test8() {
   }

   protected Test8(int k) {
   }

   Test8() {
      System.out.println("Test 8");
   }
}

