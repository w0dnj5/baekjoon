package src

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

class Baekjoon2630 {

    var bluePaper = 0
    var whitePaper = 0

    fun solution(length: Int, paper: Array<IntArray>, startHeight: Int, endHeight: Int, startWidth: Int, endWidth: Int) {
        var blue = 0
        var white = 0
        for(i in startHeight..<endHeight) {
            for(j in startWidth..<endWidth) {
                if(paper[i][j] == 1) blue++
                else white++
            }
        }

        if(blue == length * length) {
            bluePaper++
            return
        }
        if(white == length * length)  {
            whitePaper++
            return
        }
        // 1사분면
        solution(length / 2, paper, startHeight, endHeight - (length / 2), startWidth, endWidth - (length / 2))
        // 2사분면
        solution(length / 2, paper, startHeight, endHeight - (length / 2), endWidth - (length / 2), endWidth)
        // 3사분면
        solution(length / 2, paper, endHeight - (length / 2), endHeight, startWidth, endWidth - (length / 2))
        // 4사분면
        solution(length / 2, paper, endHeight - (length / 2), endHeight, endWidth - (length / 2), endWidth)
    }

    fun main() {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val length = br.readLine().toInt()
        val paper = Array(length) { IntArray(length) }
        repeat(length) { i ->
            val st = StringTokenizer(br.readLine())
            repeat(length) { j ->
                paper[i][j] = st.nextToken().toInt()
            }
        }
        solution(length, paper, 0, length, 0, length)
        println(whitePaper)
        println(bluePaper)
    }
}

fun main() {
    Baekjoon2630().main()
}