/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author HieuM */
public  class Multiplication extends BlnanyExpression{
    Expression left, right;
    public Multiplication(Expression right , Expression left){
        this.left= left;
        this.right= right;
    } 
    @Override
    public Expression left(){
        return left;
    }
    @Override
    public Expression right(){
        return right;
    }
    @Override
    public String toString(){
        return right.toString()+"*"+ left.toString();
    }
    @Override
    public int evaluete(){
        return left.evaluete()*right.evaluete();
    }
}
