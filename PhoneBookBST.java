/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

class PhoneBookBST {

    private Node root;
    private int size;

    public PhoneBookBST() {
        root = null;
        size = 0;
    }

    public void insert(Contact contact) {
        root = insertRec(root, contact);
    }

    private Node insertRec(Node root, Contact contact) {

        if (root == null) {
            size++;
            return new Node(contact);
        }

        if (contact.personName.compareToIgnoreCase(root.data.personName) < 0) {
            root.left = insertRec(root.left, contact);
        } 
        else if (contact.personName.compareToIgnoreCase(root.data.personName) > 0) {
            root.right = insertRec(root.right, contact);
        } 
        else {
            System.out.println("Contact already exists!");
        }

        return root;
    }

    private Node searchRec(Node root, String name) {

        if (root == null || root.data.personName.equalsIgnoreCase(name))
            return root;

        if (name.compareToIgnoreCase(root.data.personName) < 0)
            return searchRec(root.left, name);
        else
            return searchRec(root.right, name);
    }

    public void search(String name) {

        Node result = searchRec(root, name);

        if (result != null) {
            System.out.println("Found: " + result.data.personName + " " + result.data.phoneNumber);
        } else {
            System.out.println("Not found!");
        }
    }

    public int size() {
        return size;
    }
}