/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ryan.mathutil.core;
// ta sẽ clone các class.util.math của JDK mà bên trong nó chứa
// các hàm huyền thoại
public class MathUtility {
    public static final double PI =  3.1415;
    
    //hàm này tính n! = 1.2.3.4.5...n
    //thiết kế hàm này như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm, -1!, -2! BỊ CHỬI RA EXCEPTION
    // giai thừa tăng nhanh, 21! kiểu long bị tràn, chứa ko nổi
    // chỉ tính giai thừa từ 0..20
    //>= 21! BỊ CHỬI, NÉM RA EXCEPTION
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0...20, plz.");
//           
//        if (n == 0 || n == 1) 
//            return 1;
//        
//        long product  = 1; // nhân dồn 1 2 3 4 5 ...
//        for (int i = 2; i <= n ; i++)
//            product *= i;
//        
//        return product;
//        
//    }
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20, plz.");
           
        if (n == 0 || n == 1) 
            return 1;
        return n * getFactorial(n-1);
        
    }
}
// 5!= 1.2.3.4.5 = 5 x 4!
//4! = 4x 3!
//3! = 3 x 2!
//2! = 2 x 1!
//N! = N x (N-1)!