data class Position(var x: Int, var y: Int, var orientation: Char) {
    fun moveForward() {
        when (orientation) {
            'N' -> y++
            'E' -> x++
            'S' -> y--
            'W' -> x--
        }
    }

    fun rotateLeft() {
        orientation = when (orientation) {
            'N' -> 'W'
            'E' -> 'N'
            'S' -> 'E'
            'W' -> 'S'
            else -> orientation
        }
    }

    fun rotateRight() {
        orientation = when (orientation) {
            'N' -> 'E'
            'E' -> 'S'
            'S' -> 'W'
            'W' -> 'N'
            else -> orientation
        }
    }

    override fun toString(): String {
        return "$x $y $orientation"
    }
}