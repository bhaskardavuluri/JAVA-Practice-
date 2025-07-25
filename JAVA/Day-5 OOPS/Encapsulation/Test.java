public class Test{
    private int age;
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String  name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    
      public static void main(String[] args) {
        Test t=new Test();
        t.setage(21);
        t.setname("bhaskar");
         System.out.println( t.getname());
         System.out.println(t.getage());
    
        
    }
}