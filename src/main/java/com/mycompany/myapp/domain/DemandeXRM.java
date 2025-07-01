package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mycompany.myapp.domain.enumeration.Status;
import jakarta.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DemandeXRM.
 */
@Entity
@Table(name = "demande_xrm")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DemandeXRM implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "a_i")
    private Status aI;

    @Enumerated(EnumType.STRING)
    @Column(name = "i_vs")
    private Status iVS;

    @JsonIgnoreProperties(value = { "demandeXRM" }, allowSetters = true)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(unique = true)
    private PmEntreprise pmEntreprise;

    @JsonIgnoreProperties(value = { "demandeXRM" }, allowSetters = true)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(unique = true)
    private MiseEnGestion miseEnGestion;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DemandeXRM id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getaI() {
        return this.aI;
    }

    public DemandeXRM aI(Status aI) {
        this.setaI(aI);
        return this;
    }

    public void setaI(Status aI) {
        this.aI = aI;
    }

    public Status getiVS() {
        return this.iVS;
    }

    public DemandeXRM iVS(Status iVS) {
        this.setiVS(iVS);
        return this;
    }

    public void setiVS(Status iVS) {
        this.iVS = iVS;
    }

    public PmEntreprise getPmEntreprise() {
        return this.pmEntreprise;
    }

    public void setPmEntreprise(PmEntreprise pmEntreprise) {
        this.pmEntreprise = pmEntreprise;
    }

    public DemandeXRM pmEntreprise(PmEntreprise pmEntreprise) {
        this.setPmEntreprise(pmEntreprise);
        return this;
    }

    public MiseEnGestion getMiseEnGestion() {
        return this.miseEnGestion;
    }

    public void setMiseEnGestion(MiseEnGestion miseEnGestion) {
        this.miseEnGestion = miseEnGestion;
    }

    public DemandeXRM miseEnGestion(MiseEnGestion miseEnGestion) {
        this.setMiseEnGestion(miseEnGestion);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DemandeXRM)) {
            return false;
        }
        return getId() != null && getId().equals(((DemandeXRM) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DemandeXRM{" +
            "id=" + getId() +
            ", aI='" + getaI() + "'" +
            ", iVS='" + getiVS() + "'" +
            "}";
    }
}
