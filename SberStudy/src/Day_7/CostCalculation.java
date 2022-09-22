package Day_7;

import java.util.Scanner;

public class CostCalculation {
    static final int DISCOUNT_FIVE = 5; // скидка в %
    static final double VALUE_ADDED_TAX = 20; // ставка НДС в %

    public static void main(String[] args) {
        double unitCost; // стоимость единицы товара
        int amount; // количество товара
        String includeVatResponse; // включение НДС в стоимость товара
        double fullCost; // полная стоимость товара

        Scanner input = new Scanner(System.in);

        // Получить стоимость единицы товара
        System.out.print("Введите стоимость единицы товара: ");
        unitCost = input.nextDouble();

        // Получить количество товара
        System.out.print("Введите количество товара: ");
        amount = input.nextInt();

        // Получить ответ на включение НДС в стоимость товара до тех пор,
        // пока не введено корректное значение
        do {
            System.out.print("Включать НДС в стоимость (y/n): ");
            includeVatResponse = input.next();
        } while (!"y".equalsIgnoreCase(includeVatResponse)
                && !"n".equalsIgnoreCase(includeVatResponse));

        // Получить полную стоимость товара по полученным данным
        if ("y".equalsIgnoreCase(includeVatResponse)) {
            // в стоимость включать НДС
            if (amount >= 10) {
                // в стоимости учитывать скидку
                fullCost = getFullCost(unitCost, amount, DISCOUNT_FIVE, VALUE_ADDED_TAX);
            } else {
                // в стоимости не учитывать скидку
                fullCost = getFullCost(unitCost, amount, VALUE_ADDED_TAX);
            }
        } else {
            // в стоимость не включать НДС
            if (amount >= 10) {
                // в стоимости учитывать скидку
                fullCost = getFullCost(unitCost, amount, DISCOUNT_FIVE);
            } else {
                // в стоимости не учитывать скидку
                fullCost = getFullCost(unitCost, amount);
            }
        }

        // Вывести результат расчета полной стоимости товара
        System.out.println("Полная стоимость товара = " + fullCost);
    }
    /**
     * Получение полной стоимости товара, без включения НДС и без скидки
     */
    public static double getFullCost(double unitCost, int amount) {
        return unitCost * amount;
    }
    /**
     * Получение полной стоимости товара, без включения НДС и с учетом скидки
     */
    public static double getFullCost(double unitCost, int amount, int discount) {
        double priceWithDiscount = unitCost * (1 - discount / 100.0) * amount; // цена со скидкой
        return Math.round(priceWithDiscount * 100) / 100.0; // округление до копейки
    }
    /**
     * Получение полной стоимости товара, включая НДС и без скидки
     */
    public static double getFullCost(double unitCost, int amount, double valueAddedTax) {
        double priceWithoutVAT = unitCost * amount; // цена без НДС
        double priceWithVAT = priceWithoutVAT * (1 + valueAddedTax / 100); // цена с НДС
        return Math.round(priceWithVAT * 100) / 100.0; // округление до копейки
    }
    /**
     * Получение полной стоимости товара, включая НДС и со скидкой
     */
    public static double getFullCost(double unitCost, int amount, int discount, double valueAddedTax) {
        double priceWithoutVAT = unitCost * (1 - discount / 100.0) * amount; // цена со скидкой
        double priceWithVAT = priceWithoutVAT * (1 + valueAddedTax / 100); // цена с НДС
        return Math.round(priceWithVAT * 100) / 100.0; // округление до копейки
    }
}
