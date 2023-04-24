
/* 
 * Create a class called Student with different properties and by creating its object print all the details of that student.
 * input: none
 * variables: name,rollno, address
 * 
 */
class StudentInformation{
    String name;
    int rollno;
    String address;
    public static void main(String[] args){
        StudentInformation student=new StudentInformation();
        student.name="Rohit Dhakal";
        student.rollno= 1;
        student.address="Dhakalthok";
        System.out.println("Her name is" +student.name +"with");
        System.out.println("rollno: " +student.rollno);
        System.out.println("address: " +student.address);
    }
}
/*
output: Her name is Rohit Dhakalwith
rollno: 1
address: Dhakalthok
Explation: 
I Created an object of StudentInformation class  and assigned the values  and printed them to the console.

*/