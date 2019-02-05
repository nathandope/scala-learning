import java.io.FileReader
import java.util.Properties

// главный конструктор вплетается в определение класса:
// 1. параметры гл. конструктора перечисляются
// вслед за именем класса и автоматически превращаются
// в поля класса, проинициализированные аргументами
class Person(val name: String, val age: Int) {}

// 2. гл. конструктор выполняет все инструкции
// в определении класса ("теле")
class Person0(val name: String, val age: Int) {
  // является частью гл. конструктора
  // выполняется при создании каждого объекта
  println("Just constructed another person")
  def description = name + "is " + age + " year old"
}

//
class MyProg {
  private val props = new Properties()
  props.loaps(new FileReader("myprog.properties"))
  // инструкция выше - часть гл. конструктора
}

// избавиться от дополнительный конструкторов,
// определяя аргументы по-умолчанию в гл. конструкторе
class Person1(val name: String = "", private var age: Int) {}

// параметры гл. конструктора без val и var
// порядок их обработки зависит от их использования внутри класса:

// + если такой параметр используется внутри метода,
// то он (параметр) становится полем неизменяемым
// и приватным для объекта => private[this] val (см. 5.4)
class Person2(name: String, age: Int) { // private[this] val
  def description = name + " is " + age + " years old"
}

// + если такой параметр НЕ используется внутри метода,
// то он (параметр) интерпретируется, как обычный параметр
// доступный только в теле гл. конструктора


// Параметры гл. конструктора и
// генерируемые поля/методы: (см. таб. 5.2)

// name: String
// Сгенерируется: Поле приватное для объекта. Если параметр
//                не используется в других методах, то поле
//                name не создается.

// private val/var name: String
// Сгенерируется: Приватное поле, приватные методы доступа.

// val/var name: String
// Сгенерируется: Приватное поле, общедоступные методы доступа.

// @BeanProperty val/var name: String
// Сгенерируется: Приватное поле, общедоступные в Scala и
//                JavaBeans методы доступа

// приватный гл. конструктор
class Person3 private(val id: Int) {
  // теперь нужно использовать доп. конструктор,
  // чтобы создать объект
}