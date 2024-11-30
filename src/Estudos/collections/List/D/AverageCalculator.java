package Estudos.collections.List.D;

import java.util.List;

public class AverageCalculator {
    public double calcAverrageArea(List<Form> forms) {
        return forms.stream().mapToDouble(Form::calcArea).average().orElse(0.0);
    }
}
