package Codility;

public class frogJump {

    public static int solution(int x,int y, int d){
        int distanceToTravel = y - x;

        int jumps = distanceToTravel/d;

        if(distanceToTravel%d > 0){
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }


}
