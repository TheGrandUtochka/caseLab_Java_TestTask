package Task3_1;

import java.util.LinkedList;

public class Task3_1 {
    public static void main(String[] args) {
        LinkedList<String> notes = new LinkedList<>();

        notes.add("Do");
        notes.add("Re");
        notes.add("Mi");
        notes.add("Fa");
        notes.add("Sol");
        notes.add("La");
        notes.add("Si");

        System.out.println("Список нот:");
        for (String note : notes) {
            System.out.print(note + " ");
        }
        System.out.println();

        LinkedList<String> reversedNotes = reverse(notes, 0, new LinkedList<>());

        System.out.println("Развернутый список нот:");
        for (String note : reversedNotes) {
            System.out.print(note + " ");
        }
        System.out.println();
    }

    private static LinkedList<String> reverse(LinkedList<String> list, int index, LinkedList<String> reversedList) {
        if (index == list.size()) {
            return reversedList;
        }
        reversedList.add(0, list.get(index));
        return reverse(list, index + 1, reversedList);
    }
}
