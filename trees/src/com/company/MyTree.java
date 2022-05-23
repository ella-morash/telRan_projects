package com.company;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyTree implements Iterable<Integer> {
    Node root;

    @Override
    public Iterator<Integer> iterator() {
        return new MyTreeInOrderIterator();
    }

    class MyTreeInOrderIterator implements Iterator<Integer> {
        private Node current;
        private Stack<Node> path;

        public MyTreeInOrderIterator() {
            current=root;
            path=new Stack<>();
            while (current!=null) {
                path.push(current);
                current=current.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !path.isEmpty();
        }

        @Override
        public Integer next() {

            if (!hasNext()) throw new NoSuchElementException();

            current = path.pop();

            while (current != null) {
                if (current != null) {
                    path.push(current);
                    current = current.left;
                }
            }
            return current.value;
        }

    }


        class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {

                this.value = value;
            }
        }

        boolean insert(int value) {
            Node newNode = new Node(value);
            if (root == null) {
                root = newNode;
                return true;
            }
            Node temp = root;
            while (true) {
                if (newNode.value == temp.value) return false;
                if (newNode.value < temp.value) {
                    if (temp.left == null) {
                        temp.left = newNode;
                    } else {
                        temp = temp.left;
                    }

                } else if (newNode.value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return true;
                    } else {
                        temp = temp.right;
                    }

                }
            }

        }

        boolean contains(int value) {
            Node temp = root;
            while (temp != null) {
                if (value < temp.value) {
                    temp = temp.left;
                } else if (value > temp.value) {
                    temp = temp.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        Node find(int value) {
            Node temp = root;
            while (temp != null) {
                if (value < temp.value) {
                    temp = temp.left;
                } else if (value > temp.value) {
                    temp = temp.right;
                } else {
                    return temp;
                }
            }
            return null;
        }

        int findClosestValue(int value) {
            int closest = Integer.MAX_VALUE;
            Node currentNode = root;
            while (currentNode != null) {
                if (Math.abs(currentNode.value - value) < Math.abs(closest - value)) {
                    closest = currentNode.value;
                }
                if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else if (value > currentNode.value) {
                    currentNode = currentNode.right;
                } else {
                    break;
                }
            }
            return closest;
        }

        public List<Integer> inOrderTraverse(Node currentNode, List<Integer> array) {

            if (currentNode.left != null) {
                inOrderTraverse(currentNode.left, array);
            }
            array.add(currentNode.value);
            if (currentNode.right != null) {
                inOrderTraverse(currentNode.right, array);
            }
            return array;
        }

        public List<Integer> preOrderTraverse(Node currentNode, List<Integer> array) {

            array.add(currentNode.value);
            if (currentNode.left != null) {
                preOrderTraverse(currentNode.left, array);
            }

            if (currentNode.right != null) {
                preOrderTraverse(currentNode.right, array);
            }
            return array;
        }

        public List<Integer> postOrderTraverse(Node currentNode, List<Integer> array) {


            if (currentNode.left != null) {
                postOrderTraverse(currentNode.left, array);
            }

            if (currentNode.right != null) {
                postOrderTraverse(currentNode.right, array);
            }
            array.add(currentNode.value);
            return array;
        }


    }


