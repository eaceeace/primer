package cc.revature.exception;
// exception example

/* public class ExceptionDemo {
    public static void main(String[] args) {
      //  int num1=0;
        try {
           int   num1 = Integer.parseInt(args[0]);
            System.out.println(num1);
        }
        catch(NumberFormatException e){
           e.printStackTrace();//whenever the exception occurs the runtime of java traverse back in stack to find ou where this exception originated
        }
        catch ( ArrayIndexOutOfBoundsException e) {//try can have multiple catch block to handle multiple exception
            e.printStackTrace();
        }//or we can use
        catch (NumberFormatException e | ArrayIndexOutOfBoundsException e){// multiple exception in a single statement
            e.printStackTrace();
        }

        }
    }
}
*/