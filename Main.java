import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int tipo_combustible,galones_comprados;
    double subtotal1,descuento1,total;
    do{
    System.out.println("ingrese el tipo de combustible");
    System.out.println("[1]CORRIENTE   [2]EXTRA  [3]ACPM  [4]SALIR");
    tipo_combustible= teclado.nextInt();
    do{
    System.out.println("ingrese la cantidad de galones comprados");
    galones_comprados=teclado.nextInt();
    }while(galones_comprados <0 ||galones_comprados>250);

    subtotal1=subtotal(galones_comprados,tipo_combustible);
    System.out.println(String.format("%.0f",subtotal1));

    descuento1=descuento(subtotal1);
    System.out.println(String.format("%.0f",descuento1));

   total(subtotal1,descuento1);
    total=total(subtotal1,descuento1);
    comision(total,galones_comprados);
  

    }while(tipo_combustible !=4);

  }

  static double subtotal(double galones_comprados,  int tipo_combustible){
    double subtotal;
    double galon;
    if(tipo_combustible==1){
     galon=10000;
     subtotal=galones_comprados*galon;
    }
     else if(tipo_combustible==2){
     galon=12000;
     subtotal=galones_comprados*galon;
    }
     else {
     galon=8000;
     subtotal=galones_comprados*galon;
    }
  return subtotal;
    }

    static double descuento(double subtotal){
      double descuento=0;
      if(subtotal<=100000){
        descuento=0;
      }

      else if(subtotal<=250000){
        descuento=subtotal*0.02;
        
      }
      else if(subtotal>250000){
        descuento=subtotal*0.04;
    
      }
       return descuento;

      
    }
    static void total(double total,double subtotal,double descuento){
      total=subtotal-descuento;
      System.out.println(String.format("%.0f",total));
    }
    static void comision(double galones_comprados,double comision, double total){
      if(galones_comprados<=10){
        comision=0;
        System.out.println("la comision es : "+comision);
      }
      else if(galones_comprados>10 || galones_comprados<=30 ){
        comision=total*0.03;
        System.out.println("la comision es : "+comision);
      }
      else if(galones_comprados>31 || galones_comprados<=50 ){
        comision=total*0.05;
        System.out.println("la comision es : "+comision);
      }
      else if(galones_comprados>51 ){
        comision=total*0.08;
        System.out.println("la comision es : "+comision);
      }
      else {
        System.out.println("ERROR COMISION NO VALIDA");
      }


    }


  }
