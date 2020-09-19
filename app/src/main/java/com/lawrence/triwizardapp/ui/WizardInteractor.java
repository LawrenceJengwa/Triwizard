package com.lawrence.triwizardapp.ui;

public class WizardInteractor {

    static class WizardResponseData {
        private String wizardHouse;
        private String wizardName;
        private String wizardSpell;

        public WizardResponseData(String wizardHouse, String wizardName, String wizardSpell) {
            this.wizardHouse = wizardHouse;
            this.wizardName = wizardName;
            this.wizardSpell = wizardSpell;
        }

        public String getWizardHouse() {
            return wizardHouse;
        }

        public String getWizardName() {
            return wizardName;
        }

        public String getWizardSpell() {
            return wizardSpell;
        }
    }
}
