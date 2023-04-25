package facade.clase;

public class Restaurant {
    private MeseRestaurant meseRestaurant;
    private Ospatar ospatar;
    public Restaurant() {
        meseRestaurant=new MeseRestaurant();
        meseRestaurant.adaugaMasa(new Masa(true,true,1));
        meseRestaurant.adaugaMasa(new Masa(false,false,2));
        meseRestaurant.adaugaMasa(new Masa(true,false,3));
        meseRestaurant.adaugaMasa(new Masa(true,true,4));
        ospatar=new Ospatar();
        ospatar.debaraseaza(1);
        ospatar.debaraseaza(2);
        ospatar.debaraseaza(3);

    }

    public String verificareMasa(int nrMasa){
        if (meseRestaurant.esteLibera(nrMasa)){
            if (ospatar.esteDebarasata(nrMasa)) {
                if (meseRestaurant.suntServetelenoi(nrMasa)) {
                    return "Puteti lua loc la masa "+nrMasa;
                }else {
                    return "Masa "+nrMasa+" nu are servetele!";
                }
            }else {
                return "Masa "+nrMasa+" e libera. Asteptati sa fie debarasata!";
            }
        }else {
            return "Masa "+nrMasa+" nu e libera.";
        }
    }
}
