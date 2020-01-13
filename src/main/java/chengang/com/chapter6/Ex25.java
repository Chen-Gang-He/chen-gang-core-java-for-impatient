package chengang.com.chapter6;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex25 {
    public static String genericDeclaration(Method m) {
        StringBuilder stringSb = new StringBuilder();
        int modifier = m.getModifiers();
        stringSb.append(String.format("Modifier=[%d]\n", modifier));
        TypeVariable<Method>[] vars = m.getTypeParameters();
        for (TypeVariable<Method> var: vars) {
            stringSb.append(String.format("type parameter name=[%s]\n", var.getName()));
            Type[] bounds = var.getBounds();
            for (Type bound: bounds) {
                if (bound instanceof ParameterizedType) {
                    ParameterizedType p = (ParameterizedType) bound;
                    stringSb.append(String.format("  bound name=[%s]\n", p.getTypeName()));
                    Type[] typeArguments = p.getActualTypeArguments();
                    for (Type typeArgument: typeArguments) {
                        if (typeArgument instanceof WildcardType) {
                            WildcardType wildcardType = (WildcardType) typeArgument;
                            stringSb.append(String.format("    wildcardType=[%s]\n", wildcardType.getTypeName()));
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            Type[] lowerBounds = wildcardType.getLowerBounds();
                            stringSb.append(String.format("      upperBounds=[%s]\n", Arrays.toString(upperBounds)));
                            stringSb.append(String.format("      lowerBounds=[%s]\n", Arrays.toString(lowerBounds)));
                            if (lowerBounds.length > 0) {
                                String lowerDesc = Stream.of(lowerBounds).map(Object::toString).collect(Collectors.joining(","));
                                stringSb.append(String.format("        lowerBoundTypes=[%s]", lowerDesc));
                            }
                        }
                    }

                }
            }
        }
        return stringSb.toString();
    }

    public static void main(String[] args) throws NoSuchMethodException{
        // public static <T> void sort(List<T> list, Comparator<? super T> c) {
        //     list.sort(c);
        // }
        Method m = Collections.class.getMethod("sort", List.class);
        System.out.println(genericDeclaration(m));
    }
}
