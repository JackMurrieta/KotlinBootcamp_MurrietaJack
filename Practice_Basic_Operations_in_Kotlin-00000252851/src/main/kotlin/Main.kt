package edu.itson.jackMurrieta

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}

fun totalPeces(){
    val primerosPeces = 2;
    val pecesCrias1 = 71;
    val pecesCrias2 = 233;

    val pecesDevorador = 13;

    val pecesRestantes = primerosPeces.plus(pecesCrias1).plus(pecesCrias2).minus(pecesDevorador);

    val pecesAcuario = 30;

    val acuariosNecesarios = (pecesRestantes + pecesAcuario - 1).div(pecesAcuario);

    println("Peces restantes: $pecesRestantes")
    println("Acuarios necesarios: $acuariosNecesarios")


    val numeros = listOf(2,71,233,13);
    numeros.forEach {n -> println("$n es primo : ${esPrimo(n)}")}
}




fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}