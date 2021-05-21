
package com.ashvin.shape;

public class Circle extends Shape {

    Circle(int dim1 ,int dim2){
        super(dim1 , dim2);
    }
    public double area(){
        return Math.PI * this.dim1 * this.dim1;
    }
}