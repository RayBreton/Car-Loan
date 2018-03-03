/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc241hw01;

import java.util.ArrayList;

/**
 *
 * @author Raynier
 */
public class Storage {

     private ArrayList<String> arrayList = new ArrayList<>();
     //private String[] item;
    
    public boolean addItem(String s){
         if(s != null){
        return arrayList.add(s);
         } else {
                return false;
                }
    }
    
    public String [] getItems() {   
        String [] array = arrayList.toArray(new String[arrayList.size()]);
        return array;
    }
            
    public Boolean isFull(){
        if(arrayList.isEmpty()){
        return false;
        } 
        return true;
    }

    
    public Boolean removeItem(String s){
         if(s != null){
        return arrayList.remove(s);
         } else {
                return false;
                }
    }
    
}