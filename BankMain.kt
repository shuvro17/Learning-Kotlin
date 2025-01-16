package eu.learning.bankaccountprogram

fun main(){
    val shuvrosBankAccount = BankAccount("Tanvir Rahman Shuvro", 70045.25)

    shuvrosBankAccount.deposite(200.0)
    shuvrosBankAccount.displayTransactionHistory()
    println("${shuvrosBankAccount.accountHolder}'s account Balance is ${shuvrosBankAccount.balance}")

}