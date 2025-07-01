package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.enumeration.Status;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.DemandeXRM} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DemandeXRMDTO implements Serializable {

    private Long id;

    private Status aI;

    private Status iVS;

    private PmEntrepriseDTO pmEntreprise;

    private MiseEnGestionDTO miseEnGestion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getaI() {
        return aI;
    }

    public void setaI(Status aI) {
        this.aI = aI;
    }

    public Status getiVS() {
        return iVS;
    }

    public void setiVS(Status iVS) {
        this.iVS = iVS;
    }

    public PmEntrepriseDTO getPmEntreprise() {
        return pmEntreprise;
    }

    public void setPmEntreprise(PmEntrepriseDTO pmEntreprise) {
        this.pmEntreprise = pmEntreprise;
    }

    public MiseEnGestionDTO getMiseEnGestion() {
        return miseEnGestion;
    }

    public void setMiseEnGestion(MiseEnGestionDTO miseEnGestion) {
        this.miseEnGestion = miseEnGestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DemandeXRMDTO)) {
            return false;
        }

        DemandeXRMDTO demandeXRMDTO = (DemandeXRMDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, demandeXRMDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DemandeXRMDTO{" +
            "id=" + getId() +
            ", aI='" + getaI() + "'" +
            ", iVS='" + getiVS() + "'" +
            ", pmEntreprise=" + getPmEntreprise() +
            ", miseEnGestion=" + getMiseEnGestion() +
            "}";
    }
}
