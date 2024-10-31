package minggu6;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class tipearray {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        queue.add(1);
        queue.add(2);

        mahasiswa.add("Dani");
        mahasiswa.add("Rahmat");
        mahasiswa.add("Reza");

        for (String mhs : mahasiswa) {
            System.out.print(mhs);
        }

        System.out.println("=============================");
        for (int i = 0; i < mahasiswa.size(); i++) {
            System.out.println(mahasiswa.get(i));
        }
    }
}
