/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.NodeMulti;
<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff

/**
 *
 * @author dabri
 */
public class ListCircular {

    private NodeMulti head;
<<<<<<< HEAD
    private NodeMulti tail;
    
    public ListCircular() {
        this.head=null;
        this.tail=null;
=======

    public ListCircular() {
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
    }

    public ListCircular(NodeMulti head) {
        this.head = head;
    }

    public NodeMulti getHead() {
        return head;
    }

    public void setHead(NodeMulti head) {
        this.head = head;
    }

<<<<<<< HEAD
    public void insertarInicio(Movie d) {
        NodeMulti nuevo = new NodeMulti();
        nuevo.data=d;
        if (head == null) {
            head=nuevo;
            head.nextPtr=head;
            nuevo.prevPtr=tail;
            tail=nuevo;
        } else {
            tail.nextPtr=nuevo;
            nuevo.nextPtr=head;
            nuevo.prevPtr=tail;
            tail = nuevo;
            head.prevPtr = tail;

        }
    }

    public void searchNode(Movie d) {
        NodeMulti aux = new NodeMulti();
        aux = tail;
        JOptionPane.showMessageDialog(null, tail);
        boolean found = false;
        do {
            if (aux.data == d) {
                found = true;
                JOptionPane.showMessageDialog(null,"Data "+ d+ " found");   
            }
            aux = aux.prevPtr;
        } while (aux != tail);
        if(found){
         
        }
           else
            JOptionPane.showMessageDialog(null, "Data "+d+ " Not found");
            
    }

=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
    public boolean InsertarOrdenadamente() {
        return false;
    }

    public void printList() {
<<<<<<< HEAD
        NodeMulti aux = new NodeMulti();
        aux = head;
        do {
            System.err.println(aux.data);
            aux=aux.nextPtr;    
        }while(aux!=head);
    
=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
    }

}
