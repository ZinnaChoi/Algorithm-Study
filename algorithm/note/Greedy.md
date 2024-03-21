# 우선순위 큐

- 기본적으로 값이 가장 작은 값에 우선순위를 준다
- `Comparator.reverseOrder()` 값을 사용하면 값이 큰 값에 우선순위를 줄 수 있다

```java
 PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
```
