package tdd.doors

class OneHundredDoors(val doorCount: Int) {
    private val doorStates = ArrayList<Boolean>()
    private var pass = 0

    init {
        for (i in 1..doorCount)
            doorStates.add(false)
    }

    fun status(): List<Boolean> {
        var s = 1

        if (pass == 1) {
            s = 1
            for (i in s..doorCount step s)
                doorStates[i - 1] = !doorStates[i - 1]
            return doorStates
        }

        if (pass == 2) {
            s = 1
            for (i in s..doorCount step s)
                doorStates[i - 1] = !doorStates[i - 1]

            s = 2
            for (i in s..doorCount step s)
                doorStates[i - 1] = !doorStates[i - 1]

            return doorStates
        }
        return doorStates
    }

    fun pass() {
        pass++
    }

}