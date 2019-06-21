package algoritmoadfgvx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author RAMDEZ
 */
public class AlgoritmoAdfgvx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        
        //DEFINIR APRAMETROS GLOBALES 
        Scanner sc = new Scanner(System.in);
        int contite = 0;
        FileWriter Archivo = null;
        PrintWriter Escritor = null;
        FileWriter Archivo1 = null;
        PrintWriter Escritor1 = null;

        //CREAR Y DEFINIR MATRIZ 
        char[][] Adfvgx = new char[8][8];

        Adfvgx[0][0] = ' ';
        Adfvgx[0][1] = 'A';
        Adfvgx[0][2] = 'D';
        Adfvgx[0][3] = 'F';
        Adfvgx[0][4] = 'G';
        Adfvgx[0][5] = 'V';
        Adfvgx[0][6] = 'X';
        Adfvgx[0][7] = 'Z';
        Adfvgx[1][0] = 'A';
        Adfvgx[1][1] = 'Z';
        Adfvgx[1][2] = 'E';
        Adfvgx[1][3] = 'A';
        Adfvgx[1][4] = 'T';
        Adfvgx[1][5] = 'S';
        Adfvgx[1][6] = 'O';
        Adfvgx[1][7] = 'Ù';
        Adfvgx[2][0] = 'D';
        Adfvgx[2][1] = 'N';
        Adfvgx[2][2] = 'I';
        Adfvgx[2][3] = 'H';
        Adfvgx[2][4] = 'R';
        Adfvgx[2][5] = 'L';
        Adfvgx[2][6] = 'D';
        Adfvgx[2][7] = '?';
        Adfvgx[3][0] = 'F';
        Adfvgx[3][1] = 'U';
        Adfvgx[3][2] = 'M';
        Adfvgx[3][3] = 'C';
        Adfvgx[3][4] = 'W';
        Adfvgx[3][5] = 'G';
        Adfvgx[3][6] = 'F';
        Adfvgx[3][7] = '?';
        Adfvgx[4][0] = 'G';
        Adfvgx[4][1] = 'P';
        Adfvgx[4][2] = 'Y';
        Adfvgx[4][3] = 'B';
        Adfvgx[4][4] = 'V';
        Adfvgx[4][5] = 'K';
        Adfvgx[4][6] = '_';
        Adfvgx[4][7] = '1';
        Adfvgx[5][0] = 'V';
        Adfvgx[5][1] = '%';
        Adfvgx[5][2] = '3';
        Adfvgx[5][3] = 'À';
        Adfvgx[5][4] = '«';
        Adfvgx[5][5] = 'Q';
        Adfvgx[5][6] = 'Ï';
        Adfvgx[5][7] = '2';
        Adfvgx[6][0] = 'X';
        Adfvgx[6][1] = 'J';
        Adfvgx[6][2] = '[';
        Adfvgx[6][3] = 'Ñ';
        Adfvgx[6][4] = ']';
        Adfvgx[6][5] = 'Ü';
        Adfvgx[6][6] = 'X';
        Adfvgx[6][7] = '4';
        Adfvgx[7][0] = 'Z';
        Adfvgx[7][1] = '5';
        Adfvgx[7][2] = '6';
        Adfvgx[7][3] = '7';
        Adfvgx[7][4] = '8';
        Adfvgx[7][5] = '9';
        Adfvgx[7][6] = '0';
        Adfvgx[7][7] = '?';
        
        // IMPRIMIR MATRIZ DE PRUEBA 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Adfvgx[i][j] + "\t");
            }
            System.out.println();
        }// fin primer for 

         
        char[] lineaChar = new char[49];
        String[] linealString = new String[49];
        int k = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                String acom = "";
                lineaChar[k] = Adfvgx[i][j];
                acom += Adfvgx[i][0];
                acom += Adfvgx[0][j];
                linealString[k] = acom;
                k++;

            }
        }// fin for externo

        //INGRESA PARAMETROS CO DE SI O NO 
        /*System.out.println("Ingrese el parametro a ejecutar");
        String parametro = sc.nextLine();
        System.out.println("Codificacion con Clave digite SI o NO");
        String parametro1 = sc.nextLine();
        //System.out.println(parametro);*/
        
        //args[0].equals(0)
        // PRIMER CONDICIONAL CODIFICADO
        //&& args[1].equals("NO")
        if (args[0].equals("-C")) {
            
            String nombrearchivo = args[2];
            StringBuilder MensajeCodificado = new StringBuilder();
            // CAPTURAR ARCHIVO DE MENSAJE CODIFICADO 
            try {
                //String Ruta =args[1];
                File fichero = new File(nombrearchivo);
                //System.out.println("La ruta del fichero es: " + fichero.getAbsolutePath());
                FileInputStream stream = new FileInputStream(fichero.getAbsolutePath());
                int contenido;
                char Temp1;

                // ITERACIONES DE CADA CHAR DEL ARCHIVO 
                while ((contenido = stream.read()) != -1) {
                    Temp1 = (char) contenido;
                   
                    // COMPARACION 
                    for (int i = 0; i < lineaChar.length; i++) {
                        char Temp2 = lineaChar[i];
                        if (Temp2 == Temp1) {
                            MensajeCodificado.append(linealString[i]);
                            i = lineaChar.length;
                        }
                    }
                    //contite += 1;
                    //System.out.println(contite);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            /*//IMPRESSION DE MENSAJE CODIFICADO BASICO
     
            
            if (args[0].equals("-C") && args[1].equals("-K"))
            {
                 try {
                //String archivo = args[2];
                File fichero = new File("texto.txt");
                Archivo1 = new FileWriter(fichero.getAbsolutePath());
                Escritor1 = new PrintWriter(Archivo1);
                Escritor1.print(MensajeCodificado);
                //System.out.println(contite);
                Archivo1.close();
                System.out.println("OPERACION TEMINADA CON EXITO !!");
                System.out.println("Se genero archivo en la ruta "+fichero.getAbsolutePath() );
            } catch (IOException e) {
            }
            }*/
    
            // IMPRIMIR LONGITUD DE MENSAJE CODIFICADO BASICO 
            System.out.println("esta es la longitud"+MensajeCodificado.length());
            
            
            // INICIA SEGUNDA PARTE 
               //CONDICIONAL DE CODIFIACDO CON CLAVE INICIO 
        if (args[0].equals("-C") && args[1].equals("-K")) {
            //DEFINO PARAMETROS 
            String archivo = args[2];
            String clave = args[3];
            StringBuilder MensajeCodificadoTrans = new StringBuilder();
            StringBuilder Clave = new StringBuilder();
            int tamañoMensajeCod  = 0;
            int tamañoClave = 0;
            // CAPTURAR ARCHIVO DE MENSAJE CODIFICADO Y LA CLAVE 
            try {
                String archivo2 =args[2];
                File fichero1 = new File("clave.txt");
                FileInputStream stream1 = new FileInputStream(fichero1.getAbsolutePath());       
                int contenido;

                // ITERACIONES DE CADA CHAR DEL ARCHIVO 
      
                 while ((contenido = stream1.read()) != -1) {
                            Clave.append((char) contenido);
                        }
                    //contite += 1;
                    //System.out.println(Clave);
                    //System.out.println(MensajeCodificado1);
                    tamañoMensajeCod  = MensajeCodificado.length();
                    tamañoClave = Clave.length();
                    char  ArregloClave [] = new char [Clave.length()];
                    for (int i = 0; i< Clave.length(); i++)
                    {
                        ArregloClave [i] = Clave.charAt(i);
                    }
                     int tempMod = tamañoMensajeCod;
                    
                     while (tempMod%tamañoClave != 0)
                    {
                        tempMod++;
                    }
                   // Ddefinir tamaño de la matriz con modulo para definir el arreglo de trasposicion
                    int Matriz = tempMod/tamañoClave;
                    //System.out.println(Matriz);
                    //crear matriz 
                    char arregloCod [][] = new char [Matriz][tamañoClave];
                    
                    // llenar datos en matriz 
                    
                    int cont1 = 0;
                    for (int i = 0; i < Matriz; i ++ )
                    {    
                        for (int j = 0; j <tamañoClave; j++ ){
                               if ( cont1  >= tamañoMensajeCod)
                               {          
                                   arregloCod [i][j] = '*';
                               } 
                               else {
                               arregloCod [i][j] = MensajeCodificado.charAt(cont1);
                               cont1++;
                               }
                        }  
                    }// fin for llenar matriz 
                    
                     // imprimir matriz clave  para revisar 
                    /*
                     for (int i = 0; i < tamañoClave; i++)
                     {
                         System.out.print(ArregloClave [i]+ "\t");
                     }
                     
                     // imprimir matriz codificado
                     System.out.println(); 
                     for (int i = 0; i < Matriz; i++) {
                           for (int j = 0; j < tamañoClave; j++) {
                           System.out.print(arregloCod[i][j] + "\t");
                           }
                            System.out.println();
                     }// fin primer for 
                */
             // Transposicion  burbuja de los arreglos arreglo 
                char aux; 
                char aux1; 
                String aux2= ""; 
                for(int i=1; i<=ArregloClave.length; i++) {  
                   
                     for(int j=0; j<ArregloClave.length-i; j++) { 
                 
                       if (ArregloClave[j] > ArregloClave[j+1])
                        { 
                          aux   = ArregloClave[j]; 
                          ArregloClave[j] = ArregloClave[j+1]; 
                          ArregloClave[j+1]= aux; 
                         
                          for (int r = 0; r < Matriz; r++)
                          {   
                              aux1 = arregloCod[r][j];
                              arregloCod[r][j] = arregloCod[r][j+1];
                              arregloCod[r][j+1] = aux1;
                          }
                     
                        }    
                     } 
                }
             
           // imprimir ordenamiento de prueba 
           /*
            System.out.println();
           for (int i = 0; i < tamañoClave; i++)
                     {
                         System.out.print(ArregloClave [i]+ "\t");
                     }
         
             System.out.println();
                     for (int i = 0; i < Matriz; i++) {
                           for (int j = 0; j < tamañoClave; j++) {
                           System.out.print(arregloCod[i][j] + "\t");
                           }
                            System.out.println();
                     }// fin primer for 
             */
                      //impresion de mensaje codificado traspuesto 
             
                    for (int i = 0; i < Matriz; i ++ ){    
                          for (int j = 0; j <tamañoClave; j++ ){
                         MensajeCodificadoTrans.append(arregloCod[i][j]);  
                            }  
                         }
                     
                     
                     
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            //IMPRESSION DE MENSAJE CODIFICADO TRANSPUESTO
               try {
                //String archivofinal = args[2];
                File fichero = new File(archivo + ".cif");
                Archivo1 = new FileWriter(fichero.getAbsolutePath());
                Escritor1 = new PrintWriter(Archivo1);
                Escritor1.print(MensajeCodificadoTrans);
                System.out.println(contite);
                Archivo1.close();
                System.out.println("OPERACION TEMINADA CON EXITO !!");
                System.out.println("Se genero archivo en la ruta"+fichero.getAbsolutePath() );
            } catch (IOException e) {
            }
            
            System.out.println("esta es la longitud "+MensajeCodificado.length());
            
            
            
            
            
        }// FIN CONDIICONAL TRASPOSICION       
        

            
            // FINALIZA SEGUNADA APRTE 
            
        }// FIN PRIMER CONDICIONAL
        
     


// args[0].equals("-DE")
        //SEGUNDO CONDICIONAL DECODIFICAR
        if (args[0].equals("-D")) {
            
                 if (args[0].equals("-D") && args[1].equals("-K") ){
                     String clave = args[3];
                     String archivo = args[2];
                     StringBuilder MensajeCodificadoBasico = new StringBuilder();
                     StringBuilder MensajeCodificadoTrans = new StringBuilder();
                     StringBuilder Clave = new StringBuilder();
                     StringBuilder MensajeDedificado = new StringBuilder();
                     int tamañoMensajeCod  = 0;
                     int tamañoClave = 0;

                     // CAPTURAR ARCHIVO DE MENSAJE CODIFICADO 
                     try {
                     //String Ruta =args[1];
                     File fichero = new File(archivo);
                     File fichero1 = new File(clave);
                     FileInputStream stream = new FileInputStream(fichero.getAbsolutePath());
                     FileInputStream stream1 = new FileInputStream(fichero1.getAbsolutePath());       
                     int contenido;

                     // ITERACIONES DE CADA CHAR DEL ARCHIVO 
                     while ((contenido = stream.read()) != -1) {
                              MensajeCodificadoTrans.append((char) contenido);
                        }
                     while ((contenido = stream1.read()) != -1) {
                            Clave.append((char) contenido);
                        }
                    
                    tamañoMensajeCod  = MensajeCodificadoTrans.length();
                    tamañoClave = Clave.length();
                    
                    char  ArregloClave [] = new char [Clave.length()];
                    
                    for (int i = 0; i< Clave.length(); i++)
                    {
                        ArregloClave [i] = Clave.charAt(i);
                    }
                    int tempMod = tamañoMensajeCod;
                    while (tempMod%tamañoClave != 0)
                    {
                        tempMod++;
                    }
                   // Ddefinir tamaño de la matriz con modulo
                    int Matriz = tempMod/tamañoClave;
                    //System.out.println("PRIMER IMPRESION"+ Matriz);
                    //crear matriz 
                    char arregloCod [][] = new char [Matriz][tamañoClave];
                    // llenar datos en matriz 
                    
                    int cont1 = 0;
                    for (int i = 0; i < Matriz; i ++ )
                    {    
                        for (int j = 0; j <tamañoClave; j++ ){
      
                               arregloCod [i][j] = MensajeCodificadoTrans.charAt(cont1);
                               cont1++;
                              }  
                    }// fin for llenar matriz 
                     
                    //System.out.println("este es arreglo codificado tomado nuevamente ");
                     
                   /* for (int i = 0; i < Matriz; i++) {
                           for (int j = 0; j < tamañoClave; j++) {
                           System.out.print(arregloCod[i][j] + "\t");
                           }
                            System.out.println();
                     }// fin primer for 
                    
                     // imprimir matriz clave  para revisar 
                     for (int i = 0; i < tamañoClave; i++)
                     {
                         System.out.print(ArregloClave [i]+ "\t");
                     }
                     
                   */
                     char  ArregloClaveOrd [] = new char [Clave.length()];
                     
                       for (int i = 0; i < ArregloClave.length; i++)
                     {
                         ArregloClaveOrd [i] = ArregloClave [i];
                     }
                
                    // Transposicion  Ordenamiento de claves 
             
                     char aux3; 
                     for(int i=1; i<=ArregloClaveOrd.length; i++) {  
                       for(int j=0; j<ArregloClaveOrd.length-i; j++) { 
                          if (ArregloClaveOrd[j] > ArregloClaveOrd[j+1])
                             { 
                              
                              aux3  = ArregloClaveOrd [j]; 
                              ArregloClaveOrd[j] = ArregloClaveOrd[j+1]; 
                              ArregloClaveOrd[j+1]= aux3; 
                              }    
                      } 
                    }
                     
                       //System.out.println();
                      //IMPRIMIR ARREGLO CLAVE ORDENADO
                    /*for (int i = 0; i < tamañoClave; i++)
                     {
                         System.out.print(ArregloClaveOrd [i]+ "\t");
                     }
                     // imprimir ordenamiento de prueba 
                     */
                     char arregloCod1 [][] = new char [Matriz][tamañoClave];
                     for (int i = 0; i < tamañoClave; i++)
                       {
                          for (int j = 0; j < tamañoClave; j++)
                                {
                                    if (ArregloClave [i] == ArregloClaveOrd[j])
                                    {
                                             for (int r = 0; r < Matriz; r++)
                                             {   
                                              arregloCod1 [r][i] = arregloCod [r][j];
                                             }
                                    }
                                }
                     }
         
             
                   
                      //impresion de MATRIZ codificado traspuesto 
                       //System.out.println();
                       //System.out.println("System.out.println();");
                         /*for (int i = 0; i < Matriz; i++) {
                           for (int j = 0; j < tamañoClave; j++) {
                           System.out.print(arregloCod1[i][j] + "\t");
                           }
                            System.out.println();
                     }// fin primer for 
                     */
                     
                     //System.out.println(MensajeCodificadoBasico + " AQUI LLEGUE ");
                     // GUARDAR EN ARCHIVO 
                     for (int i = 0; i < Matriz; i++) {
                           for (int j = 0; j < tamañoClave; j++) {
                           
                               if (arregloCod1[i][j] == '*')
                               {
                                   i = Matriz;
                                   j = tamañoClave;
                               }else {MensajeCodificadoBasico.append(arregloCod1[i][j]);}
                               
                           }
                            //System.out.println();
                            //System.out.println(MensajeCodificadoBasico + " AQUI LLEGUE AQUI VOY BIEN  ");
                     }// fin primer for 
                        
                     
                       for (int n = 0; n < MensajeCodificadoBasico.length() - 1; n += 2) {
                           for (int i = 0; i < 8; i++) {
                               for (int j = 0; j < 8; j++) {
                               if (MensajeCodificadoBasico.charAt(n) == Adfvgx[j][0] && MensajeCodificadoBasico.charAt(n+1) == Adfvgx[0][i]) {
                               MensajeDedificado.append(Adfvgx[j][i]);
                               }
                               }
                           }
                     }
                     
                     //System.out.println("este es el Mensaje Decodificado"+MensajeDedificado);
                     
                         } catch (FileNotFoundException ex) {
                            ex.printStackTrace();
                         } catch (IOException ex) {
                           ex.printStackTrace();} 
                   
                   if (args[0].equals("-D")) // para que solo imprima una vez esta informaicon 
                   {
                       try {
                   File fichero = new File(archivo + ".dec");
                   Archivo1 = new FileWriter(fichero.getAbsolutePath());
                   Escritor1 = new PrintWriter(Archivo1);
                   Escritor1.print(MensajeDedificado);
                   System.out.println(contite);
                   Archivo1.close();
                   System.out.println("OPERACION TEMINADA CON EXITO !!");
                   System.out.println("Se genero archivo en la ruta"+fichero.getAbsolutePath() );
                   } catch (IOException e) {
                   }
                       
                   }
                         
           }//FIN IF INTERNO DECODIFICAR 
            
        }// FIN SEGUNDO CONDICIONAL
         //args[0].equals("-HELP"
        // TERCE CONFICIONAL AYUDAS
       
        
        
        
        if (args[0].equals("HELP")) {
            
        System.out.println("" +
        "        |----------------------Algoritmo de cifrado ADFGVX    --------------------|\n" +
        "        |                      Consideraciones                                    |\n" +
        "        |     1. Tanto el mensaje escrito como la clave deben estar escritos      |\n" +
        "        |        en mayuscula sostenia y sin espacio                              |\n" +
        "        |     2. El mensaje a codificar no debe tener ningun caracter diferente   |\n" +
        "        |     a los siguientes A,B,C,D,E,F,G,H,I,J,K,L,M,N,Ñ,O,P,Q,R,S,T,V,W,X,   |\n" +
        "        |     Y,Z,1,2,3,4,5,6,7,8,9,0,[,],Ü,_,%,Ù,À,Ï,«                           |\n" +
        "        |                       Sintaxi de Ejecuacion                             |\n" + 
        "        |     1. Codificacion con clave                                           |\n" +
        "        |                                                                         |\n" +
        "        |     java -jar AlgoritmoAdfgvx.jar -c -k [Archivo.txt] [clave.txt]       |\n" +
        "        |                                                                         |\n" +
        "        |     2. Decodificacion con clave                                         |\n" +
        "        |                                                                         |\n" +
        "        |     java -jar AlgoritmoAdfgvx.jar -D -K [Archivo.txt] [clave.txt]       |\n" +
        "        |                                                                         |\n" +
        "        |                                                                         |\n" +
        "        |     Universidad Autónoma de Occidente                                   |\n" +
        "        |     Especialización en Seguridad Informática                            |\n" +
        "        |     Certificados y Firmas Digitales                                     |\n" +
        "        |     Siler Amador Donado                                                 |\n" +
        "        |     2019                                                                |\n" +
        "        |                                                                         |\n" +
        "        |     Autores: Ramiro Ramirez Hernandez ramiro.ramirez@uao.edu.co         |\n" +
        "        |              Esteban Eheverry  Duran  esteban.echeverry@uao.edu.co      |\n" +
        "        |                                                                         |\n" +
        "        |                                                                         |\n" +
        "        |     Código fuente y archivos de prueba:                                 |\n" +
        "        |     https://github.com/jaanvagu/EncryptionAlgorithms                    |\n" +
        "        |                                                                         |\n" +
        "        |-------------------------------------------------------------------------|\n"
        +"");
            

        }// FIN TERCER  CONDICIONAL

        // parametros del mensaje codificado 
    }// fin main 

}// fin clase 

