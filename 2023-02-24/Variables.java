/*
 * WAP to demonstrate encapsulation in Java. 
 * input:
 * variables:name,gender,age,height.
 * code..............
 */
public class Variables {
    String name;
    String gender;
    int age;
    double height;
    public static void main (String []args){
        Variables v=new  Variables();
        v.name="Rohit Dhakal";
        v.gender="M";
        v.age=17;
        v.height= 5.7;
        System.out.println("My name is:"+v.name);
        System.out.println("gender:"+v.gender);
        System.out.println("age:"+v.age);
        System.out.println("height:"+v.height);
    }
    
}
/*
 * output: My name is:Rohit Dhakal
 *gender:M
 *age:17
 *height:5.7
 * exaplanaion:
 * I created a Variables class. And then I created properties of that class ans assigned values to those properties
 * using object of that class.
 * 
 */