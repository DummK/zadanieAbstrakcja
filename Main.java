abstract class Bank {    
    private double saldoKonta;
    private int correctPIN;
    
    public int getCorrectPIN() {
        return correctPIN;
    }
    
    public Bank(double saldoKonta, int correctPIN) {        
        this.saldoKonta = saldoKonta;    
        this.correctPIN = correctPIN;
        }    
    
    public boolean bankCheck(double wyplaten) {        
        System.out.println("Przyjeto prośbe o wyplate");            
        if(wyplaten > saldoKonta || wyplaten < 0) {                
            System.out.println("Transakcja anulowana");                    
                return false;
            }            
        else {                
            System.out.println("Transakcja zaakceptowana");                    
                return true;            
            }   
        }
    }
                
                
class Bankomat extends Bank {    
    public Bankomat(double saldoKonta, int correctPIN) {        
        super(saldoKonta, correctPIN);    
        }    
    
    public void insertCard() {   
            System.out.println("-----------------"); 
            System.out.println("Wprowadzono karte"); 
            System.out.println("-----------------"); 
        }    
    public void Pin(int p) {        
            System.out.println("---------------");
            if(p == getCorrectPIN()){
                System.out.println("Wprowadzono poprawny PIN");
            }
            else {
                System.out.println("Wprowadzono zły PIN\nKorzystanie z banku zostało przerwane");
                System.out.println("---------------");
                System.exit(0);
            }
            System.out.println("---------------"); 
        }    
            
    public void wyplatenGotowken(double wyplaten) {            
        System.out.println("Wyplacam " + wyplaten + "zł");    
        }    
        
    public void Danke() {        
        System.out.println("Dzieki za skorzystanie z bankomatu");    
        }
    }
    
    public class Main {
        public static void main(String[] args) {        
            Bankomat bankomat = new Bankomat(2000, 1254);        
            System.out.println("Wprowadz karte");            
                bankomat.insertCard();        
            System.out.println("Wprowadz pin");            
                bankomat.Pin(1254);        
            System.out.println("Wprowadz kwote do wyplaty");            
                double wyplata = -123;
                System.out.println("Wprowadzono " + wyplata + "zł");
            
            if(bankomat.bankCheck(wyplata)) {
                bankomat.wyplatenGotowken(wyplata);            
                }            
            bankomat.Danke();    
            }
        }