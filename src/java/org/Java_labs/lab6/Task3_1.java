package org.Java_labs.lab6;
 
public class Task3_1 {
    public static void main(String[] args){
        RationalFraction[] list = new RationalFraction[] {
                                new RationalFraction(3, 5),
                                new RationalFraction(-6, -5),
                                new RationalFraction(-3, 5),
                                new RationalFraction(0, -6),
                                new RationalFraction(2, 18),
                                new RationalFraction(9, 3)
		};
        System.out.printf("List: "); 
        for (RationalFraction r: list)
            System.out.printf("%s  ", r.toString());
        int n = list.length;
        System.out.printf("\n New list: ");  
        RationalFraction first = list[0];
        for (int i = 0; i < n; i++) {
            RationalFraction r = new RationalFraction();
            if (i != n - 1)
                r = list[i].plus(list[i+1]); 
            else {
                r = list[i].plus(first);
            }
            //list[i] = r;
            System.out.printf("%s  ", r.toString());
        }
    }
}
