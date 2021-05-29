fun main() {
squares()
    var account=currentAccount("CE457","Arinda Diana",500)
    println(account.deposite(8900.0))
    println(account.withdraw(2900.0))
}
data class product( var Title:String,var Author:String,var Pages:Int){

}
fun squares() {
    var num=1
    do {
        println(num*num)
        num++
    }while (num*num<=3000)

}

class currentAccount(accountNumber:String, accountName:String, balance:Int)
fun deposit(amount: Double) {
    var deposit=8900.0
    println(amount)
}
fun withdraw(amount: Double){
    var withdraw=2900.0
    println(amount)
}

