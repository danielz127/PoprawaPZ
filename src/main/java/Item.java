import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class Item {

    private String data; // bound
    private Double price; // boud
    public PropertyChangeListener listener;
    private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);
    //private VetoableChangeSupport mVcs = new VetoableChangeSupport(this);



    public String getData() {
        return data;
    }

    public void setData(String mw) {
        String oldData = data;
        data = mw;
        mPcs.firePropertyChange("data", oldData, mw);

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double mw) {
        Double oldPrice = price;
        price = mw;
        mPcs.firePropertyChange("price", oldPrice, mw);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        mPcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        mPcs.removePropertyChangeListener(listener);
    }

//    public void addVetoableChangeListener(VetoableChangeListener listener) {
//        mVcs.addVetoableChangeListener(listener);
//    }
//
//    public void removeVetoableChangeListener(VetoableChangeListener listener) {
//        mVcs.removeVetoableChangeListener(listener);
//    }


}
