public class Task2 {
    public static void main(String[] args) {
        int currentAccount = 100; // - Сумма начального счета
        int topUpAmount = 20000; // - Сумма пополнения
        int totalAmount = (topUpAmount >= 1000) ? topUpAmount / 100 + topUpAmount + currentAccount : topUpAmount + currentAccount; // - Итоговая сумма после пополнения
        //
        //                                        ------ Вариант с if else ------
        //
        //int totalAmount;
        //if (topUpAmount >= 1000) {
        //    totalAmount = topUpAmount / 100 + topUpAmount + currentAccount;
        //} else {
        //    totalAmount = topUpAmount + currentAccount;
        //}
        System.out.println(totalAmount); // - Вывод итоговой суммы счета после пополнения
    }
}
