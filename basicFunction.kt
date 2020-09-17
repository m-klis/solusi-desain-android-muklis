import java.util.Scanner

fun hello(name: String = ""): String{
	var send = "Hello, World!"
	if(name!=""){
		send = "Hello, $name!"
	}
	return send
}

fun main(){
	print("Input Name : ")
	val input = Scanner(System.`in`)
	var show = input.nextLine()
	println(hello(show))
}
