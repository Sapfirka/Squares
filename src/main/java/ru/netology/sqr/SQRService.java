package ru.netology.sqr;


public class SQRService {
    int result = 0;
    public int calc(int min, int max) {
        for (int i = 10; i<=99; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    result++;
                }
            }
        }
        return result;
    }
}
