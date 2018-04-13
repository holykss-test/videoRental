package tdd.doorsagain

import org.junit.Test
import kotlin.test.assertEquals

class DoorsTest {

    @Test
    fun oneDoor() {
        val doors = Doors(1)
        assertEquals(listOf(false), doors.getStates())
    }

    @Test
    fun oneDoorOnePass() {
        val doors = Doors(1)
        doors.pass()
        assertEquals(listOf(true), doors.getStates())
    }

    @Test
    fun twoDoor() {
        val doors = Doors(2)
        assertEquals(listOf(false, false), doors.getStates())
    }

    @Test
    fun twoDoorOnePass() {
        val doors = Doors(2)
        doors.pass()
        assertEquals(listOf(true, true), doors.getStates())
    }

    @Test
    fun twoDoorTwoPass() {
        val doors = Doors(2)
        doors.pass()
        doors.pass()
        assertEquals(listOf(true, false), doors.getStates())
    }

    @Test
    fun threeDoor() {
        val doors = Doors(3)
        assertEquals(listOf(false, false, false), doors.getStates())
    }

    @Test
    fun threeDoorOnePass() {
        val doors = Doors(3)
        doors.pass()
        assertEquals(listOf(true, true, true), doors.getStates())
    }

    @Test
    fun threeDoorTwoPass() {
        val doors = Doors(3)
        doors.pass()
        doors.pass()
        assertEquals(listOf(true, false, true), doors.getStates())
    }

    @Test
    fun threeDoorThreePass() {
        val doors = Doors(3)
        doors.pass()
        doors.pass()
        doors.pass()
        assertEquals(listOf(true, false, false), doors.getStates())
    }


}

