public class Task2 {
    public static void main(String[] args) {
        int currentAccount = 100; // - Сумма начального счета
        int TopUpAmount = 20000; // - Сумма пополнения
        int TotalAmount = (TopUpAmount >= 1000) ? TopUpAmount / 100 + TopUpAmount + currentAccount : TopUpAmount + currentAccount; // - Итоговая сумма после пополнения
        //
        //                                        ------ Вариант с if else ------
        //
        //int TotalAmount;
        //if (TopUpAmount >= 1000) {
        //    TotalAmount = TopUpAmount / 100 + TopUpAmount + currentAccount;
        //} else {
        //    TotalAmount = TopUpAmount + currentAccount;
        //}
        System.out.println(TotalAmount); // - Вывод итоговой суммы счета после пополнения
    }
}
