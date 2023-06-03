package atv02;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF{

    @Override
    public double medirTemperatura() {

        double farenheit = getTemperaturaFarenheit();
        double celsius = (farenheit-32)/1.8;

        return celsius;
    }
}
