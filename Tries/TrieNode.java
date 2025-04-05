package Tries;

public class TrieNode {
    TrieNode[] children;
    boolean isCompleteWord;

    TrieNode() {
        this.children = new TrieNode[26];
        this.isCompleteWord = false;
    }
}
