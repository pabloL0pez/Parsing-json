package paquete;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Respuesta {
    @JsonProperty("TransactionHeaderId")
    private String TransactionHeaderId;
    @JsonProperty("ReturnStatus")
    private String ReturnStatus;
    @JsonProperty("ErrorCode")
    private String ErrorCode;
    @JsonProperty("ErrorExplanation")
    private String ErrorExplanation;
    @JsonProperty("PickSlip")
    private String PickSlip;
    @JsonProperty("PickSlipLine")
    private String PickSlipLine;
    @JsonProperty("pickLines")
    private ArrayList<Pickline> picklines = new ArrayList<Pickline>();
    @JsonProperty("links")
    private ArrayList<Link> links = new ArrayList<Link>();

    public void addPickline(Pickline pickline) {
        picklines.add(pickline);
    }

    public void addLink(Link link) {
        links.add(link);
    }

    /**
     * @return the transactionHeaderId
     */
    public String getTransactionHeaderId() {
        return TransactionHeaderId;
    }

    /**
     * @param transactionHeaderId the transactionHeaderId to set
     */
    public void setTransactionHeaderId(String transactionHeaderId) {
        TransactionHeaderId = transactionHeaderId;
    }

    /**
     * @return the returnStatus
     */
    public String getReturnStatus() {
        return ReturnStatus;
    }

    /**
     * @param returnStatus the returnStatus to set
     */
    public void setReturnStatus(String returnStatus) {
        ReturnStatus = returnStatus;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return ErrorCode;
    }

    /**
     * @param errorCode the errorCode to set
     */
    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    /**
     * @return the errorExplanation
     */
    public String getErrorExplanation() {
        return ErrorExplanation;
    }

    /**
     * @param errorExplanation the errorExplanation to set
     */
    public void setErrorExplanation(String errorExplanation) {
        ErrorExplanation = errorExplanation;
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
     * @return the pickSlipLine
     */
    public String getPickSlipLine() {
        return PickSlipLine;
    }

    /**
     * @param pickSlipLine the pickSlipLine to set
     */
    public void setPickSlipLine(String pickSlipLine) {
        PickSlipLine = pickSlipLine;
    }

    /**
     * @return the picklines
     */
    public ArrayList<Pickline> getPicklines() {
        return picklines;
    }

    /**
     * @param picklines the picklines to set
     */
    public void setPicklines(ArrayList<Pickline> picklines) {
        this.picklines = picklines;
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