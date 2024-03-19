package l24_object_string;

public class StringBuilderExample {
    public static void main(String[] args) {
        // создаъём объект StringBuilder
        StringBuilder shoppingList;
        shoppingList = new StringBuilder();

        // добавляем пункты в список покупок
        shoppingList.append("Молоко");
        shoppingList.append(", Яйца");
        shoppingList.append(", Хлеб");
        shoppingList.append(", Шоколад.");

        // выведем итоговый список
        System.out.println("Список покупок: " + shoppingList.toString());
    }
}
