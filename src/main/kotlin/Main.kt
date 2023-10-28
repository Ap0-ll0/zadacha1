//Задача 1.
//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке. На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4.
// То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу
fun main() {
    println("Введите строку: ")
    val str=readln()
    var result=""
    var amount=1
    var symbol=str[0]
    for ( i in str.substring(1)){
        if(symbol==i){amount++}
        else{
            if (amount>1) {result +="$symbol$amount"}
            else {result+=symbol}
            amount=1
            symbol=i}
    }
    if (amount>1) {result +="$symbol$amount"}/*последний элемент массива*/
    else {result+=symbol}
    println("Результат: $result")
}