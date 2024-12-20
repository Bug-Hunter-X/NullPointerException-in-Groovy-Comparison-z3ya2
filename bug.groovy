```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Output: 5
println myMethod(2, 8) // Output: 8
println myMethod(null, 5) // Exception: GroovyRuntimeException: Cannot compare null with 5
```