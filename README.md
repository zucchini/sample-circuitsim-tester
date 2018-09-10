# sample-circuitsim-tester
This is a sample for a CircuitSim tester that uses the circuitsim-tester library. The tested file is the _alu.sim_ file.

To run the tests locally, run `./gradlew run`

To distribute tests, run `./gradlew jar` and find the jar-file in the `build/libs` directory.

## Making your own tester
1. Clone this repository
2. Remove the `.git` directory.
3. Edit the tester name in `settings.gradle`.
4. Add any tests into the `src/main/java/io/zucchini/samplecircuitsimtester/` path just like the `ANDTests.java` file. They will be discovered automatically.
5. If you want, change the groupId in `build.gradle`.
6. If you want, change the package the sources are in. Make sure to update tha main class string in `build.gradle` afterwards.
7. Run your tests and profit.
