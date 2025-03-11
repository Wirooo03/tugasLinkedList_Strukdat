public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // ----------[ Menambahkan elemen awal ke linked list ]-------------
        list.addLast(2);
        list.addLast(23);

        System.out.println("Linked List Awal: ");
        list.printList();

        // ----------[ Tugas 1A: Menambahkan elemen dari array ]-------------
        int[] array = {80, 7, 12};
        list.addAll(array);

        System.out.println("Setelah menambahkan array:");
        list.printList();

        // ----------[ Tugas 1B: Update elemen dari Linked List ]-------------
        list.update(12, 70);

        System.out.println("Setelah update:");
        list.printList();

        // ----------[ Tugas 1C: Mengonversi linked list ke array ]-------------
        array = list.toArray();
        System.out.print("Array dari Linked LIst: ");

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}