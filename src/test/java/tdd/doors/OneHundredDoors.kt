package tdd.doors

class OneHundredDoors(val size: Int) {
    private val doorStates = ArrayList<Boolean>()
    private var pass = 0

    init {
        for (i in 1..size)
            doorStates.add(false)
    }

    fun status(): List<Boolean> {

        if (pass == 1) {
            doorStates[0] = !doorStates[0];
            return doorStates;
        }

        return doorStates
    }

    fun pass() {
        pass++
    }

}