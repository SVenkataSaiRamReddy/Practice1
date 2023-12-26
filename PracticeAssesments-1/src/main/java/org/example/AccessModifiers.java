package org.example;
class DefaultClass{
    void showMessage(){
        System.out.println("DefaultClass-Default Method");
    }
}
public class AccessModifiers
{
    public static void main(String[] args) {
        DefaultClass p=new DefaultClass();
        p.showMessage();
        PublicClass q=new PublicClass();
        q.show();
        //q.myPrivateMethod()-This can't be accessed outside of the class because it is private
        q.usingPrivateMethod();
        ProtectedClass w= new ProtectedClass();
        w.myProtectedMethod();//Calling from the same package
    }

}
