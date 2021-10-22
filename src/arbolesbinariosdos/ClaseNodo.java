/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinariosdos;

import java.util.Optional;

/**
 *
 * @author crist
 */
public class ClaseNodo {
    private Integer value;
    private ClaseNodo left;
    private ClaseNodo right;
    
    public ClaseNodo(Integer value){
        this.value = value;        
    }
    
    public void add(Integer value){
        if(value < this.value){
            if(left != null){
                left.add(value);
            }else{
                left = new ClaseNodo(value) {};
            }
        }else{
            if(right != null){
                right.add(value);
            }else{
                right = new ClaseNodo(value) {};
            } 
        }
    }
    
    public Optional<ClaseNodo> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
    }
/*    public Optional<Node> find(Integer value){
        if(value == this.value){
            return Optional.of(this);
        }else if(value < this.value){
                if(this.left != null){
                    return this.left.find(value);
                }else{
                    Optional.empty();
                }
        }else{
            if(this.right != null){
                return this.right.find(value);
            }else{
                return Optional.empty();
            }

        }
    }
  */  
    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.println(value);
        if(right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.println(value);
        if(left != null){
            left.printPreOrder();
        }
        if(right != null){
            right.printPreOrder();
        }
    }

    public void printPosOrder(){
        if(left != null){
            left.printPosOrder();
        }
        if(right != null){
            right.printPosOrder();
        }
        System.out.println(value);
    }
//@Override
public String toString(){
    return "Node [value = "+value+" right ="+right+" left = "+left+"]";
} 
 
}