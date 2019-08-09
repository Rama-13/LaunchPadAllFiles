package basics;

class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
        
        BC bc = new BC();
        DoPrint(bc);
        bc = new DC();
        DoPrint(bc);
        DoPrint(bc);
      
        
      
        
//Your Code Goes Here 
    }
}