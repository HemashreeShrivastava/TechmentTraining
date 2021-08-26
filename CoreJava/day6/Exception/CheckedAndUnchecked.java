package com.techment.day6.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//throw new ArithmeticException("Some thing went wrong");run time exception
		//throw new FileNotFoundException("file not found"); compiled time exception
         throw new FileNotFoundException("file not found");// recommended method
         /*
         try{
         throw new FileNotFoundException("file not found");
         }
         catch(FileNotFoundExceprion e)
         {
         }
         not recommended
          */
	}

}
