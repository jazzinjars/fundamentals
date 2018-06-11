package com.jazzinjars.tdd.bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @BeforeEach
    public void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, bowlingGame.score(), "Different scores: ");
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1);
        assertEquals(20, bowlingGame.score(), "Different scores: ");
    }

    @Test
    public void testOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);
        assertEquals(16, bowlingGame.score(), "Different scores");

    }

    @Test
    public void testOneStrike() {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowlingGame.score(), "Different scores: ");
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10);
        assertEquals(300, bowlingGame.score(), "Different scores: ");
    }

    private void rollMany(int numberOfRolls, int scoredPins) {
        for (int i = 0; i < numberOfRolls; i++) {
            bowlingGame.roll(scoredPins);
        }
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }
}
