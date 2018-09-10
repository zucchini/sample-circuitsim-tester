package io.zucchini.samplecircuitsimtester;

import io.zucchini.circuitsimtester.api.InputPin;
import io.zucchini.circuitsimtester.api.OutputPin;
import io.zucchini.circuitsimtester.api.SubcircuitPin;
import io.zucchini.circuitsimtester.api.SubcircuitTest;
import io.zucchini.circuitsimtester.extension.CircuitSimExtension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AND Gate")
@ExtendWith(CircuitSimExtension.class)
@SubcircuitTest(file="and.sim", subcircuit="AND")
public class ANDTests {
    @SubcircuitPin(bits=1)
    private InputPin a;

    @SubcircuitPin(bits=1)
    private InputPin b;

    @SubcircuitPin(bits=1)
    private OutputPin out;

    @ParameterizedTest(name="a:{0}, b:{1}, AND(a, b) → out:{2}")
    @MethodSource
    public void and(int aIn, int bIn,
                    int outOut) {
        a.set(aIn);
        b.set(bIn);
        assertEquals(outOut, out.get(), "out");
    }

    public static Stream<Arguments> and() {
        List<Arguments> args = new LinkedList<>();

        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 2; b++) {
                args.add(Arguments.of(a, b, (a == 1 && b == 1) ? 1 : 0));
            }
        }

        return args.stream();
    }
}