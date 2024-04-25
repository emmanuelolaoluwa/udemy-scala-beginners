package exercises.part1Basics

object OOP extends App {

  val author = new Writer("CD", "Charles", 1812)
  val novel = new Novel("GE", 1861, author)

  print(novel.authorAge)
  print(novel.isWrittenBy(author))

  class Writer(firstName: String, surname: String, val year: Int) {
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge: Int = year - author.year
    def isWrittenBy(author: Writer): Boolean = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)

  }

  class Counter(val count: Int) {
    def inc = new Counter(count + 1) // immutability
    def dec = new Counter(count - 1)

    def inc(n: Int) = new Counter(count + n)
    def dec(n: Int) = new Counter(count - n)
  }


}
