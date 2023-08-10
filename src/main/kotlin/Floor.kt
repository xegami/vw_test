class Floor(private val xLimit: Int, private val yLimit: Int) {
    private val robots = mutableListOf<Robot>()

    fun addRobot(robot: Robot) {
        robots.add(robot)
    }

    fun startRobots() {
        for (robot in robots) {
            robot.readInputs(xLimit, yLimit)
        }
    }

    fun printPositions() {
        for (robot in robots) {
            println(robot.position)
        }
    }
}