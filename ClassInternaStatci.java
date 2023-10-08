package com.intermiedo;

class ExternaStatica {
    public void foo() {
        System.out.println("Foo");
    }
     static class  InternalStac{
       void bar(){
           System.out.println("Bar");
       }

    }
}

public class ClassInternaStatci {
    public static void main(String[] args) {
        ExternaStatica.InternalStac obj = new ExternaStatica.InternalStac();
        obj.bar();
    }
}
