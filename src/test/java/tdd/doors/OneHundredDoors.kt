package tdd.doors

class OneHundredDoors(val doorCount: Int) {
    private val doorStates = ArrayList<Boolean>()
    private var pass = 0

    init {
        for (i in 1..doorCount)
            doorStates.add(false)
    }

    fun status(): List<Boolean> {
        for (step in 1..pass) {
            for (i in step..doorCount step step)
                doorStates[i - 1] = !doorStates[i - 1]
        }

        return doorStates
    }

    fun pass() {
        pass++
    }

}