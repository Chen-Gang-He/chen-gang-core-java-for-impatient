package chengang.com.chapter6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex16 {
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        return Collections.max(coll);
    }

    public static void main(String[] args) {
        String[] words = {"chengang"};
        sort(Arrays.asList(words));
        System.out.println("<T extends Comparable<? super T>> ==> <T::Ljava/lang/Comparable<-TT;>;>");
        System.out.println("<T extends Object & Comparable<? super T>> => ");
         //
         //       {
         // public chengang.com.chapter6.Ex16();
         //           descriptor: ()V
         //           flags: ACC_PUBLIC
         //           Code:
         //           stack=1, locals=1, args_size=1
         //           0: aload_0
         //           1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         //           4: return
         //               LineNumberTable:
         //           line 8: 0
         //           LocalVariableTable:
         //           Start  Length  Slot  Name   Signature
         //           0       5     0  this   Lchengang/com/chapter6/Ex16;
         //
         //           public static <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T>);
         //           descriptor: (Ljava/util/List;)V
         //           flags: ACC_PUBLIC, ACC_STATIC
         //           Code:
         //           stack=1, locals=1, args_size=1
         //           0: aload_0
         //           1: invokestatic  #2                  // Method java/util/Collections.sort:(Ljava/util/List;)V
         //           4: return
         //               LineNumberTable:
         //           line 10: 0
         //           line 11: 4
         //           LocalVariableTable:
         //           Start  Length  Slot  Name   Signature
         //           0       5     0  list   Ljava/util/List;
         //           LocalVariableTypeTable:
         //           Start  Length  Slot  Name   Signature
         //           0       5     0  list   Ljava/util/List<TT;>;
         //           Signature: #24                          // <T::Ljava/lang/Comparable<-TT;>;>(Ljava/util/List<TT;>;)V
         //
         //           public static <T extends java.lang.Object & java.lang.Comparable<? super T>> T max(java.util.Collection<? extends T>);
         //           descriptor: (Ljava/util/Collection;)Ljava/lang/Object;
         //           flags: ACC_PUBLIC, ACC_STATIC
         //           Code:
         //           stack=1, locals=1, args_size=1
         //           0: aload_0
         //           1: invokestatic  #3                  // Method java/util/Collections.max:(Ljava/util/Collection;)Ljava/lang/Object;
         //           4: areturn
         //           LineNumberTable:
         //           line 14: 0
         //           LocalVariableTable:
         //           Start  Length  Slot  Name   Signature
         //           0       5     0  coll   Ljava/util/Collection;
         //           LocalVariableTypeTable:
         //           Start  Length  Slot  Name   Signature
         //           0       5     0  coll   Ljava/util/Collection<+TT;>;
         //           Signature: #30                          // <T:Ljava/lang/Object;:Ljava/lang/Comparable<-TT;>;>(Ljava/util/Collection<+TT;>;)TT;

        }
}
