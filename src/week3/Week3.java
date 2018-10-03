package week3;


public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        return (m > n || m == n) ? m : n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int j;
        j = array[0];
        int i;
        i = 1;
        for (; i < array.length; i++) {
            if (j > array[i]) j = array[i];

        }
        return j;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     *
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double values = weight / (height*height);
        return (values < 18.5) ? "Thiếu cân" : (values >= 23 && values <= 24.99) ? "Thừa cân" : (values >= 18.5 && values <= 24.99) ? "Bình thường" : "Béo phì";
    }
}
