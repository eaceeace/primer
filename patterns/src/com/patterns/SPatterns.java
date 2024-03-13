package com.patterns;

public class SPatterns {
        public static void leftTriangle(int rows) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void square(int side) {
            for (int i = 1; i <= side; i++) {
                for (int j = 1; j <= side; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void rightTriangle(int rows) {
            for (int i = 1; i <= rows; i++) {
                for (int j = rows; j > i; j--) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void rightDownTriangle(int rows) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print("  ");
                }
                for (int k = i; k <= rows; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
            public static void pyramidPattern ( int rows){
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= (rows - i); j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
    public static void leftDownTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == rows || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if (i == 1 || i == side || j == 1 || j == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void downPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
