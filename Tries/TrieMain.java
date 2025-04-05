package Tries;

import java.util.List;

public class TrieMain {

    public static void main(String[] main) {

        Trie trie = new Trie();

        trie.insertWord("apple");
        trie.insertWord("app");
        trie.insertWord("ale");
        trie.insertWord("ape");
        trie.insertWord("till");
        trie.insertWord("tie");

        List<String> allWords = trie.getAllWords();

        System.out.println("All words inserted --");
        for (String word : allWords) {
            System.out.print(word + ",");
        }
        System.out.println();
    }

}
