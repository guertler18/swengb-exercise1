package fh.joanneum.swengb.lab1

class Circle(color:String = "black", val radius:Double = 5.0): Shape(color)
{
    override fun getArea():Double {
        return radius * radius * Math.PI
    }

    override fun toString(): String {
        return "Circle(radius=$radius, color=$color)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Circle

        if (radius != other.radius) return false

        return true
    }

    override fun hashCode(): Int {
        return radius.hashCode()
    }
}
