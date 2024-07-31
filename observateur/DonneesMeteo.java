import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Subject {
    public float humidite;
    public float temperature;
    public float pression;
    // array
    private List<Observer> observers = new ArrayList<Observer>();

    public float gethumidite() {
        return humidite;

    }

    public float gettemperature() {
        return temperature;
    }

    public float getpression() {
        return pression;
    }

    public void SetMusures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
    }

    @Override
    public void Delete(Observer observer) {
        // TODO Auto-generated method stub
        int i = observers.indexOf(observer);
        if (i >= 0)

            observers.add(observer);
    }

    @Override
    public void attach(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);

    }

    @Override
    public void notifyAllObservers() {
        // TODO Auto-generated method stub
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidite);
        }

    }

}