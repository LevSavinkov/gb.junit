package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class TriangleSquare {

    public int searchTriangleSquare(int a, int b, int c) throws ErrorExceptiion {
        int result = 0;
        if (a == 0 || b == 0 || c == 0) {
            throw new ErrorExceptiion("Одна из сторон равна 0. Стороны треугольника не могут быть равны 0.");
        } else if (a < 0 || b < 0 || c < 0) {
            throw new ErrorExceptiion("Одна из сторон - отрицательное число. Стороны треугольника не могут быть отрицательными.");
        } else if (realTriangle(a, b, c) == false) {
            throw new ErrorExceptiion("Треугольник не существует");
        } else {
            double p = (double) (a + b + c) / 2;  //сделал отдельной переменной что бы формула по вычесчелинию была более читаема
            result = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }

    private static boolean realTriangle(int a, int b, int c) {
        boolean bool = true;
        if (a + b >= c) {
            if (b + c >= a)
                if (a + c >= b)
                    bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

}
