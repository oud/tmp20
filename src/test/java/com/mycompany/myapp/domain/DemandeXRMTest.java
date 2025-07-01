package com.mycompany.myapp.domain;

import static com.mycompany.myapp.domain.DemandeXRMTestSamples.*;
import static com.mycompany.myapp.domain.MiseEnGestionTestSamples.*;
import static com.mycompany.myapp.domain.PmEntrepriseTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class DemandeXRMTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(DemandeXRM.class);
        DemandeXRM demandeXRM1 = getDemandeXRMSample1();
        DemandeXRM demandeXRM2 = new DemandeXRM();
        assertThat(demandeXRM1).isNotEqualTo(demandeXRM2);

        demandeXRM2.setId(demandeXRM1.getId());
        assertThat(demandeXRM1).isEqualTo(demandeXRM2);

        demandeXRM2 = getDemandeXRMSample2();
        assertThat(demandeXRM1).isNotEqualTo(demandeXRM2);
    }

    @Test
    void pmEntrepriseTest() {
        DemandeXRM demandeXRM = getDemandeXRMRandomSampleGenerator();
        PmEntreprise pmEntrepriseBack = getPmEntrepriseRandomSampleGenerator();

        demandeXRM.setPmEntreprise(pmEntrepriseBack);
        assertThat(demandeXRM.getPmEntreprise()).isEqualTo(pmEntrepriseBack);

        demandeXRM.pmEntreprise(null);
        assertThat(demandeXRM.getPmEntreprise()).isNull();
    }

    @Test
    void miseEnGestionTest() {
        DemandeXRM demandeXRM = getDemandeXRMRandomSampleGenerator();
        MiseEnGestion miseEnGestionBack = getMiseEnGestionRandomSampleGenerator();

        demandeXRM.setMiseEnGestion(miseEnGestionBack);
        assertThat(demandeXRM.getMiseEnGestion()).isEqualTo(miseEnGestionBack);

        demandeXRM.miseEnGestion(null);
        assertThat(demandeXRM.getMiseEnGestion()).isNull();
    }
}
