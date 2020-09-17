import java.util.Scanner

fun multiplicationTable(n: Int): List<List<Int>>{
	var table = mutableListOf<List<Int>>()
	for(i in 1..n){
		var tmp = mutableListOf<Int>()
		for(j in 1..n){
			var num = i * j
			tmp.add(num)
		}
		table.add(tmp)	
	}
	return table
}

fun main(){
	val inputUser = Scanner(System.`in`)
	print("Masukan angka : ")
	var input = inputUser.nextInt()
	if(input!=0){
		var table = multiplicationTable(input)
		println(table)
	}else{
		println("Masukan selain angka kosong.")
	}
}
