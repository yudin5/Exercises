import java.util.ArrayList;

public class Permutations {
    static ArrayList<ArrayList<String>> superList = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        //list.add("D");
        //list.add("E");
        // Вычисляем перестановки
        calc(list);
        System.out.println("Количество перестановок " + superList.size());
        System.out.println(superList);
    }

    static void calc(ArrayList<String> argList) { //
        for (int i = 0; i < argList.size(); i++) {
            // Очередная буква
            String tmp = argList.get(i);
            // Список из этой буквы
            ArrayList<String> tmpList = new ArrayList<>();
            tmpList.add(tmp);
            // Добавляем этот список к супер-списку
            superList.add(tmpList);

            // Проходимся по суперсписку
            int listNumber = superList.size() - 1;
            for (int j = 0; j < listNumber; j++) {
                ArrayList<String> newList = new ArrayList<>();
                // Создаем копию очередного списка из суперлиста
                newList.addAll(superList.get(j));
                newList.add(tmp);
                superList.add(newList);
            }
        }
    }
}
