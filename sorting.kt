import java.util.Scanner

fun sorting(input: String){
	var swap = 0
	var show = input.split(" ").map{ it.toInt() }.toMutableList()
    var check: Boolean
    var a: Int
    var b: Int
    do{
        check = true
        for(i in 1..show.size){
            a = show[i-1]
            if(i==show.size){
                check = false
                break
            }else{                
                b = show[i]
                if(a>b){
                    show.set(i-1, b)
                    show.set(i, a)
                    swap += 1
     			    println("[$b,$a] -> $show")
                    break
                }else{
                    continue
                }
            }
        }
    }while(check)
    println()
	println("Jumlah swap: $swap")
}

fun main(){
	val scanner = Scanner(System.`in`)
	println("Masukan deret angka, pisahkan dengan spasi.")
	var input = scanner.nextLine()
   	val re = Regex("[^0-9 ]")
	input = re.replace(input, "")
	sorting(input)
}
