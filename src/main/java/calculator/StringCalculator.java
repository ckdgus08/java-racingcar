package calculator;

public class StringCalculator {

    private Elements elements;

    public Elements splitWithSpace(String input) {
        if (input == null || input.isEmpty())
            throw new IllegalArgumentException("입력 값은 null 이거나 빈 공백 문자가 올 수 없습니다.");
        return new Elements(input.split(" "));
    }
}
