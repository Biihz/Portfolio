fun main(args: Array<String>) {

    print("Digite o nome do aluno \n")
    var aluno = readLine()
    print("Digite a nota do 1 bimestre do aluno(a) " + aluno)
    var n1 = readLine()!!.toFloat()

    print("Digite a nota do 2 bimestre do aluno(a) " + aluno)
    var n2 = readLine()!!.toFloat()

    print("Digite a nota do 3 bimestre do aluno(a) " + aluno)
    var n3 = readLine()!!.toFloat()

    print("Digite a nota do 4 bimestre do aluno(a) " + aluno)
    var n4 = readLine()!!.toFloat()

    var media = (n1 + n2 + n3 + n4) / 4
    if(media >= 7) {
        print ("O(a) $aluno está com nota boa! Sua nota média é $media")
    }else{
        print ("O(a) $aluno está com nota ruim! Sua média é $media")
    }
}

// COLOCA NOME, NOTAS, FAZ A MÉDIA E MOSTRA SE FOI BEM OU NÃO (IF - ELSE).