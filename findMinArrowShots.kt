// There are some spherical balloons taped onto a flat wall that represents the XY-plane.
// The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend.
// You do not know the exact y-coordinates of the balloons.
// Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis.
// A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend.
// There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

// Given the array points, return the minimum number of arrows that must be shot to burst all balloons.

fun findMinArrowShots(points: Array<IntArray>): Int {
    if (points.isEmpty()) return 0

    // Sort balloons based on their ending points
    points.sortBy { it[1] }

    var arrows = 1
    var prevEnd = points[0][1]

    // Iterate through balloons
    for (i in 1 until points.size) {
        val start = points[i][0]
        val end = points[i][1]

        // If the starting point is greater than the current ending point,
        // shoot an arrow to burst the previous balloons
        if (start > prevEnd) {
            arrows++
            prevEnd = end
        }
    }

    return arrows
}
