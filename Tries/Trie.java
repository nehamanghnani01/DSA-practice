package Tries;

import java.util.*;

class TrieNodeHelper {
    TrieNode node;
    String prefixWord;

    TrieNodeHelper(TrieNode node, String prefixWord) {
        this.node = node;
        this.prefixWord = prefixWord;
    }

}

public class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insertWord(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }

        node.isCompleteWord = true;
    }

    public List<String> getAllWords() {
        List<String> allWords = new ArrayList<>();

        Stack<TrieNodeHelper> stack = new Stack<>();
        stack.push(new TrieNodeHelper(root, ""));

        while (!stack.isEmpty()) {
            TrieNodeHelper current = stack.pop();
            TrieNode node = current.node;
            String prefix = current.prefixWord;

            if (node.isCompleteWord) {
                allWords.add(prefix);
            }

            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    char nodeChar = (char) (i + 'a');
                    stack.push(new TrieNodeHelper(node.children[i], prefix + nodeChar));
                }

            }
        }

        return allWords;
    }

}
