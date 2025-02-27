// Problem
  // The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.

public boolean love6(int a, int b) {
  if (a == 6|| b == 6){
    return true;
  }

  int sum = a + b;
  int diff = Math.abs(a - b);

  if(sum == 6 || diff == 6){
    return true;
  }

  return false;
}

