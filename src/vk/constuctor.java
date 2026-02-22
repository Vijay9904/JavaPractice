package vk;

public class constuctor{

    public static class Sai {
        int roll;
        String name;
        int age;
       static int count;

       
        Sai(int r, String name1, int a) {
            roll = r;
            name = name1;
            age = a;
            count++;
        }

  
        void display() {
            System.out.println("Roll: " + roll + ", Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Sai s = new Sai(47, "vk", 21);
        Sai s1 = new Sai(47, "vk", 21);
        Sai s2 = new Sai(47, "vk", 21);
        Sai s3 = new Sai(47, "vk", 21);
        s.display(); 
        System.out.println(Sai.count);
    }
}
