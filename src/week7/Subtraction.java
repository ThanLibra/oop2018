/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
 *
 * @author HieuM */
public class Subtraction extends BlnanyExpression{
    Expression left, right;
    public Subtraction (Expression right , Expression left){
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
        return this.right.evaluete()- this.left.evaluete() ;
    }
    @Override
    public String toString(){
        return this.right.toString()+ " - "+ this.left.toString();
    }
}
