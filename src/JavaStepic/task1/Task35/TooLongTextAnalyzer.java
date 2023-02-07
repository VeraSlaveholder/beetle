package JavaStepic.task1.Task35;

class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int limit) {
        this.maxLength = limit;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}
