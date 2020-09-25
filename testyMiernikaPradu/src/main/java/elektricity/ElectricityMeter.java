package elektricity;
//liczył kwh
//liczyl taryfy
//ustawianie taryf i stawek
//o ile drozszy jest prad poza taryfa

//narzedzia ustawiajace taryfy i stawki

import java.util.Calendar;

public class ElectricityMeter {
    TariffProvider tp;

    private float kwh = 0;
    private int centsForKwh = 0;

    private boolean tariffon = false;
    private float kwhTariff = 0;
    private int centsForTariff = 0;

    private int elctricityTariffStartHour = 0;
    private int elctricityTariffEndHour = 0;

    public void addKwh(float kwhToAdd) {
        if (isTariffNow()) {
            kwhTariff += kwhToAdd;
        } else {
            kwh += kwhToAdd;
        }
    }

    public boolean isTariffNow() {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);

        return hour > elctricityTariffStartHour && hour < elctricityTariffEndHour;
    }

    public int getHowMoreExpensiveNormalIs() {
        return (centsForKwh * 100 / centsForTariff) - 100;
    }

    public float getKwhTariff() {
        return kwhTariff;
    }

    //@Inject

    public ElectricityMeter(TariffProvider tp) {
        this.tp = tp;
    }

    public ElectricityMeter() {
    }

    public float getKwh() {
        return kwh;
    }

    void setCentsForKwh(int centsForKwh) {
        this.centsForKwh = centsForKwh;
    }

    void setTariffon(boolean tariffon) {
        this.tariffon = tariffon;
    }

    void setCentsForTariff(int centsForTariff) {
        this.centsForTariff = centsForTariff;
    }

    void setElctricityTariffStartHour(int elctricityTariffStartHour) {
        this.elctricityTariffStartHour = elctricityTariffStartHour;
    }

    void setElctricityTariffEndHour(int elctricityTariffEndHour) {
        this.elctricityTariffEndHour = elctricityTariffEndHour;
    }

    public void reset() {
        this.kwh = 0;
        this.tariffon = false;
        this.centsForKwh = 0;
        this.kwhTariff = 0;
        this.centsForTariff = 0;
        this.elctricityTariffStartHour = 0;
        this.elctricityTariffEndHour = 0;
    }
}