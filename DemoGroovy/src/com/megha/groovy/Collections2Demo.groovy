package com.megha.groovy

s = ['java', 'js', 'python', 'js'] as Set
println s
println s.class

m = [courseName: 'Gradle', rating: 5, price: 20]
println m
println m.getClass()

m.each { k, v ->
    println k
    println v
}
println m.courseName
println m['courseName']
println m.get('courseName')

m.review = 'its good!!'
println m