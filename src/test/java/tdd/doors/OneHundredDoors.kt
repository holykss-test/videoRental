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
            for (i in 1..doorCount)
                doorStates[i-1] = !doorStates[i-1]
            return doorStates
        }

        if(pass == 2) {
            for (i in 1..doorCount)
                doorStates[i-1] = !doorStates[i-1]

            for (i in 2..doorCount step 2)
                doorStates[i-1] = !doorStates[i-1]

            return doorStates
        }
        return doorStates
    }

    fun pass() {
        pass++
    }

}