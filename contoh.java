import java.util.Stack;

public class contoh {
    public static void main(String[] args) throws Exception {
        Stack<String> jurusan = new Stack<>();
        jurusan.push("Tekni Informatika");
        jurusan.push("Tekni Industri");
        jurusan.push("Tekni Mesin");
        jurusan.push("Dkv");

        System.out.println("Stack item \t\t : " + jurusan);
        jurusan.pop();
        System.out.println("Stack after pop \t : " + jurusan);
        System.out.println("Pick \t\t\t : " + jurusan.peek());

        System.out.println("Check apakah kosong? t : " + jurusan.empty());
        System.out.println("Check apakah kosong? t : " + jurusan.isEmpty());

        System.out.println("Lihat index ke 2\t : " + jurusan.get(1));
        System.out.println("Lihat index pertama\t : " + jurusan.firstElement());
        System.out.println("Lihat index terakhir\t : " + jurusan.lastElement());
        jurusan.remove(1);
        System.out.println("Stack items sebelum clear \t : " + jurusan);
        jurusan.clear();
        System.out.println("Stack items setelah claer \t :" + jurusan);

        for (String j : jurusan) {
            System.out.println("Stack item \t : " + j);
        }
    }
}
