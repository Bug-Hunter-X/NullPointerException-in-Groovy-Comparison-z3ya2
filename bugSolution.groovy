```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Or handle nulls as appropriate for your application
  } else if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Output: 5
println myMethod(2, 8) // Output: 8
println myMethod(null, 5) // Output: null
println myMethod(5, null) // Output: null
```