# diffeq-numerical-solvers

Using Java to implement numerical methods for approximating first-order linear ODEs ($\frac{dy}{dx} = ax + by + c$).

## Files
* `EulerMethod.java` — Holds variables and the method which calculates the standard Euler's method & RK4 approximations.
* `Runner.java` — Collects user input that allows for all forms of questions referencing Euler's Method using first-order DE's.

## Run
```bash
javac *.java
java Runner
```

## Roadmap
- [x] Euler's Method
- [X] 4th-Order Runge-Kutta (RK4)
- [ ] Expand Scope to 2^nd Order ODEs
