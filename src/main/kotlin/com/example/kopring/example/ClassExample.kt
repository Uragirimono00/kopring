package com.example.kopring.example

fun main(){
    val person = Person()
}
class Person(
        val name: String = "홍길동",
        var age : Int = 1
) {

    // field 대신 name을 사용할 경우 name안에 또 Getter를 호출하고 그 Getter안에는 또 name이 있고 무한루프를 발생...
    /**
     * val name = name
     *         get() = field.uppercase()
     *
     */
    val upperCaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부 생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부 생성자")
    }

    /**
     * Getter는 객체의 속성을 보여줄때
     * 그것이 아니라면 함수 표현식을 쓰는것이 좋아보인다.
     */

    // 함수
//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    // 커스텀 Getter
    val isAdult: Boolean
        get() = this.age >= 20
}
