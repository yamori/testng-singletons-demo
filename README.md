# TestNG, threads, and Singletons

The goal of this code is to prove that a Singleton instance is preserved between multiple TestNG units tests which are executed on separate threads (as defined in the testng.xml suite file).

## Command (to run testsNG tests)

`mvn install`

## Outcome

All three timestamps (in milliseconds) should be the same, showing that the Singleton was instantiated only once.

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
1494266503602 SecondTestNG
1494266503602 FirstTestNG
1494266503602 ThirdTestNG
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.379 sec
```