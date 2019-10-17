package fh.joanneum.swengb.lab1


import kotlin.math.acos

fun main() {
    //  val testShape = Shape()
    //  println(testShape.color)
    //   val testRectangle = Rectangle(width = 5.0, length = 2.0)
    //   println(testRectangle.getArea())
    // println(testRectangle.getArea()
    //   println(testRectangle.length)

    // val aShape:  Shape = testRectangle
    //  aShape.width
    //   println(aShape.getArea())
//
    //val aCircle = Circle(radius = 10.0, color = "red")
    //  println(aCircle)

 //   val circle1 = Circle(radius = 10.0, color = "red")
  //  val circle2 = Circle(radius = 10.0, color = "red")


 //   println(circle1 === circle2)
   // println(circle1 == circle2)
   // println(setOf<Circle>(circle1, circle2).size)

    val canvas1 = Canvas()
    canvas1.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas1.addShape(Circle("red", radius = 1.0))
    println(canvas1.getTotalArea())
   // println(canvas1.getTotalArea()) //  13.14
   /// println("hello")

}
