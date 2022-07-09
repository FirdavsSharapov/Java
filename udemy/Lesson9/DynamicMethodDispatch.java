package udemy.Lesson9;

class Super
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super
{
    /* (non-Javadoc)
     * @see udemy.Lesson9.Super#meth2()
     */
    @Override
    public void meth2()
    {
        System.out.println("Sub Meth2");
    }
    
    /**
     * Sub method
     */
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super sup=new Sub();
        sup.meth1();
        sup.meth2();
    }
}
