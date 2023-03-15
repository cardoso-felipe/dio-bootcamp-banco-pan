package br.com.felipe.estruturadados.mystack;

public class MyStack {
    
    private Element topElement;
    
    public MyStack() {
        this.topElement = null;
    }

    public void push(Element newElement) {
        Element auxiliaryElement = topElement;
        topElement = newElement;
        topElement.setnode(auxiliaryElement);
    }

    public Element pop() {
        if (!this.isEmpty()) {
            Element poppedElement = topElement;
            topElement = topElement.getnode();
            return poppedElement;
        }
        return null;
    }

    public Element top(){
        return topElement;
    }

    public boolean isEmpty(){        
        return topElement == null ? true : false;
        // if (topElement == null) {
        //     return true;
        // } else {
        //     return false;
        // }
    }

    @Override
    public String toString() {
        
        String text = "-------------------------\n";
        text += "          Pilha\n";
        text += "-------------------------\n";
        
        Element auxiliaryElement = topElement;
        
        while (true) {
            if (auxiliaryElement != null) {
                text += "Element [content= " + auxiliaryElement.getcontent() + "]\n";
                auxiliaryElement = auxiliaryElement.getnode();
            } else {
                break;
            }
        }
                text += "#########################\n";
        return text;
        // return "MyStack [topElement=" + topElement + "]";
    }

    


}
