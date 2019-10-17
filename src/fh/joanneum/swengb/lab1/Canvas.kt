package fh.joanneum.swengb.lab1

class Canvas {
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape){
        shapes.add(shape)
    }

    fun getTotalArea():Double {
        return shapes.sumByDouble{ it.getArea() }
    }

    fun shapesCntPerType():Map<String, Int> {


        return shapes.groupBy { it.javaClass.simpleName }.mapValues { it.value.size }

    }



}