# Observable#.prepend non-determinism

I am using the following versions:

JDK: 11
Monix: 3.1.0
Scala: 2.13.1
SBT: 1.3.10

## How to reproduce

Either `sbt run` or `sbt test` several times. 

When successful, `sbt run` produces:

```
[info] running prepend.Main
(0,0)
(1,1)
(2,2)
(3,3)
```

When unsuccessful, `sbt run` produces:

```
[info] running prepend.Main
(0,0)
(2,1)
(3,2)
```
