package tdd.doors

import org.junit.Test
import kotlin.test.assertEquals

class DoorsTest {
    @Test
    fun oneDoorNoPass() {
        val doors = Doors()

        assertEquals(listOf(false), doors.getStates())
    }

    @Test
    fun oneDoorOnePass() {
        val doors = Doors()

        doors.pass()

        assertEquals(listOf(true), doors.getStates())
    }

    @Test
    fun twoDoorsNoPass() {
        val doors = Doors(2)

        assertEquals(listOf(false, false), doors.getStates())
    }

    @Test
    fun twoDoorsOnePass() {
        val doors = Doors(2)

        doors.pass()

        assertEquals(listOf(true, true), doors.getStates())
    }

    @Test
    fun twoDoorsTwoPass() {
        val doors = Doors(2)

        assertEquals(listOf(false, false), doors.getStates())

        doors.pass()
        assertEquals(listOf(true, true), doors.getStates())
        doors.pass()

        assertEquals(listOf(true, false), doors.getStates())
    }

    @Test
    fun tenDoorsNoPass() {
        val doors = Doors(10)

        assertEquals(
                listOf(
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false
                ),
                doors.getStates())
    }

}

