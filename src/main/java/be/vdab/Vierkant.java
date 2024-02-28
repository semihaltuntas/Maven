package be.vdab;
/**
 * Een vierkant uit de wiskunde
 * @author Jean
 */
public class Vierkant {
    private final int zijde;
    /**
     * maakt een nieuw vierkant
     * @param zijde De zijde van het vierkant
     */
    public Vierkant(int zijde) {
        this.zijde = zijde;
    }
    /**
     * berekent de oppervlakte van het vierkant
     * @return de oppervlakte
     */
    public int oppervlakte() {
        return zijde * zijde;
    }
}
