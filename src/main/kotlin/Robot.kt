data class Robot(var position: Position, var inputs: String) {
    fun readInputs() {
        for (input in inputs) {
            when (input) {
                'L' -> position.rotateLeft()
                'R' -> position.rotateRight()
                'M' -> position.moveForward()
            }
        }
    }
}