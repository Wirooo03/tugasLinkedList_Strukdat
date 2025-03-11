import java.util.ArrayList;

class SingleLinkedList {
    private Node head;

    //--------------[ Fungsi Menambahkan elemen ke akhir ]-----------------
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //--------------[ Fungsi Menambahkan elemen ke awal ]-----------------
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //--------------[ Tugas 1A: Fungsi Menambahkan elemen dari Array ]-----------------
    public void addAll(int[] array) {
        for (int value : array) {
            addLast(value);
        }
    }

    //------------[ Tugas 1B: Fungsi Update elemen dari Linked LIst ]--------------
    public void update(int dataLama, int dataBaru) {
        Node current = head;

        while (current != null) {
            if (current.data == dataLama) {
                current.data = dataBaru;
                return;
            }
            current = current.next;
        }
        System.out.println("Data " + dataLama + " tidak ditemukan di dalam linked list.");
    }

    //------------[ Tugas 1C: Mengonversi linked list ke array ]--------------
    public int[] toArray() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    //--------------[ Fungsi Mencetak Linked List ]-----------------
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null\n");
    }
}