/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario.i.e;

/**
 *
 * @author ottoalexander y carlos chew
 */
public class BSTNode {
    protected String data;
    protected BSTNode left, right;

    public BSTNode() 
    {
        left = null;
        right = null;
    }

    public BSTNode(String data)
    {
        this(data,null,null);
    }

    public BSTNode(String data, BSTNode lt, BSTNode rt) 
    {
        this.data = data; 
        left = lt; 
        right = rt;
    }
}