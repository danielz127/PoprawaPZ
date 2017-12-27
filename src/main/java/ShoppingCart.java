import java.beans.*;

public class ShoppingCart implements VetoableChangeListener {


    private int limit;
    private Double totalValue=0.0; // boud i cp
    public PropertyChangeListener listener;
    private PropertyChangeSupport mPcs = new PropertyChangeSupport(this);
    private VetoableChangeSupport mVcs = new VetoableChangeSupport(this);

    public ShoppingCart(int limit){
       // addPropertyChangeListener(this);
        addVetoableChangeListener(this);
        this.limit=limit;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double mw) throws PropertyVetoException {
        double oldTotalValue = totalValue;
        mVcs.fireVetoableChange("total Value", oldTotalValue, mw);
        totalValue = mw;
        mPcs.firePropertyChange("total Value", oldTotalValue, mw);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        mPcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        mPcs.removePropertyChangeListener(listener);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        mVcs.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        mVcs.removeVetoableChangeListener(listener);
    }


    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
        if((Double)evt.getNewValue()>limit)
            throw new PropertyVetoException("AAA", evt);
    }
}
