package Codility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class frogJumpTest {

    @Test
    void solution() {

        int solution = frogJump.solution(10, 85, 30);

        Assertions.assertEquals(solution,3);

    }



}