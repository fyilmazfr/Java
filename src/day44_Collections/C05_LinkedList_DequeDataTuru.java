package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    //double ended Que
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList<>();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("tevfik");
        ll4.add("selim");

        ll4.removeLastOccurrence("selim");//son kullanilan selim'i silecek
        System.out.println(ll4);//[cavidan, mesut, tevfik]
        //System.out.println(ll4.pop());
        //linked list'in basindaki elementi silip bize dondurur
                //hepsinden 3 'er method vardir
        ll4.remove();//CAVIDAN
        ll4.removeFirst();
        ll4.removeLast();
        //deque iki tarfali queue demektir, dolayisiyla her method'un first ve last'i vardir


    }
}
