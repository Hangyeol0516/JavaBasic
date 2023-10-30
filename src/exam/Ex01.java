package exam;

public class Ex01 {

    public static void main(String[] args) {
        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

        // test1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1)); // 9

        // test2
        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDifference(testArray2)); // 13

        // test3
        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDifference(testArray3)); // 3
    }
}

//파라미터로 정수 배열 intArray를 받고, 두 원소의 차이 중 가장 큰 값을 리턴해주는
//greatestDifference를 만드시오.
//리턴의 자료형 int 이다.
//만약 원소의 개수가 2개보다 작으면 0을 리턴해준다.
