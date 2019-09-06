package com.shortrent.myproject.generator.model;

import java.io.Serializable;

/**
 * h_u_relate
 * @author 
 */
public class HURelate implements Serializable {
    private Integer rId;

    private Integer hId;

    private Integer uId;

    private static final long serialVersionUID = 1L;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
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
        HURelate other = (HURelate) that;
        return (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()))
            && (this.gethId() == null ? other.gethId() == null : this.gethId().equals(other.gethId()))
            && (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        result = prime * result + ((gethId() == null) ? 0 : gethId().hashCode());
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", hId=").append(hId);
        sb.append(", uId=").append(uId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}