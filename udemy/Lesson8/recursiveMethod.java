package udemy.Lesson8;

public class recursiveMethod {
    public static void main(String[] args) {
        funOnePattern(3);
        funTwoPattern(3);
    }

    static void funOnePattern(int n){
        if(n>0){
            System.out.println(n);
            funOnePattern(n-1);
        }
    }


/*                                      funOnePattern(3)    
 *                                          /       \
 *                                   print 3        funOnePattern(2)
 *                                                      /        \
 *                                                 print 2      funOnePattern(1)
 *                                                                  /       \
 *                                                             print 1      funOnePattern(0)
 * 
 * out put from funOnePattern will be: 3 2 1
 * 
 */


    static void funTwoPattern(int n){
        if(n>0){
            funTwoPattern(n-1);
            System.out.println(n);
        }
    }

/*                                      funTwoPattern(3)    
 *                                          /       \
 *                              funTwoPattern(2)    (wait until next function completes and print)
 *                                 /        \
 *                   funTwoPattern(2)    (wait until next function completes and print)                  
 *                     /       \
 *     funTwoPattern(2)    (wait until next function completes and print)
 * 
 * out put from funOnePattern will be: 1 2 3
 * 
 */



}
