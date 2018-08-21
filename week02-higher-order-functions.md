# Higher Order Functions

## Currying

메소드에는 파라미터 목록을 여럿 정의할 수 있다.
파라미터 목록의 수 보다 적은 파라미터로 메소드가 호출되면, 해당 함수는 누락된 파라미터 목록을 인수로 받는 새로운 함수를 만든다.

```scala
def sum(x: Int, y: Int): Int = x + y    //sum: sum[](val x: Int,val y: Int) => Int

sum(3, 4) //7

def first(x: Int): Int => Int = (y: Int) => x + y   //first: first[](val x: Int) => Int => Int
val second: (Int => Int) = first(3)                 //second: Int => Int = <function1>

first(3)    //Int => Int = <function1>
first(3)(4) // 7
second(10)  // 13

val ints = List(1,2,3,4)            //ints: List[Int] = List(1, 2, 3, 4)
val newInts1 = ints.map(first(5))   //newInts1: List[Int] = List(6, 7, 8, 9)
val newInts2 = ints.map(second) //newInts2: List[Int] = List(4, 5, 6, 7)
```
