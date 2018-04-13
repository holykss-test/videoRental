package tdd.doors

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import kotlin.test.assertEquals

class DoorsTest {
    @Test
    fun oneDoorNoPass() {
        val doors = OneHundredDoors(1)

        assertEquals(listOf(false), doors.status())
    }

    @Test
    fun oneDoorOnePass() {
        val doors = OneHundredDoors(1)

        doors.pass()

        assertEquals(listOf(true), doors.status())
    }

    @Test
    fun twoDoorsNoPass() {
        val doors = OneHundredDoors(2)

        assertEquals(listOf(false, false), doors.status())
    }


}

