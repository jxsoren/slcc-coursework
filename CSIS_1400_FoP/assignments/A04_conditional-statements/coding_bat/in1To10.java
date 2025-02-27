// Problem:
  // Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode && (n <= 1 || n >= 10)){
    return true;
  }

  if(!outsideMode && n >= 1 && n <= 10){
    return true;
  }
  
  return false;
}

