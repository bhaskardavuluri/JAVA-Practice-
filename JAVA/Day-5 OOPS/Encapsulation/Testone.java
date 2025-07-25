public class Testone {
    private int accbal;
    private String accname;
    public int getaccbal(){
        return  accbal;
    }

    
    public void setaccbal(int bal){
        this.accbal=bal;
    }
    public String getaccname(){
        return accname;
    }
    public void setaccname(String name){
        this.accname=name;
    }
    public static void main(String[] args) {
        Testone t=new Testone();
        t.setaccbal(10000);
        t.setaccname("udaya bhaskar");
        System.out.println(t.getaccbal());
        System.out.println(t.getaccname());
    }
}
