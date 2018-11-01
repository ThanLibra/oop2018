/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author HieuM */
public class Numeral extends Expression{
    int numeral;
    public Numeral(){}
    public Numeral(int numeral){
        this.numeral= numeral;        
    }
    @Override
    public String toString(){
        return Integer.toString(this.numeral);
    }
    @Override
    public int evaluete(){
        return this.numeral;
    }
}
