package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleSquareTest {
    TriangleSquare triangleSquare = new TriangleSquare();
    int triangle;
    int tryTriangleSquare = 6;

    @Test
    @DisplayName("Вычисление площади треугольника. Успех.")
    public void positiveSearchTriangleSquare(){
        try {
            triangle = triangleSquare.searchTriangleSquare(3, 4, 5);
        } catch (ErrorExceptiion e) {
            e.printStackTrace();
        }
        assertEquals(tryTriangleSquare, triangle);
    }


    @Test
    @DisplayName("Вычисление площади треугольника. Несуществующий треугольник.")
    public void notTriangle () {
        try {
            triangle = triangleSquare.searchTriangleSquare(3, 4, 10);
        } catch (ErrorExceptiion e) {
            e.printStackTrace();
        }
        assertEquals (0, triangle);
    }

    @Test
    @DisplayName("Вычисление площади треугольника. Одна из сторон равна 0.")
    public void oneSideNull () {
        try {
            triangle = triangleSquare.searchTriangleSquare(3, 0, 10);
        } catch (ErrorExceptiion e) {
            e.printStackTrace();
        }
        assertEquals (0, triangle);
    }

    @Test
    @DisplayName("Вычисление площади треугольника. Значение однй из сторон отрицательное число.")
    public void oneSideNegativeNumber () {
        try {
            triangle = triangleSquare.searchTriangleSquare(-3, 4, 10);
        } catch (ErrorExceptiion e) {
            e.printStackTrace();
        }
        assertEquals (0, triangle);
    }

}
