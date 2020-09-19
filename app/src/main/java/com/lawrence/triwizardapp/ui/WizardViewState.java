package com.lawrence.triwizardapp.ui;

import androidx.annotation.Nullable;

public interface WizardViewState {

    final class Loading implements WizardViewState {
        private final boolean isLoading;

        public Loading(boolean isLoading) {
            this.isLoading = isLoading;
        }

        public boolean isLoading() {
            return isLoading;
        }

        @Override
        public boolean equals(@Nullable Object object) {
            if (object instanceof Loading) {
                return this.isLoading == ((Loading) object).isLoading;
            }

            return false;
        }
    }

    final class Error implements WizardViewState {
        @Override
        public boolean equals(@Nullable Object object) {
            return object instanceof Error;
        }
    }

    final class MarshDashboardResponseLoaded implements WizardViewState {
        private WizardInteractor.WizardResponseData dashboardDetailsResponse;

        public MarshDashboardResponseLoaded(WizardInteractor.WizardResponseData dashboardDetailsResponse) {
            this.dashboardDetailsResponse = dashboardDetailsResponse;
        }

        public WizardInteractor.WizardResponseData getDashboardDetailsResponse() {
            return dashboardDetailsResponse;
        }
    }
}
