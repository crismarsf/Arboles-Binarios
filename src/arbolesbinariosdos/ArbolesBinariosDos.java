/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesbinariosdos;

import java.util.Optional;
import java.util.*;
/**
 *
 * @author crist
 */
public class ArbolesBinariosDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseNodo raiz = new ClaseNodo(10);
            raiz.add(5);
            raiz.add(3);
            raiz.add(7);
        
        Optional<ClaseNodo> result = raiz.find(10);
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Valor no encontrado");
        }
        result = raiz.find(5);
        if(result.isPresent()){
            System.out.println(result.get());
        }else{
            System.out.println("Valor no encontrado");
        }
        
        System.out.println("Imprimir en orden");
        raiz.printInOrder();
        System.out.println("Imprimir en posorden");
        raiz.printPosOrder();
        System.out.println("Imprimir en preorden");
        raiz.printPreOrder();
    }
    
}
