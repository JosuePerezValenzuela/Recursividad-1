
public class Recurrente{
    public int contarIguales (int num1, int num2){
      int resp = 0;
      if(num1 == 0 || num2 == 0){
          
      }else{
         if((num1 % 10) == (num2 % 10)){
            resp = 1 + contarIguales (num1/10, num2/10);
            }else{
            resp = contarIguales (num1/10, num2/10);   
        }
      }
      return resp;
    }
}
