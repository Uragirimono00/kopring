package com.example.kopring.example

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {
    // 앗 이부분은 자바 코드를 함께 작성 대충 주석으로 말로만 설명하자면 지역 함수와 확장 함수가 동시에 존재할때는 지역함수가 먼저 호출된다.
    //val person = Person
}