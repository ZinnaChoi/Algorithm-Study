package com.example.prac.Lv2;

import java.util.Arrays;

public class ArcheryCompetition {
    private int[] bestDistribution;
    private int maxDiff;

    public int[] solution(int n, int[] info) {
        bestDistribution = new int[11];
        maxDiff = Integer.MIN_VALUE;

        checkCombination(new int[11], info, n, 0);

        if (maxDiff <= 0) {
            return new int[] { -1 }; // 라이언 패
        }

        return bestDistribution;
    }

    private void checkCombination(int[] currentDistribution, int[] info, int leftArrows, int index) {
        if (index == 11) {
            if (leftArrows > 0) {
                currentDistribution[10] += leftArrows; // 남은 화살은 0점에 추가
            }
            int difference = calculateScoreDifference(currentDistribution, info);

            if (difference > maxDiff) {
                maxDiff = difference;
                bestDistribution = Arrays.copyOf(currentDistribution, 11);
            } else if (difference == maxDiff) {
                // 더 낮은 점수를 더 많이 맞힌 경우
                for (int i = 10; i >= 0; i--) {
                    if (currentDistribution[i] > bestDistribution[i]) {
                        bestDistribution = Arrays.copyOf(currentDistribution, 11);
                        break;
                    } else if (currentDistribution[i] < bestDistribution[i]) {
                        break;
                    }
                }
            }
            if (leftArrows > 0) {
                currentDistribution[10] -= leftArrows; // 점수 계산 이후 원래되로 복원
            }
            return;
        }

        // 라이언이 이기기 위한 화살 수
        int arrowsNeeded = info[index] + 1;

        // 라이언이 index번째 점수 획득 시도
        if (leftArrows >= arrowsNeeded) {
            currentDistribution[index] = arrowsNeeded;
            checkCombination(currentDistribution, info, leftArrows - arrowsNeeded, index + 1);
            currentDistribution[index] = 0;
        }

        // 라이언이 index번째 점수 포기
        checkCombination(currentDistribution, info, leftArrows, index + 1);
    }

    private int calculateScoreDifference(int[] lion, int[] apeach) {
        int lionScore = 0;
        int apeachScore = 0;
        for (int i = 0; i < 11; i++) {
            if (lion[i] > apeach[i]) {
                lionScore += 10 - i;
            } else if (apeach[i] > 0) {
                apeachScore += 10 - i;
            }
        }
        return lionScore - apeachScore;
    }
}
