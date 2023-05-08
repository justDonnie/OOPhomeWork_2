import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      MyClass myClass = new MyClass("James","Gosling",54,new String[]{"English","SoftSkills","Tech","Session"},"samsy");
        System.out.println(myClass.firstName+" "+myClass.lastName+" "+myClass.age+" "+(Arrays.toString(myClass.lessons)+" "+myClass.food));

      MyClass myClass1 = new MyClass();
      myClass1.firstName = "James";
      myClass1.lastName = "Bond";
      myClass1.age = 34;
      myClass1.lessons = new String[]{"English","Tech","Session"};
      myClass1.food = "Manty";
        System.out.println(myClass1.firstName+" "+myClass1.lastName+" "+myClass1.age+" "+(Arrays.toString(myClass1.lessons)+" "+myClass1.food));






    }
}