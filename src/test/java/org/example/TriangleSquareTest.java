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
    public void positiveSearchTriangleSquare() {
        triangle = triangleSquare.searchTriangleSquare(3, 4, 5);
        assertEquals(triangle, tryTriangleSquare, "Площадь искомого треугольника не равна заданному значению");
        System.out.println("Площадь искомого треугольника равна заданному значению");
    }


    @Test
    @DisplayName("Вычисление площади треугольника. Несуществующий треугольник.")
    public void notTriangle () {
        triangle = triangleSquare.searchTriangleSquare(3, 4, 10);
        assertEquals (triangle, 0);
    }

    @Test
    @DisplayName("Вычисление площади треугольника. Одна из сторон равна 0.")
    public void oneSideNull () {
        triangle = triangleSquare.searchTriangleSquare(3, 0, 10);
        assertEquals (triangle, 0);
    }

    @Test
    @DisplayName("Вычисление площади треугольника. Одна из сторон равна 0.")
    public void oneSideNegativeNumber () {
        triangle = triangleSquare.searchTriangleSquare(-3, 4, 10);
        assertEquals (triangle, 0);
    }

}
