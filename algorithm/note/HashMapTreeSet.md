# HashMap

result가 `HashMap` 자료형일 때

```java
- result.containsKey('A') : 맵이 key A를 포함하고 있는 지 알려줌 true|false
- result.size(): 키의 개수(종류)
- result.remove('A'): 특정 키를 기준으로 삭제 (삭제한 key의 value값을 리턴한다)
```

## 2개의 HashMap이 같은지 비교

```java
Map<Character, Integer> SMap = new HashMap<>();
Map<Character, Integer> TMap = new HashMap<>();

SMap.equals(TMap)
```

## TreeSet

> 중복 제거 & 오름차순 정렬

- 균형잡힌 이진 트리

```java
TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬
Tset.remove(103);
Tset.size(); // Tset의 원소의 개수
Tset.fist(); // 내림차순에서 가장 큰 값, 오름찬순에서 가장 작은 값
Tset.last(); // 위와 반대
```
