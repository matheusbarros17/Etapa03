package atv02;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF{

    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {

        double farenheit = medidorFarenheit.getTemperaturaFarenheit();
        double celsius = (farenheit-32)/1.8;

        return celsius;
    }
}
