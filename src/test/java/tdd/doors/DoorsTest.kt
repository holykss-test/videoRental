package tdd.doors

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class DoorsTest {
    @Test
    fun oneDoorNoPass() {
        val doors = Doors(1)

        assertArrayEquals(arrayOf(false), doors.status())
    }



}

