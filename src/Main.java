public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // ----------[ Menambahkan elemen awal ke linked list (2, 23, 95) ]-------------
        list.addLast(2);
        list.addLast(23);
        list.addLast(95);

        System.out.println("Linked List Awal: ");
        list.printList();

        // ----------[ Tugas 1A: Menambahkan elemen dari array (80, 7, 12) ]-------------
        int[] array = {80, 7, 12};
        list.addAll(array);

        System.out.println("Setelah menambahkan array:");
        list.printList();

        // ----------[ Tugas 1B: Update elemen dari Linked List (12 -> 70) ]-------------
        list.update(12, 70);

        System.out.println("Setelah update:");
        list.printList();

        // ----------[ Tugas 1C: Mengonversi linked list ke array ]-------------
        array = list.toArray();
        System.out.print("Array dari Linked List: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ----------[ Menghapus elemen pertama ]-------------
        list.deleteFirst();
        System.out.println("Setelah menghapus elemen pertama:");
        list.printList();

        // ----------[ Menghapus elemen terakhir ]-------------
        list.deleteLast();
        System.out.println("Setelah menghapus elemen terakhir:");
        list.printList();

        // ----------[ Menghapus elemen tengah (nilai 80) ]-------------
        list.deleteMiddle(80);
        System.out.println("Setelah menghapus elemen tengah (80):");
        list.printList();
    }
}