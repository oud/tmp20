package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.DemandeXRMTestSamples.*;
import static com.mycompany.myapp.domain.PmEntrepriseTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class PmEntrepriseTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(PmEntreprise.class);
        PmEntreprise pmEntreprise1 = getPmEntrepriseSample1();
        PmEntreprise pmEntreprise2 = new PmEntreprise();
        assertThat(pmEntreprise1).isNotEqualTo(pmEntreprise2);

        pmEntreprise2.setId(pmEntreprise1.getId());
        assertThat(pmEntreprise1).isEqualTo(pmEntreprise2);

        pmEntreprise2 = getPmEntrepriseSample2();
        assertThat(pmEntreprise1).isNotEqualTo(pmEntreprise2);
    }

    @Test
    void demandeXRMTest() {
        PmEntreprise pmEntreprise = getPmEntrepriseRandomSampleGenerator();
        DemandeXRM demandeXRMBack = getDemandeXRMRandomSampleGenerator();

        pmEntreprise.setDemandeXRM(demandeXRMBack);
        assertThat(pmEntreprise.getDemandeXRM()).isEqualTo(demandeXRMBack);
        assertThat(demandeXRMBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.demandeXRM(null);
        assertThat(pmEntreprise.getDemandeXRM()).isNull();
        assertThat(demandeXRMBack.getPmEntreprise()).isNull();
    }
}
