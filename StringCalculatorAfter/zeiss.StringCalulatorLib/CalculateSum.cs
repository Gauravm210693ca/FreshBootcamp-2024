using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace zeiss.StringCalulatorLib
{
    public class CalculateSum
    {

        public static int sum(string inputString)
        {
            if (string.IsNullOrEmpty(inputString))
            {
                return 0;
            }
            return findSum(inputString);
        }
        public static int findSum(string inputString)
        {
            int value = 0;
            if (NegativeInput(inputString))
            {
                throw new ArgumentException("invalid input");
            }
            foreach (char c in inputString)
            {
                if (char.IsDigit(c))
                {
                    value += (int)Char.GetNumericValue(c);
                }
                
            }
            return value;
        }
        public static bool NegativeInput(string inputString)
        {
            if(inputString.Contains("-"))
            {
                return true;
            }
            return false;
        }
    }
}
