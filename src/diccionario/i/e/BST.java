/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario.i.e;

import java.util.Queue;
import javafx.scene.Node;

/**
 *
 * @author ottoalexander
 */
class BST {
   protected BSTNode root = null;
    
    public BST(){
        root = null; }
    
    public void clear(){
        root = null;}
    
     public boolean isEmpty() {
        return root == null;}
     
     public void insert(String word) {
BSTNode p = root, prev = null;
    while (p != null) {
        prev = p;
        if (p.data.compareTo(word) < 0)
            p = p.right;
        else p = p.left;}
    if (root == null)
        root = new BSTNode(word);
    else if (prev.data.compareTo(word) < 0)
        prev.right = new BSTNode(word);
    else prev.left  = new BSTNode(word);
    }   
}
