package com.megha.groovy


c = {
    n = 5 -> println(n % 2 == 0 ? "even" : "odd")
}
c()

c.call()

6.times { n -> println n }
4.times { println it }