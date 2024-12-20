# Groovy Null Comparison Bug

This repository demonstrates a common error in Groovy: unexpected exceptions arising from comparing null values.

The `bug.groovy` file contains a function `myMethod` that compares two numbers and returns the larger one. However, it lacks explicit null handling, leading to a `GroovyRuntimeException` when a null value is passed as an argument.

The solution, shown in `bugSolution.groovy`, addresses this by adding a null check before the comparison.