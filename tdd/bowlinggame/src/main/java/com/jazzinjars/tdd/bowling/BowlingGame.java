package com.jazzinjars.tdd.bowling;

public class BowlingGame {

    private int[] rollsScore = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rollsScore[currentRoll++] = pins;
    }

    public int score() {
        int currentScore = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                currentScore += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                currentScore += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else {
                currentScore += sumOfPinsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return currentScore;
    }

    private int strikeBonus(int frameIndex) {
        return rollsScore[frameIndex + 1] + rollsScore[frameIndex + 2];
    }

    private int spareBonus(int frameIndex) {
        return rollsScore[frameIndex + 2];
    }

    private int sumOfPinsInFrame(int frameIndex) {
        return rollsScore[frameIndex] + rollsScore[frameIndex + 1];
    }

    private boolean isSpare(int frameIndex) {
        return sumOfPinsInFrame(frameIndex) == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rollsScore[frameIndex] == 10;
    }

}
