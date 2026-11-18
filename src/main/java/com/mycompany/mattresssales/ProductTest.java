/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;


/**
 *
 * @author Student
 */
public class ProductTest {
    

    // Unit Test 1: Testing the total products sold
    public static void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 18},
            {15, 10, 12},
            {18, 17, 20}
        };

        Product product = new Product(products, sales);

        int expected = 153;
        int actual = product.GetTotalProductsSold();

        if (actual == expected) {
            System.out.println("Test 1 PASSED");
        } else {
            System.out.println("Test 1 FAILED");
        }
    }

    // Unit Test 2: Testing the  average products sold
    public static void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 18},
            {15, 10, 12},
            {18, 17, 20}
        };

        Product product = new Product(products, sales);

        double expected = 17.0;
        double actual = product.GetAverageProductSold();

        if (Math.abs(actual - expected) < 0.0001) {
            System.out.println("Test 2 PASSED");
        } else {
            System.out.println("Test 2 FAILED");
        }
    }

    // Run both unit tests
    public static void main(String[] args) {

        GetTotalProductSales_WithValidData_ReturnsCorrectValue();

        GetAverageSales_WithValidData_ReturnsCorrectValue();
    }
}