/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
public class PrintProduct {
  

    private Product product;

    // Constructor
    public PrintProduct(Product product) {
        this.product = product;
    }

    // Print total product sales
    public void PrintTotalProductSales() {
        System.out.println("Total Product Sales: "
                + product.GetTotalProductsSold());
    }

    // Print average product sales
    public void PrintAverageProductSales() {
        System.out.println("Average Product Sales: "
                + product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct() {
        System.out.println("Most Popular Product: "
                + product.GetMostPopularProduct());
    }
}
