package avltree;

public class Node<D> {
	    D value;
	    Integer height;
	    Node left,right;
	    Node(D value){
	        this.value=value;
	        height=0;
	        left=right=null;
	    }
	}


