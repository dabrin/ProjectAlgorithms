/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.NodeMulti;

/**
 *
 * @author dabri
 */
public class ListCircular {

    private NodeMulti head;

    public ListCircular() {
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

    public boolean InsertarOrdenadamente() {
        return false;
    }

    public void printList() {
    }

}
