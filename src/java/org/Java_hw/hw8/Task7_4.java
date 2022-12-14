// Home work 8
// JavaLabs4 Task 7.4 

package org.Java_hw.hw8;

public class Building extends building1{
    public static void main(String[] args) {
        building1 bd = new building1() {
            @Override
            public String getInfo() {
                return super.getInfo();
            }
        };
        System.out.println(bd.getInfo());
    }
}
abstract class building1{
        String str = "This is a supermarket";
        public String getInfo(){
            return str;
        }
}
