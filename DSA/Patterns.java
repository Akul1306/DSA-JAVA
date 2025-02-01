public class Patterns {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }

    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalCol;
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern15(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalCol;
            int spaceBetween = totalCol - 2;

            if (totalCol > 2) {
                for (int s = 0; s < totalSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
                for (int col = 1; col <= spaceBetween; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            } else {
                for (int s = 0; s < totalSpaces; s++) {
                    System.out.print(" ");
                }

                for (int col = 0; col < totalCol; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
//        static void pyramid(int n) {
//            for (int row = 1; row <= n; row++) {
//                int totalSpaces = n - row;
//                for (int s = 0; s < totalSpaces; s++) {
//                    System.out.print(" ");
//                }
//                int data = (int) Math.pow(11, row-1);
//                for (int col = 0; col < row; col++) {
//                        System.out.print(data);
//                    }
//                System.out.println();
//            }

    static void pyramid(int n) {
        for (int row = 0; row < n; row++) {
            // Print spaces for alignment
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            // Compute and print values in the row
            int value = 1; // First value in each row is always 1
            for (int col = 0; col <= row; col++) {
                System.out.print(value + " ");
                // Update the value using the binomial coefficient formula
                value = value * (row - col) / (col + 1);
            }
            System.out.println();
        }

    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int totalSpaces = n - totalCol;
            for (int space = 0; space < totalSpaces; space++) {
                System.out.print("  ");
            }
            for (int col = totalCol; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalCol; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern31(int n) {
        int original = n;
        n = 2*n-2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = original -  Math.min(Math.min(row,col), Math.min(n-row,n-col));
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }


    }
}






