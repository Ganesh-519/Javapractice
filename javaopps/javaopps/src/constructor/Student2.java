package constructor;

class Student2{  
    int id;  
    String name;  
    Student2(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student2 s1 = new Student2(11,"ganga");  
    Student2 s2 = new Student2(22,"Aryan");    
    s1.display();  
    s2.display();  
   }  
}  
