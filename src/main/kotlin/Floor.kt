class Floor(private val maxX: Int, private val maxY: Int) {
    private val robots = mutableListOf<Robot>()

    fun addRobot(robot: Robot) {
        robots.add(robot)
    }

    fun startRobots() {
        for (robot in robots) {
            robot.readInputs()
        }
    }

    fun printPositions() {
        for (robot in robots) {
            println(robot.position)
        }
    }
}