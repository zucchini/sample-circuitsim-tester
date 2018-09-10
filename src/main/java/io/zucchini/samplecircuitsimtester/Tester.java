package io.zucchini.samplecircuitsimtester;

import io.zucchini.circuitsimtester.launcher.TesterLauncher;

public class Tester {
    public static void main(String[] args) {
        // This is boilerplate.
        TesterLauncher.launch(Tester.class.getPackage().getName(), args);
    }
}
