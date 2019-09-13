val i = 3
val l = -5L
val d = 10.3
val f = 10.3F
val e = 1.03e1


// Числовые операции
val x = -5
val y = 3

x + y // сложение
x - y // вычитание
x * y // умножение
x / y // деление нацело
x % y // остаток от деления
-x // противоположное число

// Бинарные операции
// числа, как наборы бит (битовые вектора)
val a = 0xF
val b = 0xA1

x >> y // побитовый сдвиг вправо
x << y // побитовый сдвиг влево
x | y  // побитовое ИЛИ
x & y  // побитовое И
x ^ y  // побитовое искл. ИЛИ
~x     // побитовая инверсия

// Порядок операций
(x * y) + (2 * 3)
x * (y + 2) * 3
x * y + 2 * 3

// 1. символы
// 2. |
// 3. ^
// 4. &
// 5. =!
// 6. <>
// 7. :
// 8. +-
// 9. */%
// 10. все остальные

// Большие числа (ссылочный тип)
val bI0 = BigInt(10)
val bD0 = BigDecimal(10)
val bI1 = BigInt("1000000000000000000000000")
val bI2 = BigInt(10)

// операции над ними не дают переполнения
bI0 pow 100
bI0 gcd bI2

// Практика
123L

123 + 23

(1: Short) + (1: Short)             //res: Int
((1: Short) + (1: Short)).toShort   //res: Short

('A'.toInt + 10).toChar
'K' - 'A'

1231231231 + 1231231231

val bI = BigInt(8398392839839283928L) + 998974398743483798L

bI.gcd(123)
// вывод в X-ричной системе счисления
bI.toString(36)

"123114314".toInt + 2

val j = 1.0
// результат - число с плавающей точкой
j + 3

// результат непредсказуем
//j + bI

import scala.io.StdIn.{readLine, _}

object Ex {
  def main(args: Array[String]) {
    val in = readLine().toInt
    for (i <- 1 to in) {
      if ((in >> 1) != 0) println(i)
    }
  }
}


// округление Double
def roundAt(p: Int)(n: Double): Double = { val s = math pow (10, p); (math round n * s) / s }