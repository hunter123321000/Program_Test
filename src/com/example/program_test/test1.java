package com.example.program_test;

import org.w3c.dom.Node;

public class test1 {
	public String hasLoop(Node input) {

	    if(input == null)// return null if source data is null 
	        return "null";
	    Node first, last; // new two references.
	    first = last = input; // make both refer to the start of the list(input)
	    while(true) {
	        first = first.getNextSibling();
	        if(last.getNextSibling() != null){
	            last = last.getNextSibling().getNextSibling();
	        }else{//no cycle if next subling is non-exis
	            return "null";           
	        }
	        if(first == null || last == null){//if either hits non_match
	            return "null";
	        }
	        if(first == last){//if both match, there cycle exists
	            return first.getNodeValue();
	        }
	    }
	}
}
