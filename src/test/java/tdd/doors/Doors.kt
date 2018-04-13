package tdd.doors

class Doors(private val size: Int = 1) {
    private val states = ArrayList<Boolean>()
    private var pass = 0

    init {
        for (i in 1..size)
            states.add(false)
    }

    fun getStates(): List<Boolean> {
        return states
    }

    fun pass() {
        pass++

        for (i in pass..size step pass) {
            states[i - 1] = !states[i - 1]
        }

    }

}