/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Domain.Movie;
/**
 *
 * @author dabri
 */
public class NodeMulti {
      private NodeMulti nextPtr;
      private NodeMulti prevPtr;

    public NodeMulti() {
    }

    public NodeMulti(NodeMulti nextPtr, NodeMulti prevPtr) {
        this.nextPtr = nextPtr;
        this.prevPtr = prevPtr;
    }

    public NodeMulti getNextPtr() {
        return nextPtr;
    }

    public void setNextPtr(NodeMulti nextPtr) {
        this.nextPtr = nextPtr;
    }

    public NodeMulti getPrevPtr() {
        return prevPtr;
    }

    public void setPrevPtr(NodeMulti prevPtr) {
        this.prevPtr = prevPtr;
    }
      
      
    
    
}
