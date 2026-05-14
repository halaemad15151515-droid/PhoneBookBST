/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

/**
 *
 * @author DELL
 */
public class Node {
    

    Contact data;
    Node left;
    Node right;

    public Node(Contact data) {
        this.data = data;
        left = null;
        right = null;
    }
}