package Main;

/**
 *
 * @author İLKER
 */
public class SıfırFaiz extends Banka{
    
    public SıfırFaiz(int alınan_para) {
        super(alınan_para);
        System.out.println("tüm borçlarınız için faiz oranı 0'dır... SAĞLIKLA KALIN... EVDEN ÇIKMAYIN...");
    }
    
}
