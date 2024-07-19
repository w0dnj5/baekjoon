package src

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ2579 {
    // Bottom-up
    fun bottomUp(dp: IntArray, stair: IntArray, n: Int) {
        if(n >= 0) dp[0] = 0
        if(n >= 1) dp[1] = stair[1]
        if(n >= 2) dp[2] = dp[1] + stair[2]
        for(i in  3..n) {
            dp[i] = dp[i - 2].coerceAtLeast(dp[i - 3] + stair[i - 1]) + stair[i]
        }
    }

    // Top-bottom
    fun topBottom(dp: IntArray, stair: IntArray, n: Int): Int {
        if(dp[n] == -1) {
            dp[n] = topBottom(dp, stair, n - 2).coerceAtLeast(topBottom(dp, stair, n - 3) + stair[n - 1]) + stair[n]
        }
        return dp[n]
    }

    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val n = br.readLine().toInt()
        val dp = IntArray(n + 1) { -1 }
        val stair = IntArray(n + 1)
        repeat(n) { i -> stair[i + 1] = br.readLine().toInt()}
        //bottomUp(dp, stair, n)
        //println(dp[n])
        dp[0] = 0
        if(n >= 1) {
            dp[1] = stair[1]
        }
        if(n >= 2) {
            dp[2] = dp[1] + stair[2]
        }
        println(topBottom(dp, stair, n))
    }
}

fun main() {
    BOJ2579().main()
}