data class Robot(var position: Position, var inputs: String) {
    fun readInputs(xLimit: Int, yLimit: Int) {
        for (input in inputs) {
            when (input) {
                'L' -> position.turnLeft()
                'R' -> position.turnRight()
                'M' -> position.forward(xLimit, yLimit)
            }
        }
    }
}