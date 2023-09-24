

public class Testit {
    public static void main (String[] args) {
        /// Motor wird erstellt
        Motor m = new Motor("Diesel",150,"killer","BMW", 2000);
        Motor m1 = new Motor("Diesel",150,"dekiller","BMW", 800);
        /// Flugzeug wird erstellt
        Flugzeug flugzeug= new Flugzeug("rot",34,1,m);
        Flugzeug flugzeug1= new Flugzeug("orange",36,2, m1);
        System.out.println(" Sollte eigentlich 0 sein. " +flugzeug.getLeistung());
        /// Die Motoren werden in eine Liste reingeschmisßen ?
        flugzeug.setMotorList(m1);
        System.out.println(" Sollte eigentlich 800 sein. " +flugzeug.getLeistung());
        flugzeug1.setMotorList(m);
        /// F16 ist auch ein FLugzeug,deshalb kann er ein Motor haben. Ich weiß nicht, wie ich die Klasse verwenden soll ...
        F16 f161 = new F16("rot",5,1, m1);

        /// Hangar wird erstellt
        Hangar ha = new Hangar(3000,3000,20,1,"grau",1,7,flugzeug);
        Hangar ha1 = new Hangar(3000,3000,20,2,"braun",1,7,flugzeug1);
        /// Landeplatz wird erstellt
        Landeplatz la = new Landeplatz(10,300,2000,"aktiv",1,7,"beton",ha);
        Landeplatz la1 = new Landeplatz(10,300,2000,"aktiv",2,7,"beton",ha1);
      //  System.out.println("Hangar1 "+ la.getId());
       // System.out.println("Hangar2 "+ la1.getId());
        /// Hangar wird ein FLugzeug zugewiesen ?
        ha.setFlugzeugslist(flugzeug1);
        ha1.setFlugzeugslist(flugzeug1);
        /// Landeplatz wird einem Hangar zugewiesen ?
        la.setHangarlist(ha);
        la1.setHangarlist(ha1);

        System.out.println(flugzeug.getLeistung());
    }
}
