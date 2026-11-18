/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales;

import java.util.Scanner;
/**
 *
 * @author Student
 */

public class MattressSales {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // One-dimensional array
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Two-dimensional array
        int[][] sales = new int[3][3];

        // Enter sales for three months
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");
                sales[i][j] = input.nextInt();
            }
        }

        // Creates Product object
        Product product = new Product(products, sales);

        // Showing the sales report
        System.out.println("\nProduct Sales Report - 2026");
        System.out.println("****************************");

        System.out.println("Total Product Sales: "
                + product.GetTotalProductsSold());

        System.out.println("Average Product Sales: "
                + product.GetAverageProductSold());

        System.out.println("Most Popular Product: "
                + product.GetMostPopularProduct());

        input.close();
    }
}
    

