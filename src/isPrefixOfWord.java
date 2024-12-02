class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] sentenceWords=sentence.split(" ");
        for (int i = 0; i < sentenceWords.length; i++) {
            if (sentenceWords[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}