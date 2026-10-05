package TP4;

public class Arbre_binaire<T> {

    private Node<T> racine;

    public Arbre_binaire(T data) {
        racine = new Node(data);
    }

    public void addLeft(T data) {
        racine.addLeft(data);
    }

    public void addRight(T data) {
        racine.addRight(data);
    }

    private static class Node<T> {
        T data;
        Node<T> nG, nD;

        public String prefix() {
            StringBuilder sb = new StringBuilder();
            if(data != null) {
                sb.append(data.toString());
            }
            if (nG != null) {
                sb.append(nG.prefix());
            }
            if (nD != null) {
                sb.append(nD.prefix());
            }
            return sb.toString();
        }

        public Node (T data) {
            this.data = data;
        }

        public void addLeft(T data) {
            nG = new Node(data);
        }

        public void addRight(T data) {
            nD = new Node(data);
        }

        public String toString() {
            return data.toString();
        }

    }
}

