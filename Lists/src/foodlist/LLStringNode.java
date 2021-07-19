package foodlist;

public class LLStringNode {
	
	private String info;
	private LLStringNode next;
	
	public LLStringNode(String info) {
	  this.info = info;
	  next = null;
	}
	 
	public void setInfo(String info) {
	    this.info = info;
    }

	public String getInfo() {
	    return info;
    }
	 
	public void setNext(LLStringNode next) {
	    this.next = next;
	}

	public LLStringNode getNext() {
	    return next;
	}

}
