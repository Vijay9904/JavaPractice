
package vk;
public class task4 {
    public static class account{
        int  acountno;
        static int totlacount;
        account(){
            totlacount++;
            acountno=totlacount;
        }
        public void display(){
            System.out.println(acountno);
        }
    }
    public static void main(String args[]){
        account a = new account();
        account a2 = new account();
        account a3 = new account();
        account a4 = new account();
        System.out.println(account.totlacount);
        a2.display();
        
    }
    
}
