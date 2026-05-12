package Q5;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int itemCount = 0;
        double totalPrice = 0;

        String orderList = "";

        while (run) {

            System.out.println("\n====== MENU CATEGORY ======");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Finish Order");

            System.out.print("Select category: ");
            int selection = scanner.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("\n--- Entree ---");
                    System.out.println("1. Tofu Burger $3.49");
                    System.out.println("2. Cajun Chicken $4.59");
                    System.out.println("3. Buffalo Wings $3.99");
                    System.out.println("4. Rainbow Fillet $2.99");
                    break;

                case 2:
                    System.out.println("\n--- Side Dish ---");
                    System.out.println("5. Rice Cracker $0.79");
                    System.out.println("6. No-Salt Fries $0.69");
                    System.out.println("7. Zucchini $1.09");
                    System.out.println("8. Brown Rice $0.59");
                    break;

                case 3:
                    System.out.println("\n--- Drink ---");
                    System.out.println("9. Cafe Mocha $1.99");
                    System.out.println("10. Cafe Latte $1.90");
                    System.out.println("11. Espresso $2.49");
                    System.out.println("12. Oolong Tea $0.99");
                    break;

                case 4:
                    run = false;
                    continue;

                default:
                    System.out.println("Invalid category");
                    continue;
            }

            System.out.print("Enter food id: ");
            int food = scanner.nextInt();

            switch (food) {

                case 1:
                    orderList += "Tofu Burger - $3.49\n";
                    totalPrice += 3.49;
                    itemCount++;
                    break;

                case 2:
                    orderList += "Cajun Chicken - $4.59\n";
                    totalPrice += 4.59;
                    itemCount++;
                    break;

                case 3:
                    orderList += "Buffalo Wings - $3.99\n";
                    totalPrice += 3.99;
                    itemCount++;
                    break;

                case 4:
                    orderList += "Rainbow Fillet - $2.99\n";
                    totalPrice += 2.99;
                    itemCount++;
                    break;

                case 5:
                    orderList += "Rice Cracker - $0.79\n";
                    totalPrice += 0.79;
                    itemCount++;
                    break;

                case 6:
                    orderList += "No-Salt Fries - $0.69\n";
                    totalPrice += 0.69;
                    itemCount++;
                    break;

                case 7:
                    orderList += "Zucchini - $1.09\n";
                    totalPrice += 1.09;
                    itemCount++;
                    break;

                case 8:
                    orderList += "Brown Rice - $0.59\n";
                    totalPrice += 0.59;
                    itemCount++;
                    break;

                case 9:
                    orderList += "Cafe Mocha - $1.99\n";
                    totalPrice += 1.99;
                    itemCount++;
                    break;

                case 10:
                    orderList += "Cafe Latte - $1.90\n";
                    totalPrice += 1.90;
                    itemCount++;
                    break;

                case 11:
                    orderList += "Espresso - $2.49\n";
                    totalPrice += 2.49;
                    itemCount++;
                    break;

                case 12:
                    orderList += "Oolong Tea - $0.99\n";
                    totalPrice += 0.99;
                    itemCount++;
                    break;

                default:
                    System.out.println("Invalid food id");
            }
        }

        System.out.println("\n======= ORDER SUMMARY =======");
        System.out.println(orderList);

        System.out.println("Total items ordered: " + itemCount);
        System.out.printf("Total price: $%.2f\n", totalPrice);

        scanner.close();
    }
}