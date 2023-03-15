package br.com.felipe.estruturadados.mystack;

public class Element {
    
    private String content;
    private Element node = null;
    
    public Element() {
    }

    public Element(String content) {
        this.content = content;
    }

    public String getcontent() {
        return content;
    }

    public void setcontent(String content) {
        this.content = content;
    }

    public Element getnode() {
        return node;
    }

    public void setnode(Element node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Element [content=" + content + "]";
    }
    
    


}