package eu.learning.bankaccountprogram

class BankAccount(var accountHolder: String,
                  var balance: Double)
{

    private val transactionHistory = mutableListOf<String>()

    fun deposite(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited Taka $amount")
    }
    fun withdrow(amount: Double){
        if(amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew Taka $amount")
        } else{
            println("Not available funds to withdraw.")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History of $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

}