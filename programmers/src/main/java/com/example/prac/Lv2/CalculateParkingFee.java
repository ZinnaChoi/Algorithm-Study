package com.example.prac.Lv2;

import java.util.HashMap;
import java.util.Map;

public class CalculateParkingFee {

  private int calculateFee(int[] fees, int parkingTime) {
    if (parkingTime <= fees[0]) {
      return fees[1];
    } else {
      int extraTime = parkingTime - fees[0];
      int extraFee = (int) Math.ceil((double) extraTime / fees[2]) * fees[3];
      return fees[1] + extraFee;
    }
  }

  private int convertTime(String time) {
    String[] parts = time.split(":");
    return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
  }

  public int[] solution(int[] fees, String[] records) {
    Map<String, Integer> parkingMap = new HashMap<>();
    Map<String, Integer> feeMap = new HashMap<>();

    for (String record : records) {
      String[] parts = record.split(" ");
      int time = convertTime(parts[0]);
      String carNumber = parts[1];
      String action = parts[2];

      if (action.equals("IN")) {
        parkingMap.put(carNumber, time);
      } else {
        int inTime = parkingMap.remove(carNumber);
        int parkedTime = time - inTime;
        feeMap.merge(carNumber, parkedTime, Integer::sum);
      }
    }

    parkingMap.forEach((carNumber, inTime) -> {
      int parkedTime = 23 * 60 + 59 - inTime;
      feeMap.merge(carNumber, parkedTime, Integer::sum);
    });

    return feeMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .mapToInt(e -> calculateFee(fees, e.getValue()))
        .toArray();
  }

}
