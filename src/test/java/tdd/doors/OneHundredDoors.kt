package tdd.doors

class OneHundredDoors(val doorCount: Int) {
    private val doorStates = ArrayList<Boolean>()
    private var pass = 0

    init {
        for (i in 1..doorCount)
            doorStates.add(false)
    }

    fun status(): List<Boolean> {
        if (pass == 1) {
            for (i in 0..doorCount - 1)
                doorStates[i] = !doorStates[i]
            return doorStates
        }

        return doorStates
    }

    fun pass() {
        pass++
    }

}