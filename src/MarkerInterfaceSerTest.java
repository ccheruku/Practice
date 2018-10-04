
// Java program to illustrate Serializable interface 
import java.io.*; 
  
// By implementing Serializable interface 
// we make sure that state of instances of class A 
// can be saved in a file. 
class AB implements Serializable 
{ 
    int i; 
    String s; 
  
    // A class constructor 
    public AB(int i,String s) 
    { 
        this.i = i; 
        this.s = s; 
    } 
} 
  
public class MarkerInterfaceSerTest
{ 
    public static void main(String[] args) 
      throws IOException, ClassNotFoundException 
    { 
        AB a = new AB(20,"GeeksForGeeks"); 
  
        // Serializing 'a' 
        FileOutputStream fos = new FileOutputStream("xyz.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(a); 
  
        // De-serializing 'a' 
        FileInputStream fis = new FileInputStream("xyz.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        AB b = (AB)ois.readObject();//down-casting object 
  
        System.out.println(b.i+" "+b.s); 
  
        // closing streams 
        oos.close(); 
        ois.close(); 
    } 
} 