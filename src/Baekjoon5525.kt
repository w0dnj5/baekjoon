package src

import java.io.BufferedReader
import java.io.InputStreamReader

class Baekjoon5525 {
    /* 50점
    fun p(N: Int): String {
        val sb = StringBuilder()
        repeat(N) { sb.append("IO")}
        sb.append("I")
        return sb.toString()
    }

    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val N = br.readLine().toInt()
        val M = br.readLine().toInt()
        val S = br.readLine()
        val P = p(N)
        println(solution(0, P.length - 1, M, S, P, 0))
    }

    fun solution(left: Int, right: Int, M: Int, S: String, P: String, cnt: Int): Int{
        if(right >= M) return cnt
        if(S.substring(left .. right) == P) return solve(left + 2, right + 2, M, S, P, cnt + 1)
        return solve(left + 1, right + 1, M, S, P, cnt)
    }
    */

    // 100점
    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val N = br.readLine().toInt() // N = O의 개수
        val M = br.readLine().toInt()
        val S = br.readLine()

        println(solution(M, S, 1, N, 0, 0))
    }

    fun solution(M: Int, S:String, index: Int, N: Int, cnt: Int, result: Int): Int {
        if(index >= M - 1) return result
        var c = cnt
        var r = result
        if(S[index - 1] == 'I' && S[index] == 'O' && S[index + 1] == 'I') {
            c++
            if(c == N) {
                c--
                r++
            }
            return solution(M, S, index + 2, N, c, r)
        }
        return solution(M, S, index + 1, N, 0, r)
    }
}

fun main() {
    Baekjoon5525().main()
}