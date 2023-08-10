fun main() {
    val floor = Floor(5, 5)
    val robot1 = Robot(Position(1, 2, 'N'), "LMLMLMLMM")
    val robot2 = Robot(Position(3, 3, 'E'), "MMRMMRMRRM")

    floor.addRobot(robot1)
    floor.addRobot(robot2)

    floor.startRobots()
    floor.printPositions()
}
