public class binaryGap2 {

    public static void main(String[] args) {
        String s = Long.toBinaryString(74901729);
        System.out.println(s);

        String[] split = s.split("1");

        for (String s1 : split){
            System.out.println(s1);
        }

        int max = -1;
        for (int i=0; i<split.length;i++){
            int length = split[i].length();
            if(length > max){
                max = length;
            }
        }
        System.out.println(max);

    }

}
