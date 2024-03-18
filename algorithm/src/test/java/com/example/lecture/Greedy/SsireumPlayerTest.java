package com.example.lecture.Greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.lecture.Greedy.SsireumPlayer.Player;

public class SsireumPlayerTest {

    @Test
    public void testSolution() {
        SsireumPlayer playerManager = new SsireumPlayer();

        // Test Case 1
        List<SsireumPlayer.Player> firstGroup = new ArrayList<>();
        firstGroup.add(new Player(192, 117));
        firstGroup.add(new Player(190, 110));
        firstGroup.add(new Player(184, 98));
        firstGroup.add(new Player(212, 91));
        firstGroup.add(new Player(177, 89));
        firstGroup.add(new Player(218, 78));
        firstGroup.add(new Player(152, 106));
        firstGroup.add(new Player(182, 64));
        firstGroup.add(new Player(193, 88));
        firstGroup.add(new Player(198, 71));
        firstGroup.add(new Player(216, 111));
        firstGroup.add(new Player(155, 101));
        firstGroup.add(new Player(181, 92));
        firstGroup.add(new Player(173, 77));
        firstGroup.add(new Player(215, 97));

        assertEquals(3, playerManager.mySolution(firstGroup.size(), firstGroup));

        // Test Case 2
        List<SsireumPlayer.Player> secondGroup = new ArrayList<>();
        secondGroup.add(new Player(172, 67));
        secondGroup.add(new Player(183, 65));
        secondGroup.add(new Player(180, 70));
        secondGroup.add(new Player(170, 72));
        secondGroup.add(new Player(181, 60));

        assertEquals(3, playerManager.mySolution(secondGroup.size(), secondGroup));
    }

}
