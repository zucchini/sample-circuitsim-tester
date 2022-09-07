# sample-circuitsim-tester

This is a sample for a CircuitSim tester that uses the [circuitsim-tester library](https://github.com/zucchini/circuitsim-tester). The tested `.sim` files can be found in the `tester` directory. Note that this tester includes a number of Java files that each test a different `.sim`.

To build the tester jar, go to the `tester/` directory, run `./gradlew jar` and find the jar file in the `build/libs` directory.

## Making your own tester

1. Clone this repository
2. Remove the `.git` directory.
3. Edit the tester name in `tester/settings.gradle`.
4. Add a GitHub Package Registry token to `tester/gradle.properties`, as described [here](https://github.com/zucchini/circuitsim-tester#getting-started)
5. Add any tests into the `tester/src/main/java/io/zucchini/samplecircuitsimtester/` path, just like the `ANDTests.java` file. They will be discovered automatically.
6. If you want, change the `groupId` in `tester/build.gradle`.
7. If you want, change the package the sources are in. Make sure to update tha `mainClassName` string in `tester/build.gradle` afterwards.
8. Build the autograder jar with `./gradlew jar` in the `tester/` directory
9. Run the jar from the `files/` directory and check for failing test cases
10. Profit!

