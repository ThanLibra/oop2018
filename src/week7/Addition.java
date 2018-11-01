/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author HieuM */
public class Addition extends BlnanyExpression{
    Expression left, right;
    public Addition(Expression right, Expression left){
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
    public int evaluete(){
        return this.left.evaluete()+ this.right.evaluete() ;
    }
    @Override
    public String toString(){
        return this.right.toString()+ " + "+ this.left.toString();
    }
    
    
}
