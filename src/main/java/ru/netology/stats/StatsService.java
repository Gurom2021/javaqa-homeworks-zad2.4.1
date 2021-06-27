package ru.netology.stats;

public class StatsService {
    public long calculateSumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long calculateAverageSumSales(long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long numberMonthsSalesBelowAverage(long[] sales) {
        long averageSumSales = calculateSumSales(sales) / sales.length;
        int numberMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (averageSumSales > sales[month]) {
                numberMonth = numberMonth + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return numberMonth;
    }

    public long numberMonthsSalesAboveAverage(long[] sales) {
        long averageSumSales = calculateSumSales(sales) / sales.length;
        int numberMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (averageSumSales < sales[month]) {
                numberMonth = numberMonth + 1;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return numberMonth;
    }


}
