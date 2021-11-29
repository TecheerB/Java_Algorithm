import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.NoSuchElementException;

class Queue<T> {

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public void enqueue(T item) {
        Node<T> t = new Node<T>(item);

        if (first == null) {
            first = last;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }

    public T dequeue() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        T data = first.data;

        first = first.next;

        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    // 노드의 관계를 저장
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    // bfs를 인자 없이 시작하면 0번부터 시작
    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) {
            Node r = stack.pop();
            for (Node n : r.adjacent) {
                // 가져온 노드의 자식들 중 스택에 들어가지 않은 노드들만 스택에 추가
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new Queue<Node>();
        queue.enqueue(root);
        root.marked = true;
        // 큐가 비어있을때까지 반복 작업
        while (!queue.isEmpty()) {
            Node r = queue.dequeue();
            // 큐에서 꺼낸 노드의 자식 노드들을 큐에 추가
            for (Node n : r.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    queue.enqueue(n);
                }
            }
            // 가지고 나온 노드는 출력
            visit(r);
        }
    }

    // 재귀 호출시 링크드리스트가 노드의 주소를 가지고 있기 때문에 재귀함수는 노드를 받는 형태가 되어야함.
    void dfsR(Node r) {
        if (r == null)
            return;
        r.marked = true;
        visit(r);
        for (Node n : r.adjacent) {
            if (n.marked == false) {
                dfsR(n);
            }
        }
    }

    // 시작 노드를 다양하게 받기 위해 배열방의 인덱스를 인자로 받는 형태 구현
    void dfsR(int index) {
        Node r = nodes[index];
        dfsR(r);
    }

    void dfsR() {
        dfsR(0);
    }

    // 방문할때 출력하는 함수
    void visit(Node n) {
        System.out.print(n.data + " ");
    }
}

/*
 * ------------------------------- 0 / 1 -- 3 7 | / | \ / | / | 5 2 -- 4 \ 6 - 8
 */
public class dfs_bfs {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        g.dfsR();

    }
}
