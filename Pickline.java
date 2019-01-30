package paquete;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Pickline {
    
    @JsonProperty("Locator")
    private String Locator;
    @JsonProperty("PickSlipLine")
    private String PickSlipLine;
    @JsonProperty("PickSlip")
    private String PickSlip;
    @JsonProperty("PickedQuantity")
    private String PickedQuantity;
    @JsonProperty("SecondaryPickedQuantity")
    private String SecondaryPickedQuantity;
    @JsonProperty("SubinventoryCode")
    private String SubinventoryCode;
    @JsonProperty("TransactionDate")
    private String TransactionDate;
    @JsonProperty("links")
    private ArrayList<Link> links = new ArrayList<Link>();

    public void addLink(Link link) {
        links.add(link);
    }

    /**
     * @return the locator
     */
    public String getLocator() {
        return Locator;
    }

    /**
     * @param locator the locator to set
     */
    public void setLocator(String locator) {
        Locator = locator;
    }

    /**
     * @return the lickSlipLine
     */
    public String getPickSlipLine() {
        return PickSlipLine;
    }

    /**
     * @param lickSlipLine the lickSlipLine to set
     */
    public void setPickSlipLine(String pickSlipLine) {
        PickSlipLine = pickSlipLine;
    }

    /**
     * @return the pickSlip
     */
    public String getPickSlip() {
        return PickSlip;
    }

    /**
     * @param pickSlip the pickSlip to set
     */
    public void setPickSlip(String pickSlip) {
        PickSlip = pickSlip;
    }

    /**
     * @return the pickedQuantity
     */
    public String getPickedQuantity() {
        return PickedQuantity;
    }

    /**
     * @param pickedQuantity the pickedQuantity to set
     */
    public void setPickedQuantity(String pickedQuantity) {
        PickedQuantity = pickedQuantity;
    }

    /**
     * @return the secondaryPickedQuantity
     */
    public String getSecondaryPickedQuantity() {
        return SecondaryPickedQuantity;
    }

    /**
     * @param secondaryPickedQuantity the secondaryPickedQuantity to set
     */
    public void setSecondaryPickedQuantity(String secondaryPickedQuantity) {
        SecondaryPickedQuantity = secondaryPickedQuantity;
    }

    /**
     * @return the subinventoryCode
     */
    public String getSubinventoryCode() {
        return SubinventoryCode;
    }

    /**
     * @param subinventoryCode the subinventoryCode to set
     */
    public void setSubinventoryCode(String subinventoryCode) {
        SubinventoryCode = subinventoryCode;
    }

    /**
     * @return the transactionDate
     */
    public String getTransactionDate() {
        return TransactionDate;
    }

    /**
     * @param transactionDate the transactionDate to set
     */
    public void setTransactionDate(String transactionDate) {
        TransactionDate = transactionDate;
    }

    /**
     * @return the links
     */
    public ArrayList<Link> getLinks() {
        return links;
    }

    /**
     * @param links the links to set
     */
    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }

   
}