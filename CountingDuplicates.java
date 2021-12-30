import java.util.*;

class Letra{
  char c;
  int rpt = 0;  
  
  Letra(char c, int rpt){
    this.c = c;
    this.rpt = rpt;
  }
}
public class CountingDuplicates {
  public Letra criaLetra(char c){
    Letra x = new Letra(c, 0);
    return x;
  }

  List<Letra> listaLetras;
  public void adicionaChar(Letra x, char[] ac){
    for(int i = 0; i < ac.length; i++){    
      if(!listaLetras.contains(ac[i])){
        Letra novaLetra = new Letra(ac[i],0);
      }else{
        listaLetras.indexOf(ac[i]);
      }
    }
  }
  /*public boolean alreadyHave(char c){
    if(listaLetras.contains(c)){
      return true;
    }else{
      return false;
    }
  }*/

  Letra[] arrayChar;
  int index;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String inp = in.nextLine();
    char[] spt = inp.toCharArray();
    CountingDuplicates cd = new CountingDuplicates();
    List<Letra> listaLetras = new ArrayList<Letra>();
    
    //percorre a palavra do input
    for(int i = 0; i < spt.length; i++){
      if(listaLetras.indexOf(spt[i]) == -1){     //se nao tiver na lista ainda, cria um obj Letra
        //cd.criaLetra(spt[i]);
        System.out.println("tem nao pae");
        listaLetras.add(cd.criaLetra(spt[i]));
      }else if((listaLetras.indexOf(spt[i]) != -1)){                           //se ja tiver, incrementa o rpt da letra
        System.out.println("JA TEM PORRA!");
        listaLetras.get(listaLetras.indexOf(spt[i])).rpt++;
      }
    }
    System.out.println(listaLetras.get(2).rpt);
    //System.out.println(spt[2]);
  }
}


