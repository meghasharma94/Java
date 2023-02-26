package com.megha.groovy

int product(int x, int y) {
    return x * y
}

result = product(10, 5)
println result

def product1(x, y) {
    x * y
}

result1 = product1 3, 5
println result1

void display(Map productDetails) {
    println productDetails.name
    println productDetails.price
}

display name: 'IPhone', price: 1000