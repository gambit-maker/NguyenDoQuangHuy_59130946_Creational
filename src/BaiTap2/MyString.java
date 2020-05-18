/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author HP
 */
public class MyString {
    String str;

    public MyString(MyStringBuilder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str;
    }
    
    
    
    public static class MyStringBuilder{
        String str;

        public MyStringBuilder() {
        }
        
        public MyStringBuilder addString(String s){
            this.str += s;
            return this;
        }
        
        public MyStringBuilder addFloat(float f){
            this.str += Float.toString(f);
            return this;
        }
        
        public MyStringBuilder addBool(boolean b){
            this.str += Boolean.toString(b);
            return this;
        }
        
        public MyString build(){
            return new MyString(this);
        }
    }
    
}
