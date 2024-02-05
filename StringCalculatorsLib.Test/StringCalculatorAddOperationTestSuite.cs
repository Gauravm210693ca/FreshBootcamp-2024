using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;

namespace StringCalculatorsLib.Test
{
    [TestClass]
    public class StringCalculatorAddOperationTestSuite
    {
        [TestMethod]//TestCase
        public void GivenEmptyStringInputZeroIsExpected()
        {
            string input = "";
            int expectedResult = 0;
            int actualResult = zeiss.StringCalulatorLib.CalculateSum.sum(input);
            Assert.AreEqual(expectedResult, actualResult);
        }
        [TestMethod]
        public void GivenStringWithSingleDigitSameDigitIsExpected()
        {
            string input = "1";
            int expectedResult = 1;
            int actualResult = zeiss.StringCalulatorLib.CalculateSum.sum(input);
            Assert.AreEqual(expectedResult, actualResult);
        }
        [TestMethod]
        public void GivenStringWithMultipleDigitSumIsExpected()
        {
            string input = "1,2";
            int expectedResult = 3;
            int actualResult = zeiss.StringCalulatorLib.CalculateSum.sum(input);
            Assert.AreEqual(expectedResult, actualResult);
        }
        

    }
}
