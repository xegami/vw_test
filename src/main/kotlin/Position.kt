data class Position(var x: Int, var y: Int, var orientation: Char) {
    fun forward(xLimit: Int, yLimit: Int) {
        when (orientation) {
            'N' -> if (yLimit > y) y++
            'E' -> if (xLimit > x) x++
            'S' -> if (y > 0) y--
            'W' -> if (x > 0) x--
        }
    }

    fun turnLeft() {
        orientation = when (orientation) {
            'N' -> 'W'
            'E' -> 'N'
            'S' -> 'E'
            'W' -> 'S'
            else -> orientation
        }
    }

    fun turnRight() {
        orientation = when (orientation) {
            'N' -> 'E'
            'E' -> 'S'
            'S' -> 'W'
            'W' -> 'N'
            else -> orientation
        }
    }

    fun getCurrentPosition(): String {
        return "$x $y $orientation"
    }
}