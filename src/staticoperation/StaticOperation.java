package staticoperation;
public class StaticOperation {

    public static void main(String[] args) {
        Student st=new Student("Al-Amin",268);
        st.show();
        //Only Use university variable. Note: No need for creating object
        System.out.println("Static : "+Student.university);
        //Show Static Method
        Student.staticShow();
        //show static block
        Student.staticBlock();
    }
    
}
