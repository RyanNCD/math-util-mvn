/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.ryan.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.ryan.mathutil.core.MathUtility;

/**
 *
 * @author Acer
 */
public class MathUtilityAdvancedTest {
    // CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    //DDT
    //  hàm trả về ,mảng 2 chiều, kiểu  WRAPPER CLASS/OBJECT
    // mảng chứa các cặp n -> expected, vd 0! -> 1
    public static Object[][] initTestData(){
        Object[][] testData = {  {0,1}, 
                                            {1, 1}, 
                                            {2, 2}, 
                                            {5, 120}, 
                                            {6, 7200}
                                            };
        
        return  testData;
    }
     @ParameterizedTest
     @MethodSource(value = "initTestData")
    public void testFactorilGivenRightArgumentReturnsWell(int n , long expecteds){
        // tham số hóa việc đưa test data vào hàm assertE()
        // biến đổi dữ liệu thành tham số cho tổng quát
        // PARAMETERIZED
        assertEquals(expecteds, MathUtility.getFactorial(n));
    }
}
//TDD vs DDT
//TDD - Test Driven Development
// Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết test case/Test Script
//tức là quá trình viết code làm app ta viết code luôn những đoạn code
//(dùng thư viện Unit TEst như Junit, TestNG, xUnit, MSTest....)

// viết code và viết test cùng vs nhau thì gọi là kĩ thuật lập trình hướng TDD

//DDT - Data Driven Testing
//là kĩ thuật bổ trợ mở rộng thêm cho kĩ thuật  TDD
//là kĩ thuật viết test code  mà ta tách riêng những bộ data test ra 1 chỗ, câu lệnh