package Журавлёв.Дмитрий.Java;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(isWinnerTicketByArray(123123));
    }
    public static boolean isWinnerTicketByArray(int numberOfTicket) {
        int temp = numberOfTicket;
        int counter = 0;
        while (temp != 0) {
            temp /= 10;
            counter++;
        }
        if (counter < 2 || counter > 8 || counter % 2 != 0) {
            return false;
        }

        int[] array = new int[counter];
        int leftSum = 0;
        int rightSum = 0;

        for (int index = 0; index < array.length; index++) {
            array[index] = numberOfTicket % 10;
            numberOfTicket /= 10;
            if (index < array.length / 2) {
                leftSum += array[index];
            } else {
                rightSum += array[index];
            }
        }
        return leftSum == rightSum;
    }
}
