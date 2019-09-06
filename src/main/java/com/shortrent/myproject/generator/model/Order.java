package com.shortrent.myproject.generator.model;

import java.io.Serializable;
import java.util.Date;

/**
 * order
 * @author 
 */
public class Order implements Serializable {
    private Integer oId;

    private Integer oApplicant;

    private Integer oAcceptor;

    private Integer oHouseid;

    private Integer oAmount;

    private String oStatus;

    private Date oStarttime;

    private Date oEndtime;

    private Integer oCapitalnumber;

    private Integer oPaymentnumber;

    private String oReason;

    private String oMessage;

    private static final long serialVersionUID = 1L;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getoApplicant() {
        return oApplicant;
    }

    public void setoApplicant(Integer oApplicant) {
        this.oApplicant = oApplicant;
    }

    public Integer getoAcceptor() {
        return oAcceptor;
    }

    public void setoAcceptor(Integer oAcceptor) {
        this.oAcceptor = oAcceptor;
    }

    public Integer getoHouseid() {
        return oHouseid;
    }

    public void setoHouseid(Integer oHouseid) {
        this.oHouseid = oHouseid;
    }

    public Integer getoAmount() {
        return oAmount;
    }

    public void setoAmount(Integer oAmount) {
        this.oAmount = oAmount;
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus;
    }

    public Date getoStarttime() {
        return oStarttime;
    }

    public void setoStarttime(Date oStarttime) {
        this.oStarttime = oStarttime;
    }

    public Date getoEndtime() {
        return oEndtime;
    }

    public void setoEndtime(Date oEndtime) {
        this.oEndtime = oEndtime;
    }

    public Integer getoCapitalnumber() {
        return oCapitalnumber;
    }

    public void setoCapitalnumber(Integer oCapitalnumber) {
        this.oCapitalnumber = oCapitalnumber;
    }

    public Integer getoPaymentnumber() {
        return oPaymentnumber;
    }

    public void setoPaymentnumber(Integer oPaymentnumber) {
        this.oPaymentnumber = oPaymentnumber;
    }

    public String getoReason() {
        return oReason;
    }

    public void setoReason(String oReason) {
        this.oReason = oReason;
    }

    public String getoMessage() {
        return oMessage;
    }

    public void setoMessage(String oMessage) {
        this.oMessage = oMessage;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getoId() == null ? other.getoId() == null : this.getoId().equals(other.getoId()))
            && (this.getoApplicant() == null ? other.getoApplicant() == null : this.getoApplicant().equals(other.getoApplicant()))
            && (this.getoAcceptor() == null ? other.getoAcceptor() == null : this.getoAcceptor().equals(other.getoAcceptor()))
            && (this.getoHouseid() == null ? other.getoHouseid() == null : this.getoHouseid().equals(other.getoHouseid()))
            && (this.getoAmount() == null ? other.getoAmount() == null : this.getoAmount().equals(other.getoAmount()))
            && (this.getoStatus() == null ? other.getoStatus() == null : this.getoStatus().equals(other.getoStatus()))
            && (this.getoStarttime() == null ? other.getoStarttime() == null : this.getoStarttime().equals(other.getoStarttime()))
            && (this.getoEndtime() == null ? other.getoEndtime() == null : this.getoEndtime().equals(other.getoEndtime()))
            && (this.getoCapitalnumber() == null ? other.getoCapitalnumber() == null : this.getoCapitalnumber().equals(other.getoCapitalnumber()))
            && (this.getoPaymentnumber() == null ? other.getoPaymentnumber() == null : this.getoPaymentnumber().equals(other.getoPaymentnumber()))
            && (this.getoReason() == null ? other.getoReason() == null : this.getoReason().equals(other.getoReason()))
            && (this.getoMessage() == null ? other.getoMessage() == null : this.getoMessage().equals(other.getoMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getoId() == null) ? 0 : getoId().hashCode());
        result = prime * result + ((getoApplicant() == null) ? 0 : getoApplicant().hashCode());
        result = prime * result + ((getoAcceptor() == null) ? 0 : getoAcceptor().hashCode());
        result = prime * result + ((getoHouseid() == null) ? 0 : getoHouseid().hashCode());
        result = prime * result + ((getoAmount() == null) ? 0 : getoAmount().hashCode());
        result = prime * result + ((getoStatus() == null) ? 0 : getoStatus().hashCode());
        result = prime * result + ((getoStarttime() == null) ? 0 : getoStarttime().hashCode());
        result = prime * result + ((getoEndtime() == null) ? 0 : getoEndtime().hashCode());
        result = prime * result + ((getoCapitalnumber() == null) ? 0 : getoCapitalnumber().hashCode());
        result = prime * result + ((getoPaymentnumber() == null) ? 0 : getoPaymentnumber().hashCode());
        result = prime * result + ((getoReason() == null) ? 0 : getoReason().hashCode());
        result = prime * result + ((getoMessage() == null) ? 0 : getoMessage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oId=").append(oId);
        sb.append(", oApplicant=").append(oApplicant);
        sb.append(", oAcceptor=").append(oAcceptor);
        sb.append(", oHouseid=").append(oHouseid);
        sb.append(", oAmount=").append(oAmount);
        sb.append(", oStatus=").append(oStatus);
        sb.append(", oStarttime=").append(oStarttime);
        sb.append(", oEndtime=").append(oEndtime);
        sb.append(", oCapitalnumber=").append(oCapitalnumber);
        sb.append(", oPaymentnumber=").append(oPaymentnumber);
        sb.append(", oReason=").append(oReason);
        sb.append(", oMessage=").append(oMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}