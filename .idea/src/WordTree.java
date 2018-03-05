import java.io.File;
public class WordTree {

    Node root;

    public int[] wordLenFreq() {
        int[] frequencies = new int[16];
        wordLenFreq(root, frequencies);
        return frequencies;
    }

    private void wordLenFreq(Node node, int[] frequencies) {
        if (node == null) {
            return;
        } else {
            wordLenFreq(node.left, frequencies);
            frequencies[node.word.length()]++;
            wordLenFreq(node.right, frequencies);
        }
    }

    public void add(String word) {
        root = add(word, root);
    }

    private Node add(String word, Node node) {
        if (node == null) {
            return new Node(word);
        } else {
            if (word.compareTo(node.word) < 0) {
                node.left = add(word, node.left);
                return node;
            } else {
                node.right = add(word, node.right);
                return node;
            }
        }
    }  public static void main(String[] args) {
        File dataFile = new File("TreeData.txt");
        WordTree myTree= new WordTree();
        myTree.loadFromFile(dataFile);

        System.out.println("Words frequencies");
        int[] frequencies = myTree.wordLenFreq();
        for(int i = 0; i < frequencies.length; i++) {
            System.out.println("Length " + i + " : " + frequencies[i]);
        }
    }
    private class Node {
        String word;
        Node left;
        Node right;

        public Node(String word) {
            this.word = word;
        }
    }


}