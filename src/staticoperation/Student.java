
package staticoperation;
public class Student {
    String name;
    int id;
    static String university="SEU";
    //for static block perpose
    static String Name;
    static int Id;
    static{
        Name="Static";
        Id=1;
    }
    static void staticBlock(){
        System.out.println(Name+"-"+Id);
    }
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    void show(){
        System.out.println(name+"("+id+") From "+university);
    }
    static void staticShow(){
        System.out.println("This Is Static Method");
    }
    
}
