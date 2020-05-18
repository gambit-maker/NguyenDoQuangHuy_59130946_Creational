/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author HP
 */
public class ShapeFactory {
    private static Shape instance;

    private ShapeFactory() {
    }
    
    public static Shape createShape(ShapeType type){
        if(instance == null){
            switch(type){
                case Triagle: return new Triagle();                
                case Circle: return new Circle();                
                case Retangle: return new Retangle();                                
            }
        }
        return instance;
    }
    
    
    
}
