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
<<<<<<< HEAD
import javax.swing.JOptionPane;
=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea

/**
 *
 * @author dabri
 */
public class ListCircular {

    private NodeMulti head;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
    private NodeMulti tail;
    
    public ListCircular() {
        this.head=null;
        this.tail=null;
<<<<<<< HEAD
=======
=======

    public ListCircular() {
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
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
=======
<<<<<<< HEAD
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
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

<<<<<<< HEAD
=======
=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
    public boolean InsertarOrdenadamente() {
        return false;
    }

    public void printList() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
        NodeMulti aux = new NodeMulti();
        aux = head;
        do {
            System.err.println(aux.data);
            aux=aux.nextPtr;    
        }while(aux!=head);
    
<<<<<<< HEAD
=======
=======
>>>>>>> a4999e88c921f8e5d53f8e458dbf4804bb99faff
>>>>>>> 836399eb8a7e17fc8f5862520c64eaaaad88d0ea
    }

}
