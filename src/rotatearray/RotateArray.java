package rotatearray;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int A[] = {3, 8, 9, 7, 6};
        int K = 3;

        // briskei to remainder tis diairesis...
        if (K > A.length) {
            K = K % A.length;
        }
        
        //ftiaxnei kainourio adeio array me length iso me to arxiko array
        int[] result = new int[A.length];

        //populates to kainourio array, mexri to K, opws prepei..
        for (int i = 0; i < K; i++) {
            result[i] = A[A.length - K + i];
        }

        int j = 0;
        // populates to kainourio array apo to K kai meta
        for (int i = K; i < A.length; i++) {
            result[i] = A[j];
            j++;
        }
        // antigrafei to kainourio array sto arxiko array
        System.arraycopy(result, 0, A, 0, A.length);

        System.out.println(Arrays.toString(A));
    }

}
