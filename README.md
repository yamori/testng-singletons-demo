# TestNG, threads, and Singletons

The goal of this code is to prove that a Singleton instance is preserved between multiple TestNG units tests which are executed on separate threads (as defined in the testng.xml suite file).

## Command (to run testsNG tests)

`mvn install`

## Outcome

All three timestamps (in milliseconds) should be the same, showing that the Singleton was instantiated only once.