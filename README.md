# Run tests in parallel using Gradle

In order to understand how to run unit tests in parallel, 
a tiny project is needed.

At this stage, it runs two tests in serial. The total execution time is about 6 seconds.

The goal is to understand how to run them in parallel and get an execution time of the longest running test, 
i.e. around 4 seconds.

## Building 

    ./gradlew cucumber
    
The result is

```
$./gradlew cucumber
Starting 2
Starting 1
Starting 4
Starting 3
Done 1. It took 1000ms
.Done 2. It took 2000ms
.Done 3. It took 3003ms
.Done 4. It took 4000ms
.
4 Scenarios (4 passed)
4 Steps (4 passed)
0m4.147s

BUILD SUCCESSFUL in 5s
2 actionable tasks: 2 executed
```