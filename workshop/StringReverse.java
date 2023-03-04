
package Day1;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

class ThreadInstance extends Thread {
    List<String> s;

    ThreadInstance(List<String> s) {
        this.s = s;
    }

    void reverse(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.print(s);
        System.out.print(" ");
    }
 
    @Override
    public void run() {
        for (String x : s) {
        
            reverse(x.toCharArray());
        }
    }
}

public class StringReverse {

    static String para;

    static void reverse(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.print(s);
        System.out.print(" ");
    }

    public static void main(String[] args) throws Exception {
        para="Lorem ipsum dolor sit amet consectetur adipisicing elit. Adipisci veritatis sunt, ipsa tenetur autem fugit porro similique error exercitationem neque, deleniti architecto impedit eveniet vel magnam quo quisquam distinctio temporibus eum consequatur in repudiandae odit. Commodi tempora, consequuntur ipsa possimus nam dolorem nemo aliquam repellat amet officiis dignissimos assumenda quae aperiam. Exercitationem repellendus aspernatur laudantium alias nihil impedit aliquid, dolorem voluptas accusamus! Autem tempora soluta tempore iste? Tempore fugiat maxime odio nulla sed, iste facilis dicta perspiciatis iusto. Repellat, libero iusto? Aliquam repudiandae molestiae provident alias libero sed officiis minima laudantium temporibus, nam ab omnis vel numquam veritatis. Est, aliquam.";


        long start = System.currentTimeMillis();
        for (String s : para.split(" "))
            reverse(s.toCharArray());
        long end = System.currentTimeMillis();
        System.out.println("\n\n\n");
        System.out.println((end - start)+" milliseconds");
        System.out.println("\n\n\n");

        ArrayList<String> x = new ArrayList<>(List.of(para.split(" ")));
        int n = x.size();
        List<String> a = x.subList(0, n / 4);
        List<String> b = x.subList(1 + n / 4, n / 2);
        List<String> c = x.subList(1 + n / 2, (3 * n) / 4);
        List<String> d = x.subList(1 +(3 * n)/4, n);

        start = System.currentTimeMillis();
        Thread obj1 = new Thread(new ThreadInstance(a));
        Thread obj2 = new Thread(new ThreadInstance(b));
        Thread obj3 = new Thread(new ThreadInstance(c));
        Thread obj4 = new Thread(new ThreadInstance(d));
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        end = System.currentTimeMillis();
        obj1.join();
        obj2.join();
        obj3.join();
        obj4.join();
        System.out.println("\n\n\n");
        System.out.println((end - start)+" milliseconds");
        System.out.println("\n\n\n");
    }
}