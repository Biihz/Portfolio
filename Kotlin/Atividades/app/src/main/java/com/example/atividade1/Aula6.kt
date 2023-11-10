fun main(args: Array<String>) {
    print("Digite o um nome: ")
    var nome = readLine()
    print("Digite um salário R$: ")
    var sal = readLine()!!.toInt()
    println("o salário do(a) $nome é de: R$ $sal")
    if (sal >=1000){
        println("O(a) $nome Ganha bem!!!")
    }else{
        println("O(a) $nome ganha bem pouco")}
}

//Insere nome, salário e faz separação valor.