package Task35;

abstract class KeywordAnalyzer implements TextAnalyzer {
    public Label processText(String text) {
        String[] keywords = getKeywords();
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();
}

